/*
 * TestIO.java
 *
 * created at Oct 9, 2015 by g.lengarski g.lengarski@seeburger.com
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.text.example;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TestIO
{
    public static String file = "test.txt";
    public static String copyFile = "copy.test.txt";


    public static void main(String args[])
    {
        // readFromFile();
        // readSystemIO();
        // readSystemIOScanner();
        copyFiles();
    }


    private static void copyFiles()
    {
        FileReader reader = null;
        FileWriter writer = null;

        try
        {
            reader = new FileReader(file);
            writer = new FileWriter(copyFile);
            int read;
            while ((read = reader.read()) != -1)
            {
                writer.write(read);
                System.out.print((char)read);
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (reader != null)
            {
                try
                {
                    reader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (writer != null)
            {
                try
                {
                    writer.flush();
                    writer.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


    private static void readSystemIOScanner()
    {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        int integer = in.nextInt();

        System.out.println(text + "\t" + integer);

        if (in != null)
        {
            in.close();
        }
    }


    private static void readSystemIO()
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String text;
        try
        {
            text = stdin.readLine();
            System.out.println(text);
            stdin.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    private static void readFromFile()
    {
        StringBuffer sb = new StringBuffer();
        BufferedReader in = null;
        try
        {
            in = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = in.readLine()) != null)
            {
                sb.append(line + "\n");
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (in != null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(sb.toString());
    }
}
