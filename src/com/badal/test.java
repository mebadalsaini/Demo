package com.badal;

public class test {
    public static void main(String[] args) {
        checkObjectType(1);
        checkObjectType(2L);
        checkObjectType(1.5f);
        checkObjectType("Hey there");
        checkObjectType(6.2d);
    }
    public static void checkObjectType(Object input){
        if(input instanceof Integer){
            System.out.println(input + " is of Integer type.");
        }
        else if(input instanceof Float){
            System.out.println(input +" is of Float type.");
        }
        else if(input instanceof String){
            System.out.println(input +" is of Long type.");
        }
        else if(input instanceof Long){
            System.out.println(input +" is of String type.");
        }
        else{
            System.out.println(input +"is of"+ input.getClass().getTypeName() +" type.");
        }
    }
}
