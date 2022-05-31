package com.example.demo;

import java.net.URI;

public class Browser {
    public static void open(String url) {
        System.out.println(url);
        try {
            URI u = new URI(url);
            java.awt.Desktop.getDesktop().browse(u);

        }
        catch (Exception e)
        {
            Alertbox.display("Invalid link","please report to the admin or the Doctor of the course");
        }
    }
}
