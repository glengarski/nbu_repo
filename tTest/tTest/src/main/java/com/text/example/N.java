/*
 * N.java
 *
 * created at Oct 14, 2015 by g.lengarski g.lengarski@seeburger.com
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.text.example;


import java.text.DecimalFormat;


public class N
{
    public static void main(String args[])
    {
        double n = 612;
        double x = calc(n);

        System.out.println("sqrt(" + n + ")=" + x);
    }


    private static double calc(double n)
    {
        double xx = 10;
        do
        {
            xx = xx - ((xx * xx - n) / (2 * xx));
            System.out.println(xx);
        }
        while (!isSQRT(xx, n));
        return xx;
    }


    private static boolean isSQRT(double xx, double n)
    {
        DecimalFormat df = new DecimalFormat("#.###");
        double r = Double.parseDouble(df.format(xx * xx));

        System.out.println(r + "\t" + n);

        if (r == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
