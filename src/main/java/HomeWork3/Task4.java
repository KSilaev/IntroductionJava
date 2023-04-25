//4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(12, 25, 37, 67, 623, 53));
        int max = intList.get(0);
        int min = intList.get(0);
        int sum = 0;
        for(int i = 0; i < intList.size(); i++){
            if (intList.get(i) > max) max = intList.get(i);
            if (intList.get(i) < min) min = intList.get(i);
            sum += intList.get(i);
        }
        System.out.printf("Максимальное: %d\n",max);
        System.out.printf("Минимальное: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/intList.size()));
    }


}
