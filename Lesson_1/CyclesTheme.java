public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n 1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("\nВ промежутке [-10, 21] сумма четных чисел = " + sumEven + 
            ", а нечетных = " + sumOdd);

        System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int numb1 = -1;
        int numb2 = 5;
        int numb3 = 10;
        int min = numb1;
        int max = numb2;

        if (numb2 < min) {
            min = numb2;
        }
        if (numb3 < min) {
            min = numb3;
        }
        if (numb1 > max) {
            max = numb1;
        } 
        if (numb3 > max){
            max = numb3;
        }
        for (int i = max--; i > min; i--) {
            System.out.print(i + "; ");
        }

        System.out.println("\n \n3. Вывод реверсивного числа и суммы его цифр");
        numb1 = 1234;
        int sumDigits = 0;
        int digit = 0;
        System.out.print("\nИсходное число в обратном порядке: ");
        while (numb1 > 0) {
            digit = numb1 % 10;
            sumDigits += digit;
            System.out.print(digit);
            numb1 /= 10;
        }
        System.out.print("\nСумма его цифр: " + sumDigits);

        System.out.println("\n\n 4. Вывод чисел на консоль в несколько строк \n");
        
        for (int j = 1; j < 24; j += 2) {
            System.out.printf("%4d", j);
            for (int i = 2; i <= 5; i++) {
                j += 2;
                if (j < 24) {
                    System.out.printf("%4d", j);
                    if (i % 5 == 0) {
                        System.out.println();
                    }
                } else {
                    System.out.printf("%4d", 0);
                }
            }
        }

        System.out.println("\n\n 5. Проверка количества единиц на четность");

        int srcNumb = 3141591;
        int countUnit = 0;
        System.out.print("\nЧисло " + srcNumb + " содержит ");
        while (srcNumb > 0) {
            if (srcNumb % 10 == 1) {
                countUnit++;
            }
            srcNumb /= 10;
        }
        if (countUnit % 2 == 0) {
            System.out.print(countUnit + "(четное) количество единиц");
        } else {
            System.out.print(countUnit + "(нечетное) количество единиц");
        }

        System.out.println("\n\n 6. Отображение фигур в консоли");

        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print("*");
            }
        }

        int i = 0;
        int j = 1;
        int k = 5;
        System.out.println("\n");
        while (i < 15) {
            while (j < k) {
                System.out.print("#");
                j++;
                i++;
            }
            System.out.println("#");
            j = 1;            
            k--;
            i++;
        }

        System.out.print("\n");
        i = 1;
        k = 1;

        do {
            j = 1;
            do {
                System.out.print("$");
                j++;
            } while (j <= k);
            System.out.print("\n");

            
            if (i < 3) {
                k++;
            } else {
                k--;
            }
            i++;
        } while (i <= 5);

        System.out.println("\n 7.Отображение ASCII-символов\n");
        int tmpCodeChar = 0;
        System.out.printf("%4s", "Dec");
        System.out.printf("%16s", "Char" + "\n"); 
        for (i = 1; i <= 122; i++) {
            if ((i <= 47) && (i % 2 != 0)) {
                System.out.printf("%4s", i);
                System.out.printf("%16s", (char) i + "\n");
            } else if ((i >= 97 && i <= 122) && (i % 2 == 0)) {
                System.out.printf("%4s", i);
                System.out.printf("%16s", (char) i + "\n");
            }
        }

        System.out.println("\n 8. Проверка, является ли число палиндромом");
        srcNumb = 72527;
        int tmpNumbL = srcNumb;
        int tmpNumbR = srcNumb;
        int countDig = 0;
        int exponent = 1; 
        int leftDig = 0;
        int rightDig = 0;
        boolean isPalindrom = true;
        
        do {
            countDig++;
            tmpNumbR /= 10;
        } while (tmpNumbR > 0);
        for (i = 1; i <= countDig / 2; i++) {
            exponent = 1;
            int expLev = 1;
            tmpNumbR = srcNumb;
            do {
             exponent *= 10;
             expLev++;
         } while (expLev <= i);
         tmpNumbR = tmpNumbR % exponent;
         tmpNumbR = tmpNumbR / (exponent / 10);
         rightDig = tmpNumbR;
         tmpNumbL = srcNumb;
         exponent = 1;
         expLev = countDig - i + 1;
         k = 1;
         for (k = 1; k <= expLev; k++) {
            exponent *= 10;
        }
        tmpNumbL = tmpNumbL % exponent;
        tmpNumbL = tmpNumbL / (exponent / 10);
        leftDig = tmpNumbL;
        if (leftDig != rightDig) {
            isPalindrom = false;
        }
    }
    if (isPalindrom == true) {
        System.out.println("\nчисло " + srcNumb + " является палиндромом");
    } else {
       System.out.println("\nчисло " + srcNumb + " является не палиндромом");
   }

        System.out.println("\n 9. Определение, является ли число счастливым");
        srcNumb = 314152;
        int tmpNumb = srcNumb;
        String leftText = "";
        String rightText = "";
        int sum1 = 0;
        int sum2 = 0;
        i = 1;
        while (tmpNumb > 0) {
            if (i <= 3) {
                leftText = tmpNumb % 10 + leftText;
                sum1 = sum1 + tmpNumb % 10;
            } else {
                rightText = tmpNumb % 10 + rightText;
                sum2 = sum2 + tmpNumb % 10;
            }
            tmpNumb = tmpNumb / 10;
            i++;
        }
        System.out.println("\nСумма цифр " + leftText + " = " + sum1);
        System.out.println("Сумма цифр " + rightText + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число " + srcNumb + " счастливое");
        } else {
            System.out.println("Число " + srcNumb + " не счастливое");
        }

        System.out.println("\n 10. Вывод таблицы умножения Пифагора");
        for (j = 1; j <= 9; j++) {
            if (j == 1) {
             System.out.print("\n   |");
         }
         else {
            System.out.printf("%4d", j);
        }
    }
    for (j = 1; j <= 9; j++) {
        if (j == 1) {
            System.out.print("\n");
        } else {
            System.out.print("-----");
        }
    }
    for (i = 2; i <= 9; i++) {
        System.out.printf("\n%2d", i);
        System.out.print(" |");
        for (j = 2; j <= 9; j++) {
            if (i == 1) {
                System.out.printf("%4d", j);
            } 
            else {
                System.out.printf("%4d", i*j);
            }
        }
    }
}
}