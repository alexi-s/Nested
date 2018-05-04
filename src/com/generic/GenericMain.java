package com.generic;

/**
 * Created by student on 04.05.2018.
 */
public class GenericMain {

    public static void main(String[] args) {

        GeneralObject<Integer> g = new GeneralObject<>();

        g.setT(Integer.valueOf(4));
        System.out.println(g.getT());
        g.setT(15);
        System.out.println(g.getT());

        GeneralObject<String> g2 = new GeneralObject<>();
        g2.setT("Hello");
        System.out.println(g2.getT());

        GeneralObject g3 = new GeneralObject();
        g3.setT("Hi");
        System.out.println(g3.getT()); // нежелательно, есть вероятность ClassCastException

        GeneralObject[] arrayT = {g, g2, g3};
        GeneralArray.printArray(arrayT);

    }
}
