package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String selectItem;
        System.out.println("1)Rectangular  2)Square");
        selectItem=obj.nextLine();


        switch(selectItem)
        {
            case "1":
                String x;
                String y;
                System.out.println("enter value of x:");
                x=obj.nextLine();
                System.out.println("enter value of y:");
                y=obj.nextLine();
                Rectangular rectangular=new Rectangular(Integer.parseInt(x),Integer.parseInt(y));
                rectangular.area();
                rectangular.perimeter();
                break;
            case "2":
                String a;
                System.out.println("enter value of a:");
                a=obj.nextLine();
                Square square=new Square(Integer.parseInt(a));
                square.area();
                square.perimeter();
                break;
        }
    }
}
