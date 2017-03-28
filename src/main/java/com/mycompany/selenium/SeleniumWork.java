//
//package com.mycompany.selenium;
//
//import static org.openqa.grid.common.SeleniumProtocol.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//public class SeleniumWork 
//{
//    public static void main(String[] args) throws InterruptedException 
//    {
//        
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoyo\\Desktop\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        //System.setProperty("webdriver.ie.driver","C:\\Users\\yoyo\\Desktop\\IEDriverServer.exe");
//       // WebDriver driver = new InternetExplorerDriver();
//        //navigate to wikepedia
//        driver.get("https://www.wikipedia.org/");
//        //click on the english link
//        WebElement link;
//        link = driver.findElement(By.partialLinkText("English"));
//        link.click();
//        //wait for some time
//        Thread.sleep(5000);
//        
//        WebElement searchBox;
//        searchBox = driver.findElement(By.id("searchInput"));
//        searchBox.sendKeys("Software");
//        searchBox.submit();
//         Thread.sleep(5000);
//         //driver.quit();
//        
//        
//        
//        
//    }
//    
//           
//}
