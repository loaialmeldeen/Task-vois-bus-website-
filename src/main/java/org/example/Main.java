package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        WebElement choosestation = driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/div/div[2]/div/div/ul/li[1]/a"));
        choosestation.click();
        WebElement selectdeparture = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a"));
        selectdeparture.click();
        WebElement searchforbusBtn = driver.findElement(By.xpath("//*[@id='bookingsForm']/div[1]/div/div[2]/div[3]/button"));
        searchforbusBtn.click();
        WebElement selectseatBtn = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div/input[4]"));
        selectseatBtn.click();
        WebElement numberseat = driver.findElement(By.xpath("//*[@id='Forward44']/span"));
        numberseat.click();
        WebElement customerdetails = driver.findElement(By.id("Forwardprofile-tab"));
        customerdetails.click();
        WebElement customermobileno = driver.findElement(By.xpath("//*[@id='mobileNo']"));
        customermobileno.sendKeys("6789125987");
        WebElement customeremail = driver.findElement(By.xpath("//*[@id='email']"));
        customeremail.sendKeys("loai@gmail.com");
        WebElement passengername = driver.findElement(By.id("passengerNameForward0"));
        passengername.sendKeys("mohameed");
        WebElement passengerage = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div/div[2]/div[3]/input"));
        passengerage.sendKeys("25");
        WebElement passengergender = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div/div[2]/div[2]/select/option[2]"));
        passengergender.click();
        WebElement concession = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div/div[2]/div[5]/select/option[2]"));
        concession.click();
        WebElement termsChk = driver.findElement(By.name("termsChk"));
        termsChk.click();
        WebElement makepaymentbtn = driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[4]/div/table/tbody/tr/td/div/div[1]/div[2]/div[5]/div/div/div/div/div/div[2]/div[3]/input"));
        makepaymentbtn.click();







    }
}