package com.yankees88888g.fabric.website.render.websiteHandler;



import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteHandler {

    public static void main(String[] args) {
        render("https://selenium.dev");
    }

    public static void render(String url){
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.get(url);

        //driver.quit();

    }
}
