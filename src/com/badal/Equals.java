package com.badal;

public class Equals {
    public static void main(String[] args){
        Classroom s1 = new Classroom(1, "Badal", "Faridabad");
        Classroom s2 = new Classroom(1, "Badal", "Faridabad");
        boolean result = s1.equals(s2);
        System.out.println(result);
    }
}

