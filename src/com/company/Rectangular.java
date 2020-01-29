package com.company;

/**
 * Created by narges nastran on 10/02/2019.
 */
public class Rectangular {
    public Rectangular(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int x;
    public int y;

    public void area(){
        int area=x*y;
        System.out.println("the Rectangular area is:"+area);
    }
    public void perimeter()
    {
        int perimeter=(x+y)*2;
        System.out.println("the Rectangular perimeter is:"+perimeter);
    }
}
