/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test70;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author s2000
 */
public class test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        // 找出數字字串中最大的質數
        //

       
        Scanner scanner = new Scanner(System.in); //初始化Scanner
        System.out.println("輸入一個正整數: ");
        int num = scanner.nextInt();
        String s = Integer.toString(num); //數字轉字串
        int i = 1;
        int j =s.length();
        ArrayList<Integer> al = new ArrayList<Integer>();
        
       
        if (i<=s.length()) {
            int k = (int) Math.pow(10, i-1);
            al.add(num/k%(10*(s.length()-1)));  
            i+=1;
            System.out.println(i);
        }
        if (j!=0) {
            int k = (int) Math.pow(10, j-1);
            al.add(num/k%(10*(j)));  
            j-=1;
            System.out.println(j);
        }
        System.out.println(al);
        
    }
        
    }

/* 
    public static void topic1() {
        
        
        num=scanner.nextin
        int strLenth = str.length();
        int number;
        int maxPrime = 0;
        for (int numLen = strLenth; numLen >= 0; numLen--) {
            for (int i = 0; i + numLen < strLenth; i++) {
                number = Integer.parseInt(str.substring(i, (i + numLen + 1)));
                if (isPrime(number)) {
                    if (number > maxPrime) {
                        maxPrime = number;
                    }
                }
            }
            if (maxPrime != 0) {
                break;
            }
        }
        if (maxPrime != 0) {
            System.out.println("最大質數為: " + maxPrime);
        } else {
            System.out.println("No prime found");
        }
    }
*/    

