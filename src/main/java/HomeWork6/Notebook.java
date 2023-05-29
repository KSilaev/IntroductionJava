//        • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        • Создать множество ноутбуков.
//        • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
package HomeWork6;

public class Notebook {
    public static void main(String[] args) throws Exception {

        NoteList Notebook_1 = new NoteList(1, "MSI", 4, 256, "Linux", "BLUE", 50000);
        NoteList Notebook_2 = new NoteList(2, "ASUS", 16, 512, "Windows10", "GRAY", 75000);
        NoteList Notebook_3 = new NoteList(3, "HP", 16, 1000, "FreeDOS", "BLACK", 57000);
        NoteList Notebook_4 = new NoteList(4, "MAC", 8, 256, "MacOS", "WHITE", 33000);
        NoteList Notebook_5 = new NoteList(5, "ACER", 4, 128, "Windows11", "BLACK", 49000);
        NoteList[] store = new NoteList[] { Notebook_1, Notebook_2, Notebook_3, Notebook_4, Notebook_5 };

        int scaner = input.Int(
                "Меню: \n1 - показать список ноутбуков\n2 - Размер диска\n3 - Объем ОЗУ\n4 - Операционная система \n5 - Цвет\n6 - Производитель\n7 - Цена\n");

        switch (scaner) {
            case 1:
                System.out.println("Список ноутбуков: ");
                System.out.println(Notebook_1);
                System.out.println(Notebook_2);
                System.out.println(Notebook_3);
                System.out.println(Notebook_4);
                System.out.println(Notebook_53);
                break;
            case 2:
                int hd = input.Int("Выберете объем диска: 256 ГБ, 128 ГБ, 512 ГБ, 1000 ГБ");
                System.out.println(NoteList.getHD(store, hd));
                break;
            case 3:
                int ram = input.Int("Выберете размер ОЗУ: 4 Гб, 8 Гб, 16 Гб");
                System.out.println(NoteList.getRAM(store, ram));
                break;
            case 4:
                String sc2 = input.Str("Выберете нужную ОС: Linux, Windows10, FreeDOS, MacOS, Windows11");
                System.out.println(NoteList.getSystem(store, sc2));
                break;
            case 5:
                String sc3 = input.Str("Выберете цвет: BLUE, GRAY, BLACK, WHITE");
                System.out.println(NoteList.getColour(store, sc3));
                break;
            case 6:
                String sc1 = input.Str("Выберете производителя: MSI, ASUS, HP, MAC, ACER");
                System.out.println(NoteList.getBrand(store, sc1));
                break;
            case 7:
                int price = input.Int("Выберете желаемую цену: 50000, 75000, 57000, 33000, 49000");
                System.out.println(NoteList.getPrice(store, price));
                break;
            default:
                System.out.println("Выберете необходимый пункт (1 - 7)");
        }
    }
}