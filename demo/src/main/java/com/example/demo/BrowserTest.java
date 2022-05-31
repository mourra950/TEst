package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrowserTest {

    @Test
    public void browser1()
    {
        Browser1 b = new Browser1();
        String url_arr [] = {"https://www.google.com" , "ahmed.com"};
        assertEquals("Invalid link",b.open("ahmed.com"));
    }


}