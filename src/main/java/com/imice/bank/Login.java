package com.imice.bank;

/**
 * Hello world!
 *
 */
public class Login
{
    public static void main( String[] args )
    {

    }

    public String LoginUser( String name, String psw){
        if(name == null|| name.equals("")|| psw==null ||psw.equals("")){
            return "用户名和密码不能为空";
        }else if(name== "admin")
        {
            return "欢迎admin";
        }else{
            return "欢迎"+name;
        }
    }
}
