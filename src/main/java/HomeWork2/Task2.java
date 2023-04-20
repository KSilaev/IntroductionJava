//2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

package HomeWork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        if (isIncreasing(inputSequence()))
            System.out.println("Введенная последовательность является возрастающей");
        else
            System.out.println("Введенная последовательность не является возрастающей");
    }

    /**
     * Ввод последовательности с клавиатуры
     * @return последовательность
     */
    public static int[] inputSequence ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("А теперь вводим саму последовательность:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    /**
     * Проверяет последовательность на возрастание
     * @param array
     * @return boolean
     */
    public static boolean isIncreasing (int[] array) {
        boolean res = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                res = false;
                break;
            }
        }
        return res;
    }
}
