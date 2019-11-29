package com.javase.collections;


import org.junit.jupiter.api.Test;

import java.util.*;

public class ListDemo {

    @Test
    public void test1(){

        List list1 = new ArrayList<String>();
        list1.add("cehsi1");
        list1.add("cehsi2");
        list1.add("cehsi1");
        list1.add("cehsi3");
        boolean ceshi1 = list1.contains("cehsi1");
        System.out.println(ceshi1);


        LinkedList linkedList = new LinkedList();
        linkedList.add("124");
        linkedList.remove("124");

        new Thread();

    }
}
