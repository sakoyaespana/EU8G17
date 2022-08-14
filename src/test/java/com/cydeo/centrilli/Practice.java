package com.cydeo.centrilli;

import com.cydeo.centrilli.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

    @Test
    public void test1(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


        Alert alert= Driver.getDriver().switchTo().alert();






    }




}
