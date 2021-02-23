package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int factorial(int x) {
      if (x == 0)
        return 1;
      else 
        return (x * factorial(x-1));
    }
}
