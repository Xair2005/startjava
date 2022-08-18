public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n 1. Перевод псевдокода на язык Java");

        int age = 35;
        boolean isMen = false;
        double height = 1.70;
        char firstChar = "Tom".charAt(0);

        if (age > 20) {
            System.out.println("\nСтарше 20");
        } else {
            System.out.println("Младше 21");
        }

        if (!isMen) {
            System.out.println("Это женщина");
        }

        if (height < 1.80 ) {
            System.out.println("Рост ниже 180см");
        } else {
            System.out.println("Рост выше 179см");
        }

        if (firstChar == 'M') {
            System.out.println("Имя начинается на M");
        } else if (firstChar == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Имя начинается ни на M, ни на I");
        }

        System.out.println("\n 2. Поиск max и min числа");

        int numb1 = 101;
        int numb2 = 45;

        System.out.println("\nЧисла: " + numb1 + " и " + numb2);
        if (numb1 > numb2) {
            System.out.println("Минимальное = " + numb2 + ", Максимальное = " + numb1);
        } else if (numb2 > numb1) {
            System.out.println("Минимальное = " + numb1 + ", Максимальное = " + numb2);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n 3. Работа с числом");

        numb1 = -79;

        if (numb1 != 0) {
            System.out.println("\nЧисло " + numb1);
            if ((numb1 % 2) == 0) {
                System.out.print("Четное,");
            } else {
                System.out.print("Не четное,");
            }
            if (numb1 > 0) {
                System.out.print(" Положительно");
            } else {
                System.out.println(" Отрицательное");
            }
        }

        System.out.println("\n 4. Поиск одинаковых цифр в числах");

        numb1 = 359;
        numb2 = 351;

        System.out.println("\nЧисла: " + numb1 + " и " + numb2);
        if ((numb1 % 10) == (numb2 % 10)) {
            System.out.println("цифры " + numb1 % 10 + " совпадают в " + 1 + " разряде ");
        }
        if (((numb1 / 10) % 10) == ((numb2 / 10) % 10)) {
            System.out.println("цифры " + ((numb1 / 10) % 10) + " совпадают в " + 2 + " разряде");
        }
        if ((numb1 / 100) == (numb2 / 100)) {
            System.out.println("цифры " + numb1 / 100 +  " совпадают в " + 3 + " разряде");
        }

        System.out.println("\n 5. Определение буквы, числа или символа по их коду");

        char someChar = '\u0040'; 

        System.out.println("\nСимвол: " + someChar);

        if (someChar >= 65 && someChar <= 90) {
            System.out.println("Это заглавная буква");
        } else if (someChar >= 97 && someChar <= 122) {
            System.out.println("Это маленькая буква");
        } else if (someChar >= 30 && someChar <= 39) {
            System.out.println("Это число");
        } else {
            System.out.println("Это не буква и не число");
        }

        System.out.println("\n 6. Определение суммы вклада и начисленных банком %");

        double depositSum = 300000;
        int depositPercent = 5;

        System.out.println("\nСумма вклада: " + depositSum);
        if (depositSum < 100000) {
            depositPercent = 5;
        } else if (depositSum >= 100000 && depositSum <= 300000) {
            depositPercent = 7;
        } else if (depositSum > 300000) {
            depositPercent = 10;
        }

        System.out.println("Процент начисления: " + depositPercent + "%");
        System.out.println("Итоговая сумма с процентами: " + (depositSum + depositSum * 1 / 100 * depositPercent));

        System.out.println("\n 7. Определение оценки по предметам");

        int hystoryPercent = 59;
        int prgrmngPercent = 91;
        double averageScore = 0; 
        double averagePercent = 0; 

        if (hystoryPercent <= 60) {
            System.out.println("\n" + 2 + " История");
            averageScore += 2;
            averagePercent += hystoryPercent;
        } else if (hystoryPercent > 60 && hystoryPercent <= 73) {
            System.out.println(3 + " История");
            averageScore += 3;
            averagePercent += hystoryPercent;
        } else if (hystoryPercent > 73 && hystoryPercent <= 91) {
            System.out.println(4 + " История");
            averageScore += 4;
            averagePercent += hystoryPercent;
        } else if (hystoryPercent > 91) {
            System.out.println(5 + " История");
            averageScore += 5;
            averagePercent += hystoryPercent;
        } 

        if (prgrmngPercent <= 60) {
            System.out.println(2 + " Программирование");
            averageScore += 2;
            averagePercent += prgrmngPercent;
        } else if (prgrmngPercent > 60 && prgrmngPercent <= 73) {
            System.out.println(3 + " Программирование");
            averageScore += 3;
            averagePercent += prgrmngPercent;
        } else if (prgrmngPercent > 73 && prgrmngPercent <= 91) {
            System.out.println(4 + " Программирование");
            averageScore += 4;
            averagePercent += prgrmngPercent;
        } else if (prgrmngPercent > 91) {
            System.out.println(5 + " Программирование");
            averageScore += 5;
            averagePercent += prgrmngPercent;
        } 

        System.out.println("Средний бал по предметам: " + averageScore / 2);
        System.out.println("Средний процент по предметам: " + averagePercent / 2);

        System.out.println("\n 8. Расчет прибыли");

        double rentPrice = 5000;
        double sumMonth = 13000;
        double costPrice = 9000;
        double profitYear = 12 * (sumMonth - costPrice - rentPrice);
        if (profitYear > 0) {
            System.out.println("\nПрибыль за год: +" + profitYear);
        } else {
            System.out.println("\nПрибыль за год: " + profitYear);
        }

        System.out.println("\n 9. Подсчет количества банкнот");

        int billHundred = 4;    // кол-во купюр в банкомате 100$
        int billTens = 7;       // кол-во купюр в банкомате 10$
        int billOnes = 1000;    // кол-во купюр в банкомате 1$
        int summRequest = 567;  // запрошенная сумма

        int toGiv100 = summRequest / 100;       //на выдачу купюр номинал 100
        int toGiv10 = summRequest % 100 / 10;   //на выдачу купюр номинал 10
        int toGiv1 = summRequest %  10;         //на выдачу купюр номинал 1

        if (toGiv100 > billHundred) {
            toGiv100 = billHundred;
            toGiv10 = (summRequest - toGiv100 * 100) / 10;        
        }

        if (toGiv10 > billTens) {
            toGiv10 = billTens;
            toGiv1 = (summRequest - toGiv100 * 100 - toGiv10 * 10);        
        }

        System.out.println("\nЗапрошенная сумма " + summRequest + "$");
        System.out.println("Выдача банкнот...");
        System.out.println("Банкнота 100$: " + toGiv100 + "шт");
        System.out.println("Банкнота 10$: " + toGiv10 + "шт");
        System.out.println("Банкнота 1$: " + toGiv1 + "шт");
    }
}