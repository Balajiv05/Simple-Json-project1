package com.infy.applicationtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infy.Pojo.Json;
import com.infy.Pojo.JsonData;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {
	
	private static Logger log = Logger.getLogger(Test.class.getName());

	static{
		 PropertyConfigurator.configure("src/commons/log4j.properties");
		 log.debug("------------------------------------Program Start-------------------------------------------");
		log.debug("com.infy.applicationtest.Test.staticblock. Dummy1 initialized");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		 log.debug("com.infy.applicationtest.Test.main(-) method");
		 String result = "";
	        
	        try {
	        	log.debug("com.infy.applicationtest.Test.try block ");
	        	
	            URL url_weather = new URL("https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22");

	            HttpURLConnection httpURLConnection = (HttpURLConnection) url_weather.openConnection();

	            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

	                InputStreamReader inputStreamReader =
	                    new InputStreamReader(httpURLConnection.getInputStream());
	                BufferedReader bufferedReader =
	                    new BufferedReader(inputStreamReader, 8192);
	                String line = null;
	                while((line = bufferedReader.readLine()) != null){
	                    result += line;
	                }
	                
	                bufferedReader.close();                
	           
	            } else {
	            	
	                System.out.println("Error in httpURLConnection.getResponseCode()");
	            }

	        }  
	        catch (Exception ex) {
	        	log.error("com.infy.applicationtest.Test.try block "+ex);
	        }
	
	        //System.out.println(result);
	        log.info(""+result);
		 ObjectMapper Mapper = new ObjectMapper();
		  //convert Json array to Array object 
		 String json=result;
	      try {
	         Json ppl = Mapper.readValue(json, Json.class);
	         //System.out.println(ppl);
	         log.info("JSON Data:"+ppl);
	         List<JsonData> list =ppl.getList();
	         list.stream().filter(obj->obj.getName().equals("Zuwarah")).collect(Collectors.toList());
	         list.forEach(System.out::println);
	      } 
	      catch(JsonProcessingException  je) {
		         je.printStackTrace();
		        
		        
		      }
	      catch(Exception e) {
	         e.printStackTrace();
	      }
	      log.debug("com.infy.json.Dummy1.main() is closed");
	  	log.debug("------------------------------------Program End-------------------------------------------");
	  	
		}
	
	      
}

