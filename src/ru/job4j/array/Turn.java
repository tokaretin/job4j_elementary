package ru.job4j.array;

public class Turn {                                    //   0 1 2 3  индексы                                               0  1  2  3  индексы
    public static int[] back(int[] array) {            //  4 1 6 2  элементы                                               1, 2, 7, 6
        for (int i = 0; i < array.length / 2; i++) {   //  2 6 1 4   измена                                                6, 7, 2, 1
            int temp = array[i];                       // temp = 4                               // temp = 1               temp = 1                 temp = 2
            array[i] = array[array.length - 1 - i];    // array[0] = array[4-1-0] [0] = [3]      // array[1] = array[2]    array[0] = array[3]      array[1] = array[2]
            array[array.length - 1 - i] = temp;        // array[3] = 4                           // array[2] = 1           array[3] = 1             array[2] = 2
         }
        return  array;
    }
}




