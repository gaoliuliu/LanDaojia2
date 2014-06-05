package edu.fudan.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;



public class GetBGImg {
	public static String getContent(String strUrl) {
		try {
		           URL url = new URL(strUrl);
		           BufferedReader br = new BufferedReader(new InputStreamReader(url
		           .openStream(), "gb2312"));
		           String s = "";
		           StringBuffer sb = new StringBuffer("");
		           while ((s = br.readLine()) != null) {
		             // log.info(s);
		              sb.append(s + "\r\n");
		           }
		           br.close();
		           return sb.toString();
		           // return sb.toString();
		       } catch (Exception e) {
		          // log.error("HtmlªÒ»° ß∞‹£°");
		           return null;
		       }
		    }
		public static String getBingImg() 
		{
			   String url="http://www.bing.com";
			  // if(1==1)
			   //return "bc.jpg";
		       String result = GetBGImg.getContent(url);
		       try{
		    	   result = result.substring(result.indexOf("/az/hprichbg/rb"));
			       result = result.substring(0,result.indexOf(".jpg")+4);
			       result = result.replace("\\", ""); 
			       return url+result;
		       }
		       catch(Exception e)
		       {
		    	   return "bc.jpg";
		       }    
		     
		      
		      
		}
}
