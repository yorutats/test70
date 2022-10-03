package test70;

class Person {  
    String name; //屬性
    int weigth;

    void eat()
    {
        weigth=weigth+1;
    }
    
}

public class weigth {
    public static void main(String[] args) {
        Person lee=new Person(); //物件
        lee.weigth=70;
        System.out.println(lee.name);
        System.out.println(lee.weigth);
        lee.eat();
        System.out.println(lee.weigth);

        Person hsu=new Person();
        hsu.weigth=60;
        System.out.println(hsu.name);
        System.out.println(hsu.weigth);
        hsu.eat();
        hsu.eat();
        System.out.println(hsu.weigth);

        Person tmp; //暫存
        tmp=lee;
        lee=hsu;
        hsu=tmp;

    }
}
