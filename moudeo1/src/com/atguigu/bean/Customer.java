package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    //这是单行注释
//

    private static final int INITIAL_SIZE = 10;
    private static int num;

    public static void main(String[] args) {
        //region Description
        System.out.print("helloworld");

        System.out.print("helloworld");

        ArrayList list3 = new ArrayList();
        //endregion

        ArrayList list7 = new ArrayList();
        Date date = new Date();
        list7.add(0, 123);
        method();


    }

    public void eat(){
        System.out.print("吃饭");
    }

    public static void method() {
        num = 10;
        try {

            //FileInputStream fid = new FileInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
