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
public class Head {

    //建構子：1.沒有任何傳回值仍不加void 2.類別名稱=方法名稱 3.只存在物件生成的時候(初始化完就不存在)
    //物件=類別的具體實例

    Head() //除size欄位外會多一個Head方法，然而初始化完就不存在了，故沒有handsome.hd.Head
    {


    }

    //建構子關係-多載：方法名稱相同，參數不同,可呼叫其建構子handsome.hd=new Head(30)。一樣只存在物件生成的時候
    // Head(int a)
    // {
    //     size=a;
    // }

    Head(int size)
    {
        this.size=size;
    }

    int size;
}
