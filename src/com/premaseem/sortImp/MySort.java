package com.premaseem.sortImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asee2278 on 1/31/17.
 */
public class MySort {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(34);
        list.add(32);
        list.add(26);
        list.add(16);


        Integer temp = 0;
        System.out.println(list);

        for (int j=0;j <list.size() ; j++){
            for (int i = 0; i < j; i++) {
                if (i + 1 == list.size()) {
                    break;
                }
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set((i + 1), temp);
                }
            }
    }

        System.out.println(list);



    }


}
