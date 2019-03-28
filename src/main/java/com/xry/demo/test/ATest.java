package com.xry.demo.test;

public class ATest {
    public static void main(String[] args) {
        String s="hashCode";
        StringBuilder sb=new StringBuilder(s);
        System.out.println(s.hashCode()+"-----"+sb.hashCode());
    }
}