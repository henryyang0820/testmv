package com.imice.bank;

import org.testng.annotations.DataProvider;

public class LoginUsersDp {
    @DataProvider
    public Object[][] getUsers(){
      return new Object[][]{
              {"","","用户名和密码不能为空"},
              {"songying","","用户名和密码不能为空"},
              {"yang","123456","欢迎yang"},
              {"admin","1","欢迎admin"},
              {"","1","用户名和密码不能为空"}
      };
    }
}
