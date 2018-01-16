package com.example.chapter4;

/**
 * VM Args: -XX:+PrintAssembly -Xcomp -XX:CompileCommand=dontinline,*HotSpotDisassemblerTest.sum -XX:CompileCommand=compileonly,*HotSpotDisassemblerTest.sum
 */
public class HotSpotDisassemblerTest {
    int a = 1;
    static int b = 2;

    public int sum(int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        new HotSpotDisassemblerTest().sum(3);
    }
}
