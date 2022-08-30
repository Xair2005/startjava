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

        System.out.println("\n 2. Вывод чисел в интервале (min и max) в порядке убывания\n");

        int numb1 = -1;
        int numb2 = 5;
        int numb3 = 10;
        int min = numb1;
        int max = numb2;
        int i = max;

        if (numb1 < numb2) {
            min = numb1;
        } else {
            min = numb2;
        }
        if (min > numb3){
            min = numb3;
        }
        if (numb1 > numb2) {
            max = numb1;
        } else {
            max = numb2;
        }
        if (max < numb3){
            max = numb3;
        }
        for (i = max; i >= min; i--) {
            System.out.print(i + "; ");
        }

        System.out.println("\n \n3. Вывод реверсивного числа и суммы его цифр");

        numb1 = 1234;
        int sumDigits = 0;
        i = 10;
        int tempDig = 0;
        System.out.print("\nИсходное число в обратном порядке: ");
        while (i <= 10000) {
            tempDig = numb1 % i;
            tempDig = tempDig / (i / 10);
            sumDigits += tempDig;
            System.out.print(tempDig);
            i*=10;
        }
        System.out.print("\nСумма его цифр: " + sumDigits);

        System.out.println("\n \n 4. Вывод чисел на консоль в несколько строк \n");
        
        for (int j = 1; j < 24;j+=2) {
            System.out.printf("%4d", j);
            for (i = 2; i <= 5;i++) {
                j+=2;
                if (j < 24 ) {
                    System.out.printf("%4d", j);
                    if (i % 5 == 0) {
                        System.out.print("\n");
                    }
                } else {
                    System.out.printf("%4d", 0);
                }
            }
        }

        System.out.println("\n \n5. Проверка количества единиц на четность");

        int tempNumb = 3141591;
        int expanentCount = 1;

        int j = 0;
        for (i = 1; i <= 7; i++) {
            if (tempNumb % (10*expanentCount) / expanentCount == 1) {
                j++;                    
            }            
            expanentCount*=10;
        }
        if (j % 2 == 0) {
            System.out.println("\nчисло " + tempNumb + " содержит " + j + "(четное) количество единиц");
        } else {
            System.out.println("\nчисло " + tempNumb + " содержит " + j + "(нечетное) количество единиц");
        }

        System.out.println("\n 6. Отображение фигур в консоли");

        for (i = 0; i < 50;i++) {
            if (i % 10 == 0) {
                System.out.print("\n*");
            } else {
                System.out.print("*");
            }
        }

        i = 0;
        j = 1;
        int k = 5;
        System.out.print("\n \n");
        while (i < 15) {
            while (j < k) {
                System.out.print("#");
                j++;
                i++;
            }
            System.out.print("#\n");
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
            } while ( j <= k);
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
        for (i = 1; i <= 122 ;i++) {
            if ((i <= 47) && (i % 2 != 0)) {
                System.out.printf("%4s", i);
                System.out.printf("%16s", (char) i + "\n");
            } else if ((i >= 97 && i <= 122) && (i % 2 == 0)) {
                System.out.printf("%4s", i);
                System.out.printf("%16s", (char) i + "\n");
            }
        }

        System.out.println("\n 8. Проверка, является ли число палиндромом");

        tempNumb = 123454331;
        String tempNumbStr = Integer.toString(tempNumb);

        j = tempNumbStr.length();
        if (j % 2 !=0) {
            boolean isPalindrom = true;
            for (i = 0;i < j / 2;i++) {
                if (tempNumbStr.charAt(i) != tempNumbStr.charAt(j - i - 1)) {
                    isPalindrom = false;
                }
            }
            if (isPalindrom == true) {
                System.out.println("\nчисло " + tempNumb + " является палиндромом");
            } else {
                System.out.println("\nчисло " + tempNumb + " является не палиндромом");
            }
        } else {
            System.out.println("\nчисло " + tempNumb + " является не палиндромом");
        }

        System.out.println("\n 9. Определение, является ли число счастливым");

        tempNumb = 314152;
        expanentCount = 1;
        String leftText = "";
        String rightText = "";
        int sum1 = 0;
        int sum2 = 0;

        j = 0;
        for (i = 1; i <= 6; i++) {

            if (i <= 3) {
                leftText = tempNumb % (10*expanentCount) / expanentCount + leftText;
                sum1 = sum1 + (tempNumb % (10*expanentCount) / expanentCount);
            } else {
                rightText = tempNumb % (10*expanentCount) / expanentCount + rightText;
                sum2 = sum2 + (tempNumb % (10*expanentCount) / expanentCount);
            }
            expanentCount*=10;
        }

        System.out.println("\nСумма цифр " + leftText + " = " + sum1);
        System.out.println("Сумма цифр " + rightText + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число " + tempNumb + " счастливое");
        } else {
            System.out.println("Число " + tempNumb + " не счастливое");
        }

        System.out.println("\n 10. Вывод таблицы умножения Пифагора");


        for (j = 1;j <= 9;j++) {
            if (j == 1) {
               System.out.print("\n   |");
           }
           else {
            System.out.printf("%4d", j);
        }
    }

    for (j = 1;j <= 9;j++) {
        if (j == 1) {
            System.out.print("\n");
        } else {
            System.out.print("-----");
        }

    }

    for (i = 2;i <= 9 ;i++ ) {
        System.out.printf("\n%2d", i);
        System.out.print(" |");
        for (j = 2;j <= 9 ;j++ ) {
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