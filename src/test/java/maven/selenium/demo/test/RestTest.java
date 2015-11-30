package maven.selenium.demo.test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class RestTest {

		@Test
		public void main () {
			
			String restURL_XML = "http://parabank.parasoft.com/parabank/services/bank/customers/12212/";
			String restURL_JSON = "http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=2de143494c0b295cca9337e1e96b00e0";
								   
			
			try {
				testStatusCode(restURL_XML);
				testStatusCode(restURL_JSON);
				testMimeType(restURL_XML,"application/xml");
				testMimeType(restURL_JSON,"application/json");
				testContent(restURL_XML,"lastName","Smith");
				testContentJSON(restURL_JSON,"name","London");
				
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void testStatusCode(String restURL) throws ClientProtocolException, IOException {

			HttpUriRequest request = new HttpGet(restURL);
			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
			System.out.println(httpResponse);
			
			Assert.assertEquals(HttpStatus.SC_OK,httpResponse.getStatusLine().getStatusCode());
		}
		
		
		public static void testMimeType(String restURL, String expectedMimeType) throws ClientProtocolException, IOException {
			
			HttpUriRequest request = new HttpGet(restURL);
			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
			
			System.out.println(ContentType.getOrDefault(httpResponse.getEntity()).getMimeType());
			
			Assert.assertEquals(expectedMimeType,ContentType.getOrDefault(httpResponse.getEntity()).getMimeType());
		}
		
		public static void testContent(String restURL, String element, String expectedValue) throws ClientProtocolException, IOException, SAXException, ParserConfigurationException {
			
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(restURL);
			NodeList nodelist = doc.getElementsByTagName(element);
			
			System.out.println(doc.getDocumentElement());
			System.out.println(doc.getDocumentElement().getFirstChild());
			
			System.out.println(nodelist.item(0).getTextContent());
			
			Assert.assertEquals(expectedValue,nodelist.item(0).getTextContent());		
		}
		
		public static void testContentJSON(String restURL, String element, String expectedValue) throws ClientProtocolException, IOException, SAXException, ParserConfigurationException, JSONException {

			HttpUriRequest request = new HttpGet(restURL);
			HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

			// Convert the response to a String format
			String result = EntityUtils.toString(httpResponse.getEntity());

			// Convert the result as a String to a JSON object
			JSONObject jo = new JSONObject(result);
			
			System.out.println(jo);

			Assert.assertEquals(expectedValue, jo.getString(element));

			System.out.println(jo.getString(element));
		}
}
