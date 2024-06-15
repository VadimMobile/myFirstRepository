import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] massive = new int[10];
        for (int i = 0; i < massive.length ; i++) {
            massive[i] = new Random().nextInt(100);
        }
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < massive.length ; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = massive.length - 1; i >= 0 ; i--) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        for (int i = 0; i < massive.length / 2; i++) {
            int temp = massive[i];
            massive[i] = massive[massive.length - 1 - i];
            massive[massive.length - 1 - i] = temp;
        }
            for (int i = 0; i < massive.length; i++){
            System.out.print(massive[i] + " ");
        }
    }
}

