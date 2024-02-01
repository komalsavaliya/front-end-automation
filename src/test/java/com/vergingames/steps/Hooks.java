package com.vergingames.steps;


import com.vergingames.utility.Utility;
import com.vergingames.propertyreader.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot =getScreenShot();
            scenario.attach(screenshot,"img/png",scenario.getName());
        }
        closeBrowser();
    }
}
