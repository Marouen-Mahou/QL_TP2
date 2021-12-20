package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Go to the website
        driver.get("https://www.tunisianet.com.tn/"); 

        Thread.sleep(5000);
            
        //Go to login page
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div")).click();
        
        Thread.sleep(5000);
      
        //Go to login page
        driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div/div[2]/div[3]/ul/li/a")).click();
 
        Thread.sleep(5000);
        
        //Write email
        WebElement emailinput = driver.findElement(By.xpath( "/html/body/main/section/div/div/div/section/section/section/form/section/div[1]/div[1]/input" )) ;
        emailinput.sendKeys("test2021@email.com");

        //Write password
        WebElement pwdinput = driver.findElement(By.xpath( "/html/body/main/section/div/div/div/section/section/section/form/section/div[2]/div[1]/div/input" )) ;       
        pwdinput.sendKeys("123456789");
        
        Thread.sleep(5000);
        
        //Click on login
        driver.findElement(By.id("submit-login")).click();

        //Click on search and type text
        WebElement recherchebar = driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/input[4]"));
        recherchebar.sendKeys("PC portable MacBook M1 13.3");

        Thread.sleep(5000);

        //Click on search
        driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/div[2]/button")).click();

        Thread.sleep(5000);
        
        //Click on the first element of the search
        driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div[1]/article/div/div[3]/div[6]/div/div[1]/form/button")).click();

        Thread.sleep(5000);
           
        //Click on commande
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/a")).click();
        
        Thread.sleep(5000);
        
        //Click on command of cart
        driver.findElement(By.xpath("/html/body/main/section/div/div/div/section/div/div/div[3]/div/a")).click();

        Thread.sleep(7000);
            
        //Fill Command inputs
        driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/section[2]/div/div/form/div/div/section/div[5]/div[1]/input")).sendKeys("test1");
        driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/section[2]/div/div/form/div/div/section/div[7]/div[1]/input")).sendKeys("test2");
        driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/section[2]/div/div/form/div/div/section/div[8]/div[1]/input")).sendKeys("test3");
        driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/section[2]/div/div/form/div/div/section/div[9]/div[1]/input")).sendKeys("22222222");
        driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/section[2]/div/div/form/div/div/footer/button")).click();
            
        Thread.sleep(7000);
        
        driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/section[3]/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("/html/body/main/section/div/section/div/div[1]/section[4]/div/div[1]/div[1]/div/span/input")).click();
    }
}
