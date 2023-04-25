//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//        Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1

package HomeWork4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        System.out.println("А теперь вводите сами элементы по одному: ");
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        scanner.close();
        System.out.print("Список в перевернутом виде: ");
        for (int i = 0; i < n; i++) {
            System.out.print(integerLinkedList.pollLast() + "->");
        }
    }
}
