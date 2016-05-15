package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by Olga on 09.05.2016.
 */
public class TheFirst
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ru/");
        WebElement element = driver.findElement(By.id("gs_lc0"));
        element.sendKeys("киевский торт");
        element.submit();
    }
}
