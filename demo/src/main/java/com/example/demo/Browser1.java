package com.example.demo;

import java.net.URI;

public class Browser1
{
    public String open(String url) {
        System.out.println(url);
        try {
            URI u = new URI(url);
            java.awt.Desktop.getDesktop().browse(u);
            return "valid link";
        }

        catch (Exception e)
        {
            Alertbox.display("Invalid link","please report to the admin or the Doctor of the course");

        }
        return "Invalid link";
    }

}
