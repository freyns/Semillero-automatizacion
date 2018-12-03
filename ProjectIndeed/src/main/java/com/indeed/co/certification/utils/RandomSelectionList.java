package com.indeed.co.certification.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;

public class RandomSelectionList {
	
	private WebDriver driverBrowser;
	
	public RandomSelectionList(WebDriver driverBrowser) {
		this.driverBrowser = driverBrowser;
	}
	
	public WebElement randomSelection(String resultList) {
		
		List<WebElement> webElements = driverBrowser.findElement(By.xpath(resultList));
		int elementRandom = (int)(Math.random() * webElements.size());
		WebElement elementSelected = webElements.get(elementRandom);
		return elementSelected;	
	}
	
	public static RandomSelectionList workWith(WebDriver driverBrowser) {
		return new RandomSelectionList(driverBrowser);
	}
}
