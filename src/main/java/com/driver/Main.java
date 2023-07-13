package com.driver;

public class Main
{
    public static void main(String[] args)
    {
        RWOnly rw=new RWOnly();
        //rw.name="name";
        //java: name has private access in com.driver.RWOnly

        //System.out.print(rw.name);
        //java: name has private access in com.driver.RWOnly

        rw.setName("name");
        System.out.println(rw.getName());
    }
}