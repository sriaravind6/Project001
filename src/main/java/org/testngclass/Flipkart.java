package org.testngclass;

import java.awt.AWTException;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import BaseHotelClass.*;

public class Flipkart extends FlipkartBase {
	public static void main(String[] args) throws AWTException {
		
	lanchbrowser("chrome");
	lanchUrl("https://www.flipkart.com/");
	implicitywait(10);
	escBtn();
	FlipkartpageClass f = new FlipkartpageClass();
	sendKeys(f.getProductSearch(), "iPhone");
	btnclick(f.getBtnsubmit());
	Map<Object, String> mp =new TreeMap<Object,String>();
	List <Object> L2 = new LinkedList<Object>();
	
	for (int i = 0; i < f.getListproductrate().size(); i++) {
		
		System.out.println((i+1)+")"+f.getListproduct().get(i).getText()+"======="+f.getListproductrate().get(i).getText().replace("₹",""));
		String text = f.getListproduct().get(i).getText();
		Object value = f.getListproductrate().get(i).getText().replace("₹","");
		System.out.println("");
		mp.put(value ,text);
		System.out.println();
		L2.add(mp);
		}
	for (int i = 0; i < args.length; i++) {
		
	
	System.out.println(L2.get(i));}
	System.out.println("Asscending Order Value Prise");
//	System.out.print(mp);
	System.out.println("   ");
	
//	Set <Entry<Object,String>>et=mp.entrySet();
//	for (Entry<Object, String> entry : et) {
//		System.out.println(entry);
//		System.out.println();
//		
//	}
	
	
//	for (Object entry : L2) {
//		System.out.println(entry);
//		System.out.println();
//		
//		
//		}
//	for (int i = 0; i < L2.size(); i++) {
//		System.out.println(L2.get(i));
//		
//	}
	
	quitBrowser();
	}
	
}
