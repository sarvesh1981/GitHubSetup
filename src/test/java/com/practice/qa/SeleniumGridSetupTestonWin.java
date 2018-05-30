package com.practice.qa;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridSetupTestonWin {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		String hubUrl="http://10.0.0.133:4444/wd/hub";
		
		WebDriver driver=new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("http://google.com");
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle = "+pageTitle);

	}

}
