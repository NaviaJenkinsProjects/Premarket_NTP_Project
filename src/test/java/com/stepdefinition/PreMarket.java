package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;
import com.config.TestConfig;

import io.cucumber.java.en.When;

public class PreMarket extends BaseClass {

	
	

	@When("User Click The {string} Market watchlist")
	public void user_click_the_market_watchlist(String string) throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a =new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='"+string+"']//parent::button"));
		a.moveToElement(element).perform();
		element.click();
		
		Thread.sleep(2000);
	}
	
	@When("User Check The Current Stock to Market WatchList")
	public void user_check_the_current_stock_to_market_watch_list() throws InterruptedException, AWTException {
	    
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String stockNSE ="EICHERMOT";
		String stockBSE ="RELIANCE-A";
		String nifty ="NIFTY";
		String sensex ="SENSEX";
		String stockMCX ="GOLDPETAL";
		//String optinsBSE ="ICICIBANK-A";
		String optinsNSE ="TATASTEEL-EQ";
		String optinNifty ="NIFTY 50";

		
		
		LocalDate today = LocalDate.now();
        String day = today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Today is: " + day);
		
		
		if (day.equals("Monday")) {
			
			try {
				
				List<WebElement> elements = driver.findElements(By.xpath("//div[@class='tabs-panel is-active']/div/div/ul/li/div/div/span[@class='symbolsseries']"));
				
				for (WebElement webElement : elements) {
					
					webElement.click();
					Thread.sleep(500);
					WebElement element = driver.findElement(By.xpath("//button[@class='s_close md_btn1']"));
					element.click();
					Thread.sleep(500);
					
				}
				
				
			} 
			
			catch (Exception e) {
				
				System.out.println("All Ready Delete the Market Watch List to Stocks");
			}
			
			Thread.sleep(2000);
			
			WebElement element = driver.findElement(By.xpath("//input[@id='project-id']"));
			if (element.isDisplayed()) {
				
			
			element.click();
			Thread.sleep(1000);
			StringSelection selection2 = new StringSelection(stockBSE);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2, null);

            Thread.sleep(1000); // Wait 1 sec to ensure clipboard is ready

            Robot  robot1=new Robot();
            robot1.keyPress(KeyEvent.VK_CONTROL);
            robot1.keyPress(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(2000); // Small delay

			
			WebElement element2 = driver.findElement(By.xpath("(//span[contains(text(),'"+stockBSE+"')]//following-sibling::span[text()='BSE'])[1]"));
			Actions s =new Actions(driver);
		     Thread.sleep(1000); 
			s.moveToElement(element2).perform();
			
			Thread.sleep(1000);
			WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			WebElement element4 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='s_add_sym']")));
			element4.click();
			
			Thread.sleep(1000);
			WebElement element3 = driver.findElement(By.xpath("//span[@class='src_clear']"));
			element3.click();
	
			Thread.sleep(2000);
			
			WebElement element31 = driver.findElement(By.xpath("//input[@id='project-id']"));
			element31.click();
			Thread.sleep(1000);
			
			StringSelection selection21 = new StringSelection(stockNSE);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection21, null);

            Thread.sleep(1000); // Wait 1 sec to ensure clipboard is ready

           // Robot  robot1=new Robot();
            robot1.keyPress(KeyEvent.VK_CONTROL);
            robot1.keyPress(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(2000);
			
			
			WebElement element21 = driver.findElement(By.xpath("//span[contains(text(),'"+stockNSE+"')]//following-sibling::span[text()='NSE']"));
	
		     Thread.sleep(1000);
			s.moveToElement(element21).perform();
			
			Thread.sleep(1000);
			//WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			WebElement element41 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='s_add_sym']")));
			element41.click();
			
			try {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[2]")).click();
				
			} catch (Exception e) {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[1]")).click();
			}

			Thread.sleep(1000);
			
			WebElement element6 = driver.findElement(By.xpath("(//span[contains(text(),'"+stockNSE+"')]//parent::div[@class='s-box']//child::span[text()='NSE'])[1]"));
			Thread.sleep(1000);
			s.moveToElement(element6).perform();
			
			WebElement stock = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='s_add_sym']")));
			stock.click();
			
			Thread.sleep(1000);
			WebElement element11 = driver.findElement(By.xpath("//span[@class='src_clear']"));
			element11.click();
			
Thread.sleep(2000);
			
			WebElement element311 = driver.findElement(By.xpath("//input[@id='project-id']"));
			element311.click();
			Thread.sleep(1000);
			
			StringSelection selection211 = new StringSelection(nifty);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection211, null);

            Thread.sleep(1000); // Wait 1 sec to ensure clipboard is ready

           // Robot  robot1=new Robot();
            robot1.keyPress(KeyEvent.VK_CONTROL);
            robot1.keyPress(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(2000);
			
            try {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[2]")).click();
				
			} catch (Exception e) {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[1]")).click();
			}

			Thread.sleep(1000);
			
			WebElement element61 = driver.findElement(By.xpath("(//span[contains(text(),'"+nifty+"')]//parent::div[@class='s-box']//child::span[text()='NSE'])[1]"));
			Thread.sleep(1000);
			s.moveToElement(element61).perform();
			
			Thread.sleep(1000);
			//WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			WebElement element411 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='s_add_sym']")));
			element411.click();
			
			Thread.sleep(1000);
			WebElement element111 = driver.findElement(By.xpath("//span[@class='src_clear']"));
			element111.click();
			
			Thread.sleep(2000);

			
			WebElement element3111 = driver.findElement(By.xpath("//input[@id='project-id']"));
			element3111.click();
			Thread.sleep(1000);
			
			StringSelection selection2111 = new StringSelection(sensex);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2111, null);

            Thread.sleep(1000); // Wait 1 sec to ensure clipboard is ready

           // Robot  robot1=new Robot();
            robot1.keyPress(KeyEvent.VK_CONTROL);
            robot1.keyPress(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(2000);
			
            try {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[2]")).click();
				
			} catch (Exception e) {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[1]")).click();
			}

			Thread.sleep(1000);
			
			WebElement element611 = driver.findElement(By.xpath("(//span[contains(text(),'"+sensex+"')]//parent::div[@class='s-box']//child::span[text()='BSE'])[1]"));
			Thread.sleep(1000);
			s.moveToElement(element611).perform();
			
			Thread.sleep(1000);
			//WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			WebElement element4111 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='s_add_sym']")));
			element4111.click();
			
			Thread.sleep(1000);
			WebElement element1111 = driver.findElement(By.xpath("//span[@class='src_clear']"));
			element1111.click();
			
		
			
Thread.sleep(2000);

			
			WebElement element31111 = driver.findElement(By.xpath("//input[@id='project-id']"));
			element31111.click();
			Thread.sleep(1000);
			
			StringSelection selection21111 = new StringSelection(stockMCX);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection21111, null);

            Thread.sleep(1000); // Wait 1 sec to ensure clipboard is ready

           // Robot  robot1=new Robot();
            robot1.keyPress(KeyEvent.VK_CONTROL);
            robot1.keyPress(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(2000);
			
            try {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[2]")).click();
				
			} catch (Exception e) {
				
				driver.findElement(By.xpath("(//span[text()='Futures'])[1]")).click();
			}

			Thread.sleep(1000);
			
			try {
				
				WebElement element6111 = driver.findElement(By.xpath("(//span[contains(text(),'"+stockMCX+"')]//parent::div[@class='s-box']//child::span[text()='MCX'])[1]"));
				Thread.sleep(1000);
				s.moveToElement(element6111).perform();
				
			} catch (Exception e) {
				
				WebElement element6111 = driver.findElement(By.xpath("(//span[contains(text(),'"+stockMCX+"')]//parent::div[@class='s-box']//child::span[text()='MCX'])[1]"));
				Thread.sleep(1000);
				s.moveToElement(element6111).perform();
				
			}
			
			
			
			Thread.sleep(1000);
			//WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			WebElement element41111 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='s_add_sym']")));
			element41111.click();
			
			Thread.sleep(1000);
			WebElement element11111 = driver.findElement(By.xpath("//span[@class='src_clear']"));
			element11111.click();
			
			Thread.sleep(2000);
			
//============================================================
			
			WebElement element311111 = driver.findElement(By.xpath("//input[@id='project-id']"));
			element311111.click();
			Thread.sleep(1000);
			
			StringSelection selection211111 = new StringSelection(optinsNSE);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection211111, null);

            Thread.sleep(1000); // Wait 1 sec to ensure clipboard is ready

           // Robot  robot1=new Robot();
            robot1.keyPress(KeyEvent.VK_CONTROL);
            robot1.keyPress(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_V);
            robot1.keyRelease(KeyEvent.VK_CONTROL);

            Thread.sleep(2000);
			
			//driver.findElement(By.xpath("(//span[contains(text(),'"+string2+"')])[2]")).click();
			Thread.sleep(3000);
			
			Actions s11=new Actions(driver);
			WebDriverWait wait111 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
			WebElement lement11 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='"+optinsNSE+"']//following-sibling::span[text()='NSE'])[1]")));
		//WebElement element = driver.findElement(By.xpath("//span[text()='"+string+"']//following-sibling::span[text()='"+string3+"']"));
			Thread.sleep(1000);
			s11.moveToElement(lement11).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='"+optinsNSE+"']//following-sibling::span[text()='NSE']")).click();
		
			Thread.sleep(1000);
			
			WebElement fund = driver.findElement(By.xpath("//span[contains(text(),'"+optinsNSE+"')]//ancestor::div[contains(@class,'dhx_widget')]//descendant::a[contains(text(),'NSE')]//child::span"));
			String text = fund.getText();

			Thread.sleep(1000);
			
			double doubleValue = Double.parseDouble(text);

			// Convert to integer for rounding
			int intValue = (int) doubleValue;

			// Round to nearest 50, adjusting based on the fractional part
			int roundedValue;
			if (doubleValue % 20 > 0) {
			    roundedValue = ((intValue / 20) + 1) * 20; // Round up
			} else {
			    roundedValue = (intValue / 20) * 20; // Round down or stay as is
			}
			
			String purple = "\u001B[35m";

			System.out.println(purple+"Stock Current Strike Value: " + roundedValue);
		

			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='s_more md_btn1']")).click();
			Thread.sleep(3000);
			
			WebElement lement2 = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
			driver.switchTo().frame(lement2);
			
			Thread.sleep(3000);
			WebElement lement4 = driver.findElement(By.xpath("//p[text()='Please click on a ready-made strategy to load it']"));
			String text2 = lement4.getText();
			
			
			Thread.sleep(1000);
			if (text2.equalsIgnoreCase("Please click on a ready-made strategy to load it")) {
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[@class='ready_mode_close']")).click();
				
			} else {
				
				System.err.println("Ready-made strategy builder Close Button Not Working");

			}
			
			try {
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//div[text()='"+roundedValue+"']//parent::div//descendant::span)[1]")).click();
				Thread.sleep(2000);
				
				driver.switchTo().defaultContent();
				
				driver.findElement(By.xpath("(//span[text()='Dashboard']//parent::a)[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//span[text()='Clear']")).click();
				Thread.sleep(1000);
				
			}catch (Exception e){
				
				
			}
				
			Thread.sleep(2000);
			
			//============================================================
