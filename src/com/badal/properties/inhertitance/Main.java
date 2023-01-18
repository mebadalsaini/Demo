package com.badal.properties.inhertitance;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(12.2, 14.4, 18.8);
        Box box2 = new Box(8,5,6);
        BoxWeight box3 = new BoxWeight(12, 12, 12, 23);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
        System.out.println(box3.l +" " + box3.h + " " + " " + box3.w + " " + box3.weight);
    }
}
