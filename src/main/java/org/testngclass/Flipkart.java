package org.testngclass;

import java.awt.AWTException;

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
	for (int i = 0; i < f.getListproductrate().size(); i++) {
		System.out.println((i+1)+")"+f.getListproduct().get(i).getText()+"======="+f.getListproductrate().get(i).getText());
		System.out.println();
	}
	quitBrowser();
	}
}
