/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test70;
import java.util.Scanner;
/**
 *
 * @author s2000
 */
public class test2 {
    public static void main(String[] args) {
            topic2();
        }
    public static void topic2(){
        Scanner s = new Scanner(System.in); //初始化Scanner
        System.out.println("輸入一個正整數: ");
        int num = s.nextInt();
        float summer,nonSummer;
        if (num<=120) {
            summer = 2.10f * (float) num;
            nonSummer = 2.10f * (float) num;
        } else if(num<=330) {
            summer = 3.02f * (float) (num-120)+120*2.10f;
            nonSummer = 2.68f * (float) num+120*2.10f;
        } else if(num<=500) {
            summer = 4.39f * (float) num;
            nonSummer = 3.61f * (float) num;
        } else if(num<=700) {
            summer = 4.97f * (float) num;
            nonSummer = 4.01f * (float) num;
        } else {
            summer = 5.63f * (float) num;
            nonSummer = 4.50f * (float) num;
        }
        
        System.out.println(summer);
        System.out.println(num);

        s.close(); 
    }    
    
}
