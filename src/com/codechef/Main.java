package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Three numbers A, B and C are the inputs. Write a program to find second largest among them.
       Input
       The first line contains an integer T, the total number of testcases.
       Then T lines follow, each line contains three integers A, B and C.

       Output
       For each test case, display the second largest among A, B and C, in a new line.

       Constraints
       1 ≤ T ≤ 1000
       1 ≤ A,B,C ≤ 1000000
       Example
       Input
       3
       120 11 400
       10213 312 10
       10 3 450

       Output
       120
       312
       10
         */
    Scanner sc = new Scanner(System.in);
    int t,a,b,c;
    t = sc.nextInt();
    while(t-->0)
    {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        else if(b>c && b>a){
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(a>b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
    }
    }
}
