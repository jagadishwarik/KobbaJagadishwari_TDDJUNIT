package com.epam.tddjunit;

public class RemoveAInFirst2Char {
	public String remove(String str) {
		int strLength = str.length();
		String result = "";
		if(strLength > 1) {
			if(str.charAt(0) == 'A' && str.charAt(1) == 'A') {
				result =  str.substring(2,strLength);
			} else if(str.charAt(0) == 'A') {
				result =  str.substring(1,strLength);
			} else if(str.charAt(1) == 'A') {
				result += str.charAt(0);
				result += str.substring(2,strLength);
			} else {
				result = str;
			}
		} else {
			if(strLength == 1 && str.charAt(0) == 'A') {
				result = "";
			} else {
				result = str;
			}
		}
		return result;
	}

}

