//2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров
// заданного сорта с наименьшей ценой.

package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<Good2> goods = GetGoods();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        int sortG = input.nextInt();
        List<Good2> goodMinPrice = new ArrayList<Good2>();
        double min = goods.get(0).price;
        for(Good2 good: goods) {
            if (good.sort == sortG) {
                if (min >= good.price) {
                    min = good.price;
                }
            }
        }
        for(Good2 good: goods) {
             if(good.sort == sortG) {
                 if(good.price == min){
                     goodMinPrice.add(good);
                 }
             }
        }
        System.out.println("Наименования товаров сорта " + sortG + " с наименьшей ценой:");
        for (Good2 good: goodMinPrice) {
            System.out.println(good.name);
        }
    }

    public static List<Good2> GetGoods() {
        List<Good2> goods = new ArrayList<Good2>();
        goods.add(new Good2("хомут", "Russia", 320.0,474.0, 1));
        goods.add(new Good2("высший кронштейн", "Russia", 170.0,305.0, 2));
        goods.add(new Good2("фланец", "Russia", 420.0,635.50, 1));
        goods.add(new Good2("прокладка высшая", "Russia", 72.5,270.1, 1));
        goods.add(new Good2("гофра нижняя", "Russia", 318.0,902.0, 3));
        goods.add(new Good2("обжимной хомут", "Russia", 462.5,270.1, 1));
        return goods;
    }

}
