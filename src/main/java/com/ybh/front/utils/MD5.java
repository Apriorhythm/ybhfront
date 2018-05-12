package com.ybh.front.utils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	public String digestString(String str, String digestType) {
		MessageDigest md;
		String message = "";
		try {
			md = MessageDigest.getInstance(digestType);
			md.update(str.getBytes());
			message = byteToHex(md.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return message;
	}

	private String byteToHex(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			int num = 0xFF & bytes[i];
			if (num < 0x10) {
				sb.append("0" + Integer.toHexString(num));
			} else {
				sb.append(Integer.toHexString(num));
			}
		}
		return sb.toString();
	}

}
