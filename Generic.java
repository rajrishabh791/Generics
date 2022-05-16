package com.bridgelabz;

import java.util.Scanner;

public class Generic<T> {


    public <T> void integerCompare() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the Greatest Integer");
        } else if (b > a && b > c) {
            System.out.println("b is the Greatest number");
        } else {
            System.out.println("c is the greatest number");
        }
    }
        public <T> void floatCompare()
        {
            Scanner scanner = new Scanner(System.in);
            float x = scanner.nextFloat();

            float y = scanner.nextFloat();

            float z = scanner.nextFloat();

            if((Float.compare(x,y)>0) && (Float.compare(x,z) >0) )
            {
                System.out.println("x is the Greatest number");
            } else if ((Float.compare(y,x)>0) && (Float.compare(y,z) >0)) {

                System.out.println("y is the Greatest number");
            }
            else {
                System.out.println("z is the greatest number");
            }
    }

    public <T> void stringCompare()
    {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();

        String q = scanner.next();

        String r = scanner.next();

        if((p.compareTo(q) >0) && (p.compareTo(r) >0) )
        {
            System.out.println("p is the Greatest String");
        } else if ((q.compareTo(p) >0) && (q.compareTo(r) >0)) {

            System.out.println("q is the Greatest String");
        }
        else {
            System.out.println("r is the greatest String");
        }
    }


    public static void main(String args[])
    {
        Generic g = new Generic();
        g.integerCompare();
        g.floatCompare();
        g.stringCompare();
    }
}
