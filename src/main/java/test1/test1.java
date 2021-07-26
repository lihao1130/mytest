package test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("i am a boy");
        System.out.println("yes");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println(a+a);
        int b = ++a;
        int c = a++;
        int d = (a++)+(++a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
