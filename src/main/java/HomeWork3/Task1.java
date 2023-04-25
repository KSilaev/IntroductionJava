//Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший»

package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Good> goods = GetGoods();
        double max = 0;
        for(Good good: goods) {
            if(good.name.contains("высший"))
            {
                if(max < good.price && (good.sort == 1 || good.sort == 2)){
                    max = good.price;
                }
            }
        }
        System.out.println("Наибольшая цена товаров: " + max);
    }

    public static List<Good> GetGoods() {
        List<Good> goods = new ArrayList<Good>();
        goods.add(new Good("хомут", 474.0, 1));
        goods.add(new Good("высший кронштейн", 305.0, 2));
        goods.add(new Good("фланец", 635.50, 1));
        goods.add(new Good("прокладка высшая", 270.1, 1));
        goods.add(new Good("гофра нижняя", 902.0, 3));
        return goods;
    }
}
