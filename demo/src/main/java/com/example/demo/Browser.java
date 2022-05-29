package com.example.demo;

import java.net.URI;

public class Browser {
    public static void open(String url) throws Exception {
        URI u = new URI(url);
        java.awt.Desktop.getDesktop().browse(u);
    }
}
