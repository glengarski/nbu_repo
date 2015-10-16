/*
 * Text.java
 *
 * created at Sep 11, 2015 by g.lengarski g.lengarski@seeburger.com
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.text.example;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Text
{

    public static void main(String[] args)
    {
//        t1();
        t2();
    }


    private static void t2()
    {

    }


    private static void t1()
    {
        String s = null;
        try
        {
            Process p = Runtime.getRuntime().exec("cmd /c dir");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            stdOut.write("");
            stdOut.flush();
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null)
            {
                System.out.println(s);
            }
            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null)
            {
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
        }
    }
}
