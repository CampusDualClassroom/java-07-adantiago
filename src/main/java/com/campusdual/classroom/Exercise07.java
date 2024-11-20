package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {

    }

    public static void positionInAList(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; --i) {
            list.add(i);
        }
        int index = list.indexOf(num);
        if (index < 0) {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        } else {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + index);
        }

    }

    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        String str = "";
        for (int i = 1; i <= num; ++i) {
            str = str + " " + i;
        }
        System.out.println(str);
    }

}
