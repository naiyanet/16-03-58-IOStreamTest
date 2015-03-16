/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.iofundamentals;

import java.util.Properties;

/**
 *
 * @author M6500
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties pro = System.getProperties();
        pro.list(System.out);
        System.out.println("---------------------------------");
        System.out.println(System.getProperty("file.encoding"));
    }
}
