/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author s2000
 */
public class javaapplication1 {
    
    public static void main(String[] args) {
        
        People handsome=new People();
        // handsome.hd=new Head(30); //產生Head型別的hd物件
        // handsome.bd=new Body();
        // handsome.rh=new Hand();
        // handsome.lh=new Hand();
        // handsome.rl=new Leg(); 
        // handsome.ll=new Leg(); 

        // handsome.hd.size=20;
        // handsome.bd.capacity=2000;
        // handsome.rh.length=30;
        // handsome.lh.length=30;
        // handsome.rl.length=60;
        // handsome.ll.length=60;

        handsome.hd=new Head(30);
        System.out.println(handsome.hd.size);
        handsome.bd=new Body(60);
        handsome.rh=new Hand(60);
        handsome.lh=new Hand(60);
        handsome.rl=new Leg(60); 
        handsome.ll=new Leg(60);         


        People lee=new People(); //宣告People型別的新變數lee 
        lee.hd=new Head(); 
        lee.bd=new Body();
        lee.rh=new Hand();
        lee.lh=new Hand();
        lee.rl=new Leg(); 
        lee.ll=new Leg(); 

        lee.hd.size=10; //產生int型別的size物件
        lee.bd.capacity=1000;
        lee.rh.length=20;
        lee.lh.length=20;
        lee.rl.length=50;
        lee.ll.length=50;

        Leg tmp; //新增Leg型別的tmp
        tmp=handsome.rl;
        handsome.rl=lee.rl;
        lee.rl=tmp;

        

        System.out.println(handsome.hd.size);


    }
}
