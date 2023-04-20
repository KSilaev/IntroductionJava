//3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива

package HomeWork2;

import java.util.Scanner;

public class Taas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int size = input.nextInt();
        int array[] = new int[size];
        int sumIndex = 0;
        System.out.println("А теперь вводим саму последовательность:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] > 9 && array[i] < 100)
                sumIndex += i;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] < 0)
                array[i] = sumIndex;
            System.out.println("Элемент " + i + " " + array[i]);
        }
    }
}
