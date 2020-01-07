package Test1.TestAishwarya.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
	
		return new ModelAndView("home");
	}
	@RequestMapping(value="/GetData", method= RequestMethod.POST, consumes="application/json")
	@ResponseBody
	Map<Object,Object> saveEmaster(HttpServletRequest request,HttpServletResponse response,@RequestBody String dataJsonObj) throws IOException {
		URL StoreData = new URL("https://s3.ap-south-1.amazonaws.com/ss-local-files/products.json");
	        URLConnection yc = StoreData.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader( yc.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
//	        Gson g =new Gson();
			return null;
	}
}

