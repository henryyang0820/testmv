package com.imice.bank;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test(dataProvider = "getUsers",dataProviderClass = LoginUsersDp.class)
    public void loginTest(String name, String psw,String expect){
        Login l = new Login();
        String ac = l.LoginUser(name, psw);
        Assert.assertEquals(ac,expect);
    }
}
