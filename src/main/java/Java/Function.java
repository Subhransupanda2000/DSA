package Java;

import java.util.Scanner;

public class Function {
    public static void average(int n,int m,int o)
    {
        int Average=(m+n+o)/3;
        System.out.println(Average);
        return;
    }
    public static void main (String [] args)
    {
        System.out.println("enter three number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int o= sc.nextInt();
        average(n,m,o);

    }
}

