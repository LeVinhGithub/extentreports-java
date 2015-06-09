/*
* Copyright (c) 2015, Anshoo Arora (Relevant Codes).  All rights reserved.
* 
* Copyrights licensed under the New BSD License.
* 
* See the accompanying LICENSE file for terms.
*/


package com.relevantcodes.extentreports.markup;

public class ExtentMarkup {
	public static String getPlaceHolder(String flag) {
		return "<!--%%" + flag.toUpperCase() + "%%-->";
	}
	
	public static String getPlaceHolder(String flag, String type, Boolean forRegex) {
		if (type == "js" && forRegex)
			return "/\\*" + flag.toUpperCase() + "\\*/";
		
		if (type == "js")
			return "/*" + flag.toUpperCase() + "*/";
			
		return "<!--%%" + flag.toUpperCase() + "%%-->";
	}
	
	public static String img(String imgPath) {
		return "<img class='report-img' data-featherlight='file:///" + imgPath + "' src='file:///" + imgPath + "' />";
	}
	
	public static String imgSingle(String imgPath) {
		return "<img class='report-img-large' data-featherlight='file:///" + imgPath + "' src='file:///" + imgPath + "' />";
	}
	
	public static String createSingleNode(String nodeName, String className, String text) {
		return "<" + nodeName + " class='" + className + "'>" + text + "</" + nodeName + ">";
	}
	
	public static String createSingleNode(String nodeName, String className) {
		return createSingleNode(nodeName, className, "");
	}
}
