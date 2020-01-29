package com.company;

/**
 * Created by narges nastran on 10/02/2019.
 */
public class Square {
    public Square(int a)
    {
        this.a=a;
    }
    public int a;

    public void area()
    {
        int area=a*a;
        System.out.println("the square area is:"+area);
    }
    public void perimeter()
    {
        int perimeter=a*4;
        System.out.println("the square perimeter is:"+perimeter);
    }
}
