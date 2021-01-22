package com.jason.myjavatrips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestString {
    public static void main(String[] args) {
        String[] str = new String[]{"chen", "yang", "hao"};
        List list = Arrays.asList(str);
        // throw java.lang.UnsupportedOperationException
        // list.add("a");
        str[0] = "a";
        System.out.println(list.toString());


        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        Iterator<String> iterator = list1.iterator();
        // while (iterator.hasNext()) {
        //     String item = iterator.next();
        //     if ("1".equals(item)) {
        //         iterator.remove();
        //     }
        // }

        for (String item : list1) {
            System.out.println(list1.size());
            if ("1".equals(item)) {
                list1.remove(item);
            }
        }

        String testString = null;
        System.out.println(testString);
    }
}
