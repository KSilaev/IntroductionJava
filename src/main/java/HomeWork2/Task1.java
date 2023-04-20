//1) Дана последовательность N целых чисел. Найти сумму простых чисел.

package HomeWork2;

public class Task1 {
    public static void main(String[] args) {
        String str = "67 25 22 35 88 9 2 45 32 5 325 2 105";
        String[] strNums = str.split(" ");
        int sumPrime = 0;
        int num = 0;
        for (int i = 0; i < strNums.length; i++) {
            num = Integer.parseInt (strNums[i]);
            if (isPrime(num)) {
                sumPrime += num;
            }
//            System.out.println(num + " " + isPrime(num));
        }
        System.out.println("Сумма простых чисел: " + sumPrime);
    }

    /**
     * Проверяет число на простоту методом за корень
     * @param n - число
     * @return boolean
     */
    public static boolean isPrime (int n) {
        if (n==1)
            return false;
        int i = 2;
        while (i*i <= n) {
            if (n % i == 0)
                return false;
            i += 1;
        }
        return true;
    }
}