//			WebElement element3114 = driver.findElement(By.xpath("//input[@id='project-id']"));
//			element3114.click();
//			Thread.sleep(1000);
//			
//			StringSelection selection2114 = new StringSelection(optinsBSE);
//            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2114, null);
//
//            Thread.sleep(1000); // Wait 1 sec to ensure clipboard is ready
//
//           // Robot  robot1=new Robot();
//            robot1.keyPress(KeyEvent.VK_CONTROL);
//            robot1.keyPress(KeyEvent.VK_V);
//            robot1.keyRelease(KeyEvent.VK_V);
//            robot1.keyRelease(KeyEvent.VK_CONTROL);
//
//            Thread.sleep(2000);
//						Thread.sleep(3000);
//						
//						Actions s111=new Actions(driver);
//						WebDriverWait wait1111 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
//						WebElement lement111 = wait1111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='"+optinsBSE+"']//following-sibling::span[text()='BSE'])[1]")));
//					//WebElement element = driver.findElement(By.xpath("//span[text()='"+string+"']//following-sibling::span[text()='"+string3+"']"));
//						Thread.sleep(1000);
//						s111.moveToElement(lement111).perform();
//						Thread.sleep(1000);
//						driver.findElement(By.xpath("//span[text()='"+optinsBSE+"']//following-sibling::span[text()='BSE']")).click();
//					
//						Thread.sleep(1000);
//						
//						WebElement fund1 = driver.findElement(By.xpath("//span[contains(text(),'"+optinsBSE+"')]//ancestor::div[contains(@class,'dhx_widget')]//descendant::a[contains(text(),'BSE')]//child::span"));
//						String text1 = fund1.getText();
//
//						Thread.sleep(1000);
//						
//						double doubleValue1 = Double.parseDouble(text1);
//
//						// Convert to integer for rounding
//						int intValue1 = (int) doubleValue1;
//
//						// Round to nearest 50, adjusting based on the fractional part
//						int roundedValue1;
//						if (doubleValue1 % 20 > 0) {
//						    roundedValue1 = ((intValue1 / 20) + 1) * 20; // Round up
//						} else {
//						    roundedValue1 = (intValue1 / 20) * 20; // Round down or stay as is
//						}
//						
//						String purple1 = "\u001B[35m";
//
//						System.out.println(purple1+"Stock Current Strike Value: " + roundedValue1);
//					
//
//						
//						Thread.sleep(2000);
//						driver.findElement(By.xpath("//lable[text()='F&O']//parent::button")).click();
//						Thread.sleep(3000);
//						
//						WebElement lement21 = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
//						driver.switchTo().frame(lement21);
//						
//						Thread.sleep(3000);
//						WebElement lement41 = driver.findElement(By.xpath("//p[text()='Please click on a ready-made strategy to load it']"));
//						String text21 = lement41.getText();
//						
//						
//						Thread.sleep(1000);
//						if (text21.equalsIgnoreCase("Please click on a ready-made strategy to load it")) {
//							
//							Thread.sleep(1000);
//							driver.findElement(By.xpath("//span[@class='ready_mode_close']")).click();
//							
//						} else {
//							
//							System.err.println("Ready-made strategy builder Close Button Not Working");
//
//						}
//						
//						try {
//							
//							Thread.sleep(1000);
//							driver.findElement(By.xpath("(//div[text()='"+roundedValue1+"']//parent::div//descendant::span)[1]")).click();
//							Thread.sleep(2000);
//							
//							driver.switchTo().defaultContent();
//							
//							driver.findElement(By.xpath("(//span[text()='Dashboard']//parent::a)[2]")).click();
//							Thread.sleep(1000);
//							
//							driver.findElement(By.xpath("//span[text()='Clear']")).click();
//							Thread.sleep(1000);
//							
//						}catch (Exception e){
//							
//							
//						}
//			
	//=======================================================================
			
						Thread.sleep(5000);

							
							WebElement elementa = driver
							.findElement(By.xpath("(//div[@class='header-left']//descendant::span[@class='ind_syml'])[1]"));
					elementa.click();
					
					Thread.sleep(1000);
					
					
					WebElement stocka = driver
							.findElement(By.xpath("//span[text()='"+optinNifty+"']"));
					
					stocka.click();
	
					
					Thread.sleep(1000);
					
					WebElement funds = driver.findElement(By.xpath("(//span[text()='NIFTY 50']//following-sibling::div//child::span)[1]"));
					String texts = funds.getText();

					Thread.sleep(1000);
					
					double doubleValues = Double.parseDouble(texts);

					// Convert to integer for rounding
					int intValues = (int) doubleValues;

					// Round to nearest 50, adjusting based on the fractional part
					int roundedValue11;
					if (doubleValue % 50 > 0) {
					    roundedValue11 = ((intValues / 50) + 1) * 50; // Round up
					} else {
					    roundedValue11 = (intValues / 50) * 50; // Round down or stay as is
					}
					
					String purple11 = "\u001B[35m";

					System.out.println(purple11+"Nifty Current Strike Value: " + roundedValue11);
					
					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@id='project-id']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='project-id']")).sendKeys("Nifty");
					Thread.sleep(2000);

					try {
						
						driver.findElement(By.xpath("(//span[text()='Futures'])[2]")).click();
						
					} catch (Exception e) {
						
						driver.findElement(By.xpath("(//span[text()='Futures'])[1]")).click();
					}

					Thread.sleep(2000);
					
					Actions a1 = new Actions(driver);
					WebElement stock1 = driver.findElement(By.xpath("(//div[@class='s-box']//child::span[text()='NSE'])[1]"));
					Thread.sleep(1000);
					a1.moveToElement(stock1).perform();
					Thread.sleep(1000);
					a1.click(stock1).perform();
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@class='s_more md_btn1']")).click();
					Thread.sleep(3000);
					
					WebElement element211 = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
					driver.switchTo().frame(element211);
					
					Thread.sleep(3000);
					WebElement elementq = driver.findElement(By.xpath("//p[text()='Please click on a ready-made strategy to load it']"));
					String text211 = elementq.getText();
					
					
					Thread.sleep(1000);
					if (text211.equalsIgnoreCase("Please click on a ready-made strategy to load it")) {
						
						Thread.sleep(1000);
						driver.findElement(By.xpath("//span[@class='ready_mode_close']")).click();
						
					} else {
						
						System.err.println("Ready-made strategy builder Close Button Not Working");

					}
					driver.switchTo().defaultContent();
					
					Thread.sleep(2000);
					try {
						
						WebElement km = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
						driver.switchTo().frame(km);
						Thread.sleep(2000);
						
						WebElement element7 = driver.findElement(By.xpath("//select[@id='symbols_list']"));
						Select d=new Select(element7);
						d.selectByVisibleText("NIFTY - NFO");
						
						Thread.sleep(3000);
						Actions f=new Actions(driver);
						
						WebElement d1 = driver.findElement(By.xpath("(//div[text()='"+roundedValue11+"']//parent::div//descendant::span)[1]"));
						f.moveToElement(d1).perform();
						Thread.sleep(2000);
						f.click(d1).perform();
						Thread.sleep(2000);
						
						driver.switchTo().defaultContent();
						
						driver.findElement(By.xpath("(//span[text()='Dashboard']//parent::a)[2]")).click();
						Thread.sleep(1000);
						
						driver.findElement(By.xpath("//span[text()='Clear']")).click();
						Thread.sleep(1000);
						
						
						
					} catch (Exception e) {
						
						WebElement km = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
						driver.switchTo().frame(km);
						Thread.sleep(2000);
						
						Actions a=new Actions(driver);
						WebElement d = driver.findElement(By.xpath("(//div[text()='"+roundedValue11+"']//parent::div//descendant::span)[1]"));
						a.moveToElement(d).perform();
						Thread.sleep(2000);
						a.click(d).perform();
						Thread.sleep(2000);
						
						driver.switchTo().defaultContent();
						
						driver.findElement(By.xpath("(//span[text()='Dashboard']//parent::a)[2]")).click();
						Thread.sleep(1000);
						
						driver.findElement(By.xpath("//span[text()='Clear']")).click();
						Thread.sleep(1000);
						
						
					}
					
					
					
					
				    	  Thread.sleep(1000);
				    	  
				    	  WebElement nifty1 = driver.findElement(By.xpath("(//span[text()='S&P BSE SENSEX'])[1]"));
				    	  String text3 = nifty1.getText();
				    	  System.out.println(text3);
				    	  
				    	  Thread.sleep(1000);
				    	  if (text3.equalsIgnoreCase("S&P BSE SENSEX")) {
				    		  
				    		  Thread.sleep(1000);
				    		  
				    		  WebElement fund11 = driver.findElement(By.xpath("(//span[text()='S&P BSE SENSEX']//following-sibling::div//child::span)[1]"));
				      		String text11 = fund11.getText();

				      		Thread.sleep(1000);
				      		
				      		double doubleValue11 = Double.parseDouble(text11);

				      		// Convert to integer for rounding
				      		int intValue11 = (int) doubleValue11;

				      		// Round to nearest 50, adjusting based on the fractional part
				      		int pp;
				      		if (doubleValue11 % 100 > 0) {
				      		    pp = ((intValue11 / 100) + 1) * 100; // Round up
				      		} else {
				      		    pp = (intValue11 / 100) * 100; // Round down or stay as is
				      		}
				      		
				      		
				      		String op = "\u001B[35m";
				      		

				      		System.out.println(op+"Sensex Current Strike Value: " + pp);
				      		
				      		Thread.sleep(2000);

				      		driver.findElement(By.xpath("//input[@id='project-id']")).click();
				      		Thread.sleep(1000);
				      		driver.findElement(By.xpath("//input[@id='project-id']")).sendKeys("Sensex");
				      		Thread.sleep(3000);

				      		WebElement io = driver.findElement(By.xpath("//span[text()='Futures']"));
				      		io.click();
				      		Thread.sleep(2000);
				      		
				      		Actions a2 = new Actions(driver);
				      		WebElement stock2 = driver.findElement(By.xpath("(//div[@class='s-box']//child::span[text()='BSE'])[1]"));
				      		Thread.sleep(1000);
				      		a2.moveToElement(stock2).perform();
				      		Thread.sleep(1000);
				      		a2.click(stock2).perform();
				      		
				      		Thread.sleep(2000);
				      		driver.findElement(By.xpath("//button[@class='s_more md_btn1']")).click();
				      		Thread.sleep(3000);
				      		
				      		WebElement l = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
				      		driver.switchTo().frame(l);
				      		
				      		Thread.sleep(3000);
				      		WebElement p = driver.findElement(By.xpath("//p[text()='Please click on a ready-made strategy to load it']"));
				      		String text12 = p.getText();
				      		
				      		
				      		
				      		Thread.sleep(1000);
				      		if (text12.equalsIgnoreCase("Please click on a ready-made strategy to load it")) {
				      			
				      			Thread.sleep(1000);
				      			driver.findElement(By.xpath("//span[@class='ready_mode_close']")).click();
				      			
				      		} else {
				      			
				      			System.err.println("Ready-made strategy builder Close Button Not Working");

				      		}
				      		
				      		Thread.sleep(1000);
				      		Actions u = new Actions(driver);
				      		
				      		WebElement i = driver.findElement(By.xpath("(//div[text()='"+pp+"'])[1]"));
				      		
				      		Thread.sleep(1000);
				      		u.moveToElement(i).perform();
				      		Thread.sleep(1000);
				      		
				      		driver.findElement(By.xpath("(//div[text()='"+pp+"']//parent::div//child::span)[1]")).click();
				      		
				      		Thread.sleep(2000);
				      		
				      		driver.switchTo().defaultContent();
				      		
				      		driver.findElement(By.xpath("(//span[text()='Dashboard']//parent::a)[2]")).click();
				      		Thread.sleep(1000);
				      		
				      		driver.findElement(By.xpath("//span[text()='Clear']")).click();
				      		Thread.sleep(1000);
				      		
				      		Actions a3 = new Actions(driver);
				      		
				      			WebElement stoc = driver.findElement(By.xpath("//span[contains(text(),'"+pp+"')]//preceding-sibling::span[text()='BSE']"));
				      			
				      			a3.moveToElement(stoc).perform();
				      			Thread.sleep(1000);
				      			JavascriptExecutor js1 = (JavascriptExecutor) driver;
				      	       js1.executeScript("arguments[0].click();", stoc);

				      		
				      			Thread.sleep(2000);
//				      			driver.findElement(By.xpath("//button[@class='buy buyorder']"))
//				      					.click();
				    		  
							
						} else {


							WebElement element8 = driver
									.findElement(By.xpath("(//div[@class='header-left']//descendant::span[@class='ind_syml'])[1]"));
							element8.click();
							
							Thread.sleep(1000);
							
							//Actions a = new Actions(driver);
							
							WebElement stock111 = driver
									.findElement(By.xpath("//span[text()='S&P BSE SENSEX']"));
							
							stock111.click();
							
//							a.moveToElement(stock).perform();
//							Thread.sleep(1000);
//							a.click(stock).perform();
							
							Thread.sleep(1000);
				    		
				    		WebElement fund11 = driver.findElement(By.xpath("(//span[text()='S&P BSE SENSEX']//following-sibling::div//child::span)[1]"));
				    		String text11 = fund11.getText();

				    		Thread.sleep(1000);
				    		
				    		double doubleValue11 = Double.parseDouble(text11);

				    		// Convert to integer for rounding
				    		int intValue11 = (int) doubleValue11;

				    		// Round to nearest 50, adjusting based on the fractional part
				    		int roundedValue111;
				    		if (doubleValue11 % 100 > 0) {
				    		    roundedValue111 = ((intValue11 / 100) + 1) * 100; // Round up
				    		} else {
				    		    roundedValue111 = (intValue11 / 100) * 100; // Round down or stay as is
				    		}
				    		
				    		
				    		String purple111 = "\u001B[35m";
				    		

				    		System.out.println(purple111+"Sensex Current Strike Value: " + roundedValue111);
				    		
				    		Thread.sleep(2000);

				    		driver.findElement(By.xpath("//input[@id='project-id']")).click();
				    		Thread.sleep(1000);
				    		driver.findElement(By.xpath("//input[@id='project-id']")).sendKeys("Sensex");
				    		Thread.sleep(3000);

				    		try {
								
								driver.findElement(By.xpath("(//span[text()='Futures'])[2]")).click();
								
							} catch (Exception e) {
								
								driver.findElement(By.xpath("(//span[text()='Futures'])[1]")).click();
							}

				    		Thread.sleep(2000);
				    		
				    		Actions a2 = new Actions(driver);
				    		WebElement stock2 = driver.findElement(By.xpath("(//div[@class='s-box']//child::span[text()='BSE'])[1]"));
				    		Thread.sleep(1000);
				    		a2.moveToElement(stock2).perform();
				    		Thread.sleep(1000);
				    		a2.click(stock2).perform();
				    		
				    		Thread.sleep(2000);
				    		driver.findElement(By.xpath("//button[@class='s_more md_btn1']")).click();
				    		Thread.sleep(3000);
				    		
				    		WebElement v = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
				    		driver.switchTo().frame(v);
				    		
				    		Thread.sleep(3000);
				    		WebElement k = driver.findElement(By.xpath("//p[text()='Please click on a ready-made strategy to load it']"));
				    		String text12 = k.getText();
				    		
				    		
				    		
				    		Thread.sleep(1000);
				    		if (text12.equalsIgnoreCase("Please click on a ready-made strategy to load it")) {
				    			
				    			Thread.sleep(1000);
				    			driver.findElement(By.xpath("//span[@class='ready_mode_close']")).click();
				    			
				    		} else {
				    			
				    			System.err.println("Ready-made strategy builder Close Button Not Working");

				    		}
				    		
				    		Thread.sleep(1000);
				    		Actions s1 = new Actions(driver);
				    		
				    		WebElement d1 = driver.findElement(By.xpath("(//div[text()='"+roundedValue111+"'])[1]"));
				    		
				    		Thread.sleep(1000);
				    		s1.moveToElement(d1).perform();
				    		Thread.sleep(1000);
				    		
				    		driver.findElement(By.xpath("(//div[text()='"+roundedValue111+"']//parent::div//child::span)[1]")).click();
				    		
				    		Thread.sleep(2000);
				    		
				    		driver.switchTo().defaultContent();
				    		
				    		driver.findElement(By.xpath("(//span[text()='Dashboard']//parent::a)[2]")).click();
				    		Thread.sleep(1000);
				    		
				    		driver.findElement(By.xpath("//span[text()='Clear']")).click();
				    		Thread.sleep(1000);
				    		
				    		
						}
							

										
						
						
			
			
			}
			
			
		}
		
		else{
			
			System.out.println("Placing AMO Orders for Already Added Stocks");
		}
		
		
		
		Thread.sleep(2000);
		
		
	}
	
	
	@When("User Click The {string} Options in Market WatchList")
	public void user_click_the_options_in_market_watch_list(String string) throws InterruptedException {
	   
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
			
			try {
				
				List<WebElement> elements = driver.findElements(By.xpath("//div[@class='tabs-panel is-active']//ancestor::div/span[@class='symbolsseries']"));
				
				for (WebElement webElement : elements) {
					
						webElement.click();
						Thread.sleep(500);
						WebElement element = driver.findElement(By.xpath("//button[contains(@class,'"+string+"')]"));
						element.click();
						Thread.sleep(1000);
						
						
						try {
							
							
							WebElement element2 = driver.findElement(By.xpath("//button[text()='BUY']"));
							element2.click();
							
						} catch (Exception e) {
							WebElement element2 = driver.findElement(By.xpath("(//button[contains(text(),'BUY')])[1]"));
							element2.click();
						}
						
						Thread.sleep(1000);
						
						Thread.sleep(1000);
						WebElement element21 = driver.findElement(By.xpath("//button[text()='yes']"));
						element21.click();
						
						try {		
							
						Thread.sleep(1000);
						
						WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
						WebElement gh = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-dhx-id='close']")));
						gh.click();
						
					} catch (Exception e) {
						
						try {
							
							Thread.sleep(2000);
							WebDriverWait wait11 = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
							WebElement element4 = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@data-dhx-id='close'])[2]")));
							
							
							if (element4.isDisplayed()) {
								
								WebElement element41 = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@data-dhx-id='close'])[2]")));
								element41.click();
								
								Thread.sleep(2000);
								WebElement l = driver.findElement(By.xpath("//button[@data-dhx-id='close']"));
								l.click();
							}
					
							
						} catch (Exception e2) {
							
							WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
							WebElement elementj2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Insufficient Fund']")));
							
							Thread.sleep(1000);
							if (elementj2.isDisplayed()) {
								
								WebElement element3 = driver.findElement(By.xpath("(//button[@class='close-button'])[6]"));
								element3.click();
								Thread.sleep(1000);
								
								WebElement h = driver.findElement(By.xpath("//button[@data-dhx-id='close']"));
								h.click();
								
							}
						}
						
						
						
						
					}
					
					
					
				}
				
				
			} 
			
			catch (Exception e) {
				
				System.out.println("Element Not Visiable the Market Watch List to Stocks");
			}
			
	}
	
	@When("User Modify The AMO Order")
	public void user_modify_the_amo_order() throws InterruptedException {
	    
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("//span[text()='Orders']//ancestor::li[contains(@class,'left_tab_btn1')]"));
		Actions g=new Actions(driver);
		g.moveToElement(element).perform();
		
		Thread.sleep(1000);
		element.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,500);");
		
	      
			
			
			try {
				
				 WebElement i = driver.findElement(By.xpath("(//div[text()='Pending']//ancestor::div[contains(@class,'dhx_grid-row')]//descendant::span[@class='cntx_menu order_context'])[1]"));
					i.click();
					Thread.sleep(1000);   
					
					JavascriptExecutor j1 = (JavascriptExecutor) driver;
				
				WebElement elemet21 = driver.findElement(By.xpath("(//span[text()='Modify'])[1]"));
				elemet21.click();
				
				Thread.sleep(1000);  
				WebElement element2 = driver.findElement(By.xpath("//div[@class='pop-chart-cont']//descendant::span[@class='sys_vl']"));
				String text = element2.getText();
				double d1 = Double.parseDouble(text);
				 String blue = "\u001B[34m";
				System.out.println(blue+"Stock Value : "+text);
				double d=d1+5;
				
				Thread.sleep(1000);
				String s = String.valueOf(d);
				WebElement element3 = driver.findElement(By.xpath("//label[text()='Price']//following-sibling::input[@name='price']"));
				element3.click();
				Thread.sleep(1000);
				element3.clear();
				Thread.sleep(1000);
				element3.sendKeys(s);
				
				Thread.sleep(1000);
				
				WebElement element4 = driver.findElement(By.xpath("(//button[text()='Update'])[1]"));
				j1.executeScript("arguments[0].click();", element4);
				
	            Thread.sleep(1000);	
				WebElement element41 = driver.findElement(By.xpath("//button[text()='yes']"));
				j1.executeScript("arguments[0].click();", element41);
			
				
			} catch (Exception e) {
				
				 js.executeScript("window.scrollBy(0,500);");
				 js.executeScript("window.scrollBy(0,500);");
				 
				 WebElement i = driver.findElement(By.xpath("(//div[text()='Pending']//ancestor::div[contains(@class,'dhx_grid-row')]//descendant::span[@class='cntx_menu order_context'])[1]"));
					g.moveToElement(i).perform();
					Thread.sleep(1000); 
					g.click(i).perform();
					Thread.sleep(1000);   
					
					JavascriptExecutor j1 = (JavascriptExecutor) driver;
				
				WebElement elemet21 = driver.findElement(By.xpath("(//span[text()='Modify'])[1]"));
				g.moveToElement(elemet21).perform();
				g.click(elemet21).perform();
			      
			      Thread.sleep(1000);  
					WebElement element2 = driver.findElement(By.xpath("//div[@class='pop-chart-cont']//descendant::span[@class='sys_vl']"));
					String text = element2.getText();
					double d1 = Double.parseDouble(text);
					 String blue = "\u001B[34m";
					System.out.println(blue+"Stock Value : "+text);
					double d=d1+5;
					
					Thread.sleep(1000);
					String s = String.valueOf(d);
					WebElement element3 = driver.findElement(By.xpath("//label[text()='Price']//following-sibling::input[@name='price']"));
					element3.click();
					Thread.sleep(1000);
					element3.clear();
					Thread.sleep(1000);
					element3.sendKeys(s);
					
					Thread.sleep(1000);
					
					WebElement element4 = driver.findElement(By.xpath("(//button[text()='Update'])[1]"));
					j1.executeScript("arguments[0].click();", element4);
					
		            Thread.sleep(1000);	
					WebElement element41 = driver.findElement(By.xpath("//button[text()='yes']"));
					j1.executeScript("arguments[0].click();", element41);
			      
			}
	       
			
			
			
			
			Thread.sleep(2000);
			
			
	}
	
	@When("User All Type to Cancel The All AMO Orders")
	public void user_all_type_to_cancel_the_all_amo_orders() throws InterruptedException {
	    
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Actions g=new Actions(driver);   
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("(//div[text()='Pending']//ancestor::div[contains(@class,'dhx_grid-row')]//descendant::input[@class='custom_div orders_checkbox'])[2]"));
		g.moveToElement(element2).perform();
		g.click(element2).perform();
		Thread.sleep(1000);
		
		WebElement elemet2 = driver.findElement(By.xpath("//span[text()='Cancel']"));
		g.moveToElement(elemet2).perform();
		g.click(elemet2).perform();
		
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(By.xpath("//button[text()='yes']"));
		element3.click();
		
		Thread.sleep(3000);
		WebElement elemen2 = driver.findElement(By.xpath("(//div[text()='Pending']//ancestor::div[contains(@class,'dhx_grid-row')]//descendant::span[@class='cntx_menu order_context'])[2]"));
		g.moveToElement(elemen2).perform();
		g.click(elemen2).perform();
		Thread.sleep(1000);
		
		WebElement elemet21 = driver.findElement(By.xpath("//span[text()='Cancel']//ancestor::span[contains(@class,'dhx_menu-button__block')]"));
		g.moveToElement(elemet21).perform();
		g.click(elemet21).perform();
		
		Thread.sleep(1000);
		WebElement elemet = driver.findElement(By.xpath("//button[text()='yes']"));
		elemet.click();
		
		Thread.sleep(3000);
		WebElement elemet1 = driver.findElement(By.xpath("//span[text()='Cancel All']"));
		g.moveToElement(elemet1).perform();
		Thread.sleep(1000);
		g.click(elemet1).perform();
		
		Thread.sleep(1000);
		WebElement elemet11 = driver.findElement(By.xpath("//button[text()='yes']"));
		elemet11.click();
		
		Thread.sleep(2000);
		
		
	}
	
	@When("User click the search box")
	public void user_click_the_search_box() throws InterruptedException {
		Thread.sleep(4000);

		 driver.findElement(By.xpath("//input[@id='project-id']")).click();
		Thread.sleep(3000);
	}

	@When("User Search any {string} Script")
	public void user_search_any_script(String string) throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='project-id']")).sendKeys(string);
	}

	@When("User Mouse Over and Add a Script {string}")
	public void user_mouse_over_and_add_a_script(String string) throws InterruptedException {
		Thread.sleep(3000);

		// //tagname[contains(text(), 'value')]
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+string+"')]//ancestor::li"));

		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(7000);

		driver.findElement(By.xpath("//span[contains(text(),'" + string + "')]//ancestor::li//descendant::span[@class='s_add_sym']")).click();
	}
	
	
	@When("User POP Up Message Appear Verify POP UP")
	public void user_pop_up_message_appear_verify_pop_up() throws InterruptedException {

//		WebElement popUp = driver.findElement(By.xpath("//span[text()='Symbol Has been Added Successfully']"));
//
//		if (popUp.isDisplayed()) {
//
//			System.out.println("Verify Pop is Displayed Successfully");
//		} else {
//			System.out.println("Verify Pop is Not Displayed ");
//
//		}
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Clear']")).click();

	}
	
	@When("User Remove The {string} Stock")
	public void user_remove_the_stock(String string) throws InterruptedException {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + string + "')]//parent::div"));

		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'" + string + "')]//following-sibling::span")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()=' Delete']")).click();
		Thread.sleep(2000);

	}
	
	@When("User Click The Withdraw button")
	public void user_click_the_withdraw_button() throws InterruptedException {

		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='funds_show']")).click();
		
		

		driver.findElement(By.xpath("(//div[@class='nav_btns']//child::button[text()='Withdraw'])[1]")).click();
		Thread.sleep(4000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//input[@placeholder='Enter amount']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter amount']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter amount']")).sendKeys("1");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='bank_radio']"));
		Thread.sleep(2000);
		
        if (element.isDisplayed()) {
        	
        	String blue = "\u001B[34m";
        	
        	System.out.println(blue + "Bank Deatails is displayed");
			
			
		} 
		
		else {
			System.err.println("Bank Details is not displayed");

		}
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
		
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title1='Dashboard']/parent::li")).click();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[@class='funds_back'])[2]")).click();

	}

	
	@When("User Click Add Money")
	public void user_click_add_money() throws InterruptedException {
		Thread.sleep(4000);

		WebElement element = driver.findElement(
				By.xpath("//button[@data-dhx-id='btn_addmoney']"));
		element.click();

	}

	@When("User enter money in amount to add")
	public void user_enter_money_in_amount_to_add() throws InterruptedException {
		Thread.sleep(2000);

		WebElement addMoneyFrame = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));
		driver.switchTo().frame(addMoneyFrame);

		driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).click();

		WebElement enterAmount = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
		enterAmount.clear();
		Thread.sleep(1000);

		enterAmount.sendKeys("50");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='deposit_amount']")).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
	}

	@When("User Choose Pay Using UPI")
	public void user_choose_pay_using_upi() throws InterruptedException {
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> li1 = new ArrayList<String>(windowHandles1);
		int size = li1.size();
		System.out.println(size);

		driver.switchTo().window(li1.get(1));

		driver.navigate().refresh();

		driver.navigate().refresh();

		driver.navigate().refresh();

		driver.navigate().refresh();

		driver.navigate().refresh();

		Thread.sleep(5000);

	}

	@When("User Enter UPI\\/ID\\/Mobile Number and click pay now")
	public void user_enter_upi_id_mobile_number_and_click_pay_now() throws InterruptedException, AWTException {
		driver.switchTo().frame(0);

		//Robot robot = new Robot();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		js.executeScript("window.scrollBy(0, 500)");
		js.executeScript("window.scrollBy(0, -500)");

		WebElement netBanking = driver.findElement(By.xpath("//input[@placeholder='example@okhdfcbank']"));

		netBanking.click();
		Thread.sleep(1000);

		WebElement UPI = driver.findElement(By.xpath("//input[@placeholder='example@okhdfcbank']"));

		UPI.sendKeys(TestConfig.UPI_ID);
		Thread.sleep(1000);

		WebElement clickPayUsingUPI = driver.findElement(By.xpath("//button[text()='Verify and Pay']"));
		clickPayUsingUPI.click();

		Thread.sleep(3000);

		
		WebElement clickPayUsingUPI1 = driver.findElement(By.xpath("//button[text()='Cancel Payment']"));
		clickPayUsingUPI1.click();
		
		WebElement clickPayUsingUPI11 = driver.findElement(By.xpath("//button[@data-testid='confirm-positive']"));
		clickPayUsingUPI11.click();
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, java.time.Duration.ofMinutes(1));
		WebElement rejectedMessage = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Payment could not be completed']")));
	//	WebElement rejectedMessage = driver.findElement(By.xpath("//div[text()='Payment could not be completed']"));

		if (rejectedMessage.isDisplayed()) {
			js.executeScript("arguments[0].style.border='2px solid yellow'", rejectedMessage);
			System.err.println("Payment Declined");

		}

		else {
			js.executeScript("arguments[0].style.border='2px solid red'", rejectedMessage);
			System.err.println("Payment SuccessFul");
		}

		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

	}
	
	
	@When("User Click the Watch List")
	public void user_click_the_watch_list() throws InterruptedException {
		Thread.sleep(4000);
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement element = driver
				.findElement(By.xpath("(//div[@class='header-left']//descendant::span[@class='ind_syml'])[1]"));
		
		Actions f=new Actions(driver);
		f.moveToElement(element).perform();
		f.click(element).perform();
		Thread.sleep(2000);
		
	}

	@When("User Select scrip {string}")
	public void user_select_scrip(String string) throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='select-box active']//descendant::li//span[text()='"+string+"']"))
				.click();
		System.out.println(string);
		Thread.sleep(4000);
	}

	@When("User Click Watch List Again")
	public void user_click_watch_list_again() throws InterruptedException {
		WebElement element1 = driver
				.findElement(By.xpath("(//div[@class='header-left']//descendant::span[@class='ind_syml'])[1]"));
		element1.click();

		Thread.sleep(2000);
	}

	@When("User mouse over the scrip {string}")
	public void user_mouse_over_the_scrip(String string) throws InterruptedException {
		
		Thread.sleep(2000);Thread.sleep(2000);
		WebElement contractSelectAgain = driver.findElement(
				By.xpath("//div[@class='select-box active']//descendant::li//span[text()='" + string + "']"));

		Thread.sleep(2000);

		Actions ac = new Actions(driver);
		ac.moveToElement(contractSelectAgain).perform();
		
		driver.findElement(By.xpath("(//span[@data-symbol='"+string+"'])[2]")).click();

		Thread.sleep(2000);
		
	}

	@When("User Click the Charts")
	public void user_click_the_charts() throws InterruptedException {
		Thread.sleep(2000);
		WebElement charts = driver.findElement(By.xpath(
				"//div[@class='select-box active']//descendant::span[text()='NIFTY 50']//ancestor::li//descendant::img"));
		charts.click();

		Thread.sleep(3000);
	}
	
	@When("User Click the {string} Charts")
	public void user_click_the_charts(String string) throws InterruptedException {
	    
		Thread.sleep(2000);
		WebElement charts = driver.findElement(By.xpath(
				"//div[@class='select-box active']//descendant::span[text()='Nifty 50']//ancestor::li//descendant::span[@class='ind_chart_btn']"));
		charts.click();

		Thread.sleep(3000);
		
	}

	@When("User Click the Candles Icon")
	public void user_click_the_candles_icon() throws InterruptedException {
		WebElement firstiFrame = driver.findElement(By.xpath("//iframe[@class='iframe_window']"));

		driver.switchTo().frame(firstiFrame);

		Thread.sleep(3000);

		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Financial Chart']"));

		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//div[@id='header-toolbar-chart-styles']")).click();
		Thread.sleep(3000);
	}

	@When("User Choose Candle {string}")
	public void user_choose_candle(String string) throws InterruptedException {
		driver.findElement(By.xpath("//div[@data-value='" + string + "']")).click();
		Thread.sleep(2000);
	}

	@When("User Click the Mintues")
	public void user_click_the_mintues() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();
		Thread.sleep(2000);

	}

	@When("User Choose One Minute")
	public void user_choose_one_minute() {
		driver.findElement(By.xpath("//div[text()='1 minute']//ancestor::div[@data-value='1']")).click();

	}

	@When("Verify One Minute Feed Connection Value and Wait One Minute Very Feed Connection Changes")
	public void verify_one_minute_feed_connection_value_and_wait_one_minute_very_feed_connection_changes()
			throws InterruptedException {
		WebElement element3 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		Thread.sleep(4000);
		String text2 = element3.getText();
		System.err.println("Feed Connection Value of One Minute : " + text2);

		Thread.sleep(60000);

		System.out.println("Feed Connection Value of After One Minute : " + text2);

	}

	@When("User Click the Five Minute")
	public void user_click_the_five_minute() {
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='5 minutes']//ancestor::div[@data-value='5']")).click();

	}

	@When("Verify Five Minute Feed Connection Valuebb")
	public void verify_five_minute_feed_connection_value() throws InterruptedException {
		WebElement element2 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		Thread.sleep(4000);
		String text = element2.getText();
		System.err.println("Feed Connection Value of Five Minutes : " + text);

	}

	@When("User Click One Day")
	public void user_click_one_day() {
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='1 day']//ancestor::div[@data-value='1D']")).click();

	}

	@When("Verify One Day Feed Connection Value and Wait One Minute Very Feed Connection Changes")
	public void verify_one_day_feed_connection_value_and_wait_one_minute_very_feed_connection_changes()
			throws InterruptedException {

		WebElement element4 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		Thread.sleep(4000);
		String text3 = element4.getText();
		System.err.println("Feed Connection Value of 1 hour : " + text3);
		Thread.sleep(60000);

		System.err.println("Feed Connection Value of 1 hour and 1 mins: " + text3);

	}
	
	@When("User Check the one Minute and one Day Chart")
	public void user_check_the_one_minute_and_one_day_chart() throws InterruptedException {
	   
		Thread.sleep(2000);
	//	framesHandling();
		

		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='1 minute']//ancestor::div[@data-value='1']")).click();
		
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text2 = element3.getText();
		
		
		System.out.println("Feed Connection Value of One Minute : " + text2);
		
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text1 = element2.getText();
		System.out.println("Feed Connection Value of One Minute : " + text1);
		
		if (text2.equals(text1)) {
			
			String blue = "\u001B[34m";
			System.err.println(blue+"One Minute Chart Value to Pass : " + text1);
		}
		
		else {
			
			System.err.println("Feed Connection Faild");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='1 day']//ancestor::div[@data-value='1D']")).click();
		
		Thread.sleep(2000);
		
		WebElement element31 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text211 = element31.getText();
		System.out.println("Feed Connection Value of One Day : " + text211);
		
		Thread.sleep(2000);
		
		WebElement element21 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text111 = element21.getText();
		System.out.println("Feed Connection Value of One Day : " + text111);
		
		if (text211.equals(text111)) {
			
			String blue = "\u001B[34m";
			System.err.println(blue+"One Minute Chart Value to Pass : " + text111);
		}
		
		else {
			
			System.err.println("Feed Connection Faild");
		}
		
		outOfFrames();
		
		driver.findElement(By.xpath("//button[@data-dhx-id='close']")).click();

		
		Thread.sleep(2000);
		
	}
	
	
	@When("User Select The {string} Stock or F&O to Chart")
	public void user_select_the_stock_or_f_o_to_chart(String string) throws InterruptedException {
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		
//		List<WebElement> elements = driver.findElements(By.xpath("//span[text()='"+string+"']"));
//		
//		for (WebElement webElement : elements) {
//			
//			String text = webElement.getText();
//			//System.out.println(text);
//			
//			if (text.equals(string)) {
//				
				Actions a = new Actions(driver);
//				a.moveToElement(webElement).perform();
//				
//				List<WebElement> elements2 = driver.findElements(By.xpath("//span[text()='"+string+"']//parent::div//following-sibling::div//child::span[@class='s_b2 chart']"));
//				
//				for (WebElement webElement2 : elements2) {
//					
//					if(webElement2.isDisplayed()) {
//						
//						a.moveToElement(webElement2).perform();
//						Thread.sleep(2000);
//						a.click(webElement2).perform();
//						
//					}
//					
//					
//				}
				
				
				WebElement option = driver.findElement(By.xpath("(//span[text()='"+string+"']//following-sibling::span[@class='symbolsseries'])[1]"));
				a.moveToElement(option).perform();

				driver.findElement(By.xpath("(//span[text()='"+string+"']//ancestor::div[@class='mw_list']//following-sibling::div[@class='s_btns']//child::span[@class='s_b2 chart'])[1]")).click();

				
				
			//}		
			
		//}
		
		Thread.sleep(2000);
		framesHandling();
		

		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='1 minute']//ancestor::div[@data-value='1']")).click();
		
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text2 = element3.getText();
		
		
		System.out.println("Feed Connection Value of One Minute : " + text2);
		
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text1 = element2.getText();
		System.out.println("Feed Connection Value of One Minute : " + text1);
		
		if (text2.equals(text1)) {
			
			String blue = "\u001B[34m";
			System.err.println(blue+"One Minute Chart Value to Pass : " + text1);
		}
		
		else {
			
			System.err.println("Feed Connection Faild");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='header-toolbar-intervals']")).click();

		driver.findElement(By.xpath("//div[text()='1 day']//ancestor::div[@data-value='1D']")).click();
		
		Thread.sleep(2000);
		
		WebElement element31 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text212 = element31.getText();
		System.out.println("Feed Connection Value of One Minute : " + text212);
		
		Thread.sleep(2000);
		
		WebElement element21 = driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div[2]/div[1]/div[2]/table/tr[1]/td[2]/div/div[2]/div[1]/div/div[2]/div/div[5]/div[2]"));
		
		String text112 = element21.getText();
		System.out.println("Feed Connection Value of One Minute : " + text112);
		
		if (text212.equals(text112)) {
			
			String blue = "\u001B[34m";
			System.err.println(blue+"One Minute Chart Value to Pass : " + text112);
		}
		
		else {
			
			System.err.println("Feed Connection Faild");
		}
		
		outOfFrames();
		
		driver.findElement(By.xpath("//button[@data-dhx-id='close']")).click();

		
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
