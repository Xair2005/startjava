public class CyclesTheme {
 public static void main(String[] args) {

    System.out.println("\n 1. Подсчет суммы четных и нечетных чисел");

    int counter = -10;
    int evenNums = 0;
    int notevenNumbs = 0;

    do {
        if (counter != 0) {
            if (counter % 2 == 0 ) {
                evenNums++;
            } else {
                notevenNumbs++;
            }
        }
        counter++;
    }
    while (counter <=21);
    System.out.println("\nВ промежутке [-10, 21] сумма четных чисел = " + evenNums + ", а нечетных = " + notevenNumbs);

    System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания");

    



}
}