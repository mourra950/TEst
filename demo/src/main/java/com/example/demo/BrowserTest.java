package com.example.demo;

import com.example.demo.Browser1;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;
public class BrowserTest extends TestCase {

    @Test
    public void browser1()
    {
        Browser1 b = new Browser1();
        String url_arr [] = {"https://www.google.com" , "ahmed.com"};
        assertEquals("Invalid link",b.open("ahmed.com"));
    }


}