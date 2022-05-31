package com.example.demo;

import java.net.URI;

public class Browser1

{

    String url_arr [] = {"https://www.google.com" , "www.youtube.com"};
    public String open(String url) {

        for (int i = 0; i < url_arr.length; i++) {
            if (url.equals(url_arr[i]))
                return "valid link";


        } return "Invalid link";
    }

}
