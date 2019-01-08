package com.atguigu;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2019-01-07-21:11
 */
public class TemplateTest {


    public static void main(String[] args) {

        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        int num1 = 10;
        System.out.println(num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        String[] arr = new String[]{"tom","lilei"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            
            String s = arr[i];
            System.out.println(s);
        }
        for (String s : arr) {
            System.out.println(s);

        }

        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        for (Object o : list) {

            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        if (list == null) {

        }
        if (list != null) {



        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list2 != null) {

        }


    }
    public void method(){
        System.out.println("TemplateTest.method");
    }
}
