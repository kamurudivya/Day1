package org.example;

/**
 * Hello world!
 *
 */
public class fgfgfvg
{
    public static void main( String[] args )
    {
        int  num,t,s,rem;
             num = 524;
        t=num;
        for(s=0;num>0;num/=10);
        {
            rem=num%10;
            s=(s*10)+rem;
        }
       if(s==t)
        System.out.println( t+" is s palindrome number " );
             else
        System.out.println( t+" is not a palindrome number " );
    }
}
