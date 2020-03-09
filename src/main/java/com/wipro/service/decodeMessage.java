package com.wipro.service;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.util.Base64;


/**
 * 
 * @author Wipro
 *
 */

@SuppressWarnings({ "deprecation", "restriction" })
public class decodeMessage {

	
	
	public static String aesDecrypt(String content) {
	    try {

	    	byte[] encrypted1 = Base64.getDecoder().decode(content);
	       
	        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
	        SecretKeySpec keyspec = new SecretKeySpec(content.getBytes(), "AES");
	        IvParameterSpec ivspec = new IvParameterSpec(content.getBytes());

	        cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);

	        String originalString = new String(cipher.doFinal(encrypted1));
	        int length = originalString.length();
	        int ch = originalString.charAt(length - 1);
	        return originalString.substring(0, length - ch);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}

}
	 