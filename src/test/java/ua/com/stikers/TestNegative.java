package ua.com.stikers;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestNegative extends WebDriver{

    @Test
    public void testShopStickersBuyNegative(){
        openSite();

        //Open Shop
        openShop();

        //Open selected Sticker
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nm-shop-browse-wrap\"]/ul/li[2]/div/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"nm-shop-browse-wrap\"]/ul/li[2]/div/div[1]")).click();

        //Selected size Stickers
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-1620\"]/div[1]/div[3]/div/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"nm-variations-form\"]/table/tbody/tr/td[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"nm-variations-form\"]/table/tbody/tr/td[2]/span/span[2]/span/span[x]")).click();

        //Selecting the Number of Stickers
        driver.findElement(By.xpath("//*[@id=\"quantity_5fca2ecf59ddc\"]")).sendKeys(Negative);
        driver.findElement(By.xpath("//*[@id=\"nm-variations-form\"]/div/div[2]/button")).click();

    }
    @Test
    public void testShopStickersBuyletters(){
        openSite();

        //Open Shop
        openShop();

        //Open selected Sticker
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nm-shop-browse-wrap\"]/ul/li[3]/div/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"nm-shop-browse-wrap\"]/ul/li[3]/div/div[1]")).click();

        //Selected size Stickers
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-1513\"]/div[1]/div[3]/div/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"nm-variations-form\"]/table/tbody/tr/td[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"nm-variations-form\"]/table/tbody/tr/td[2]/span/span[2]/span/span[x]")).click();

        //Selecting the Number of Stickers
        driver.findElement(By.xpath("//*[@id=\"quantity_5fca34b1ef056\"]")).sendKeys(Letters);
        driver.findElement(By.xpath("//*[@id=\"nm-variations-form\"]/div/div[2]/button")).click();

    }

    public void openSite(){
        driver.get("https://stickers.com.ua/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Stickers - Stickers"));
    }

    public void openShop(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-item-1385\"]")));
        driver.findElement(By.xpath("//*[@id=\"menu-item-1385\"]")).click();

    }

}
