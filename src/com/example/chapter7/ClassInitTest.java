package com.example.chapter7;

public class ClassInitTest {
    static {
        i = 0; // 给变量赋值可以正常编译通过
        // System.out.println(i); // 这句编译器会提示"非法向前引用"
    }

    static int i = 1;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.i);
    }
}
