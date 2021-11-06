package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num = 12345, reversed = 0;
        for(;num != 0; num /=10)
        {
            int digit = num %10;
            reversed = reversed * 10 + digit;
        }
        System.out.println( "Reversed Number: " + reversed);
    }
}
