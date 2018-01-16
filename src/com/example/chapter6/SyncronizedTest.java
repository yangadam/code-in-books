package com.example.chapter6;

public class SyncronizedTest {

    void onlyMe(Object f) {
        synchronized (f) {
            doSomething();
        }
    }

    private void doSomething() {
    }

}