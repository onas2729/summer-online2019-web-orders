package com.weborders.step_definitions;

import com.weborders.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("login page incomoing");
    }
    
    //after hook
    //will close browser after every test
    @After
    public void teardown(){
        Driver.close();
    }
}
