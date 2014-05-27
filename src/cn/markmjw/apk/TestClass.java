/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.markmjw.apk;

import java.util.Enumeration;
import java.util.Properties;

/**
 * 测试类
 * 
 * @author markmjw
 * @date 2013-06-22
 */
public class TestClass {

    public static void main(String[] args) {
        Properties propertis = System.getProperties();
        String jdkHome = propertis.getProperty("java.home");
        String sdkHome = propertis.getProperty("android_sdk_home");

        System.out.println("jdk -> " + jdkHome);
        System.out.println("sdk -> " + sdkHome);

        Enumeration en = propertis.propertyNames();
        while (en.hasMoreElements()) {
            String key = (String) en.nextElement();
            String Property = propertis.getProperty(key);
            System.out.println(key + " -> " + Property);
        }
    }
}
