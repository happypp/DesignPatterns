package com.happypp.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Created by pengpeng on 2018/10/21
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/oyo/workspace/happy-pp/DesignPatterns/Decorator/src/com/happypp/io/test.txt")));
            while ((c = in.read()) > 0) {
                System.out.println((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
