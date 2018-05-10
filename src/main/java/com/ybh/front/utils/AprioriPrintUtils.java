package com.ybh.front.utils;

/*
 * These are print utils
 * Author : Apriorhythm (梁庭昌)
 * E-Mail : Apriorhythm@gmail.com
 * 
 */
public class AprioriPrintUtils {
	
	/**
	 * @param 打印
	 * @author Apriorhythm
	 */
	public void aprioriPrint(String content) {
		System.out.print(content);
	}

	/**
	 * @param 打印单行
	 * @author Apriorhythm
	 */

	public void aprioriPrintln(String content) {
		System.out.println(content);
	}

	/**
	 * @param 打印一行#
	 * @author Apriorhythm
	 */
	public void aprioriLine() {
		System.out.println("################### AprioriDebug ###################");
	}


	/**
	 * @param 打印Debug信息
	 * @author Apriorhythm
	 */
	public void aprioriPrintDebug(String content) {
		System.out.println("################### AprioriDebug ###################");
		System.out.println(content);
		System.out.println("##################* AprioriDebug *##################");
	}

}
