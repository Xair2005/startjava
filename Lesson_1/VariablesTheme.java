public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n 1. Создание переменных и вывод их значений на консоль");

        byte quantCore = 2;
        short quantMemory = 8;
        int quantFolders = 55997;
        long quantFiles = 373456;
        float quantGHz = 1.7f;
        double freeKbOnDisc = 29319524.345;
        char typeOS = 'W';
        boolean isWork = true;

        System.out.println("\nКол-во ядер: " + quantCore);
        System.out.println("Кол-во опер.памяти: " + quantMemory);
        System.out.println("Кол-во папок: " + quantFolders);
        System.out.println("Кол-во файлов: " + quantFiles);
        System.out.println("Тактовая чистота: " + quantGHz);
        System.out.println("Свободно на диске(Kb): " + freeKbOnDisc);
        System.out.println("Первый символ ОС: " + typeOS);
        System.out.println("В рабочем состоянии? " + isWork);

        System.out.println("\n 2. Расчет стоимости товара со скидкой");

        int priceGoodsX = 100;
        int priceGoodsY = 200;
        float discount = 0.11f;

        float discountPrice = (priceGoodsX + priceGoodsY) * discount;
        float totalPrice = priceGoodsX + priceGoodsY - discountPrice ;

        System.out.println("\nСумма скидки: " + discountPrice );
        System.out.println("Сумма итого: " + totalPrice );

        System.out.println("\n 3. Вывод на консоль слова JAVA");

        System.out.println("\n   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n 4. Отображение min и max значений числовых типов данных");

        byte valueByte = 127;
        short valueShort = 32767;
        int valueInt = 2147483647;
        long valueLong = 9223372036854775807l;

        System.out.println("\n" + valueByte);
        System.out.println(++valueByte);
        System.out.println(--valueByte);
        System.out.println(valueShort);
        System.out.println(++valueShort);
        System.out.println(--valueShort);
        System.out.println(valueInt);
        System.out.println(++valueInt);
        System.out.println(--valueInt);
        System.out.println(valueLong);
        System.out.println(++valueLong);
        System.out.println(--valueLong);

        System.out.println("\n 5. Перестановка значений переменных");

        double num1 = 1.1;
        double num2 = 2.2;
        double tmp;

        System.out.println("\ni. с помощью третьей переменной");
        System.out.println("исх.Значение1 = " + num1);
        System.out.println("исх.Значение2 = " + num2);
        tmp = num1;
        num1 = num2;
        num2 = tmp; 
        System.out.println("новое.Значение1 = " + num1);
        System.out.println("новое.Значение2 = " + num2);    

        System.out.println("ii. с помощью арифметических операций");
        System.out.println("исх.Значение1 = " + num1);
        System.out.println("исх.Значение2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новое.Значение1 = " + num1);
        System.out.println("новое.Значение2 = " + num2);

        System.out.println("iii. с помощью побитовой операции");
        System.out.println("исх.Значение1 = " + num1);
        System.out.println("исх.Значение2 = " + num2);
        //num1 = num1 ^ num2;
        // Затруднение в решении и понимании
        System.out.println("Затруднение в решении и понимании");
        //System.out.println("новое.Значение1 = " + num1);
        //System.out.println("новое.Значение2 = " + num2);

        System.out.println("\n 6. Вывод символов и их кодов");

        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;

        System.out.println("\nдля кода " + codeChar1 + " соответствует символ " + (char) codeChar1);
        System.out.println("для кода " + codeChar2 + " соответствует символ " + (char) codeChar2);
        System.out.println("для кода " + codeChar3 + " соответствует символ " + (char) codeChar3);
        System.out.println("для кода " + codeChar4 + " соответствует символ " + (char) codeChar4);
        System.out.println("для кода " + codeChar5 + " соответствует символ " + (char) codeChar5);

        System.out.println("\n 7. Произведение и сумма цифр числа");

        int srcNum = 345;

        int hundreds = srcNum / 100;
        int tens = (srcNum % 100) / 10;
        int units = srcNum % 10;
        System.out.println("\n" + hundreds + " " + tens + " " + units);

        int sumDigits = hundreds + tens + units;
        System.out.println("Сумма цифр числа " + srcNum + " = " + sumDigits);
        int prodDigits =  hundreds * tens * units;
        System.out.println("Произведение цифр числа " + srcNum + " = " + prodDigits);

        System.out.println("\n 8. Вывод на консоль ASCII-арт Дюка");

        char fSlash = '/';
        char bSlashDouble = '\\';
        char oParenthesis = '(';
        char cParenthesis = ')';
        char underscope = '_';
        char space = ' ';

        System.out.println("\n" + space + space + space + space 
           + fSlash + bSlashDouble + space + space + space + space);
        System.out.println("" + space + space + space 
           + fSlash + space + space + bSlashDouble + space + space + space);
        System.out.println("" + space + space + fSlash + underscope + oParenthesis + space + cParenthesis + bSlashDouble + space + space);
        System.out.println("" + space + fSlash + space + space + space + space + space + space 
           + bSlashDouble + space);
        System.out.println("" + fSlash + underscope + underscope + underscope + underscope + fSlash + bSlashDouble + underscope + underscope + bSlashDouble + "");  

        System.out.println("\n 9. Отображение количества сотен, десятков и единиц числа");

        srcNum = 123;
        int digHund = srcNum / 100;
        int digTens = (srcNum % 100 ) / 10;
        int digOnes = srcNum % 10;

        System.out.println("\nЧисло " + srcNum + " содержит ");
        System.out.println(digHund + " сотен ");
        System.out.println(digTens + " десятков ");
        System.out.println(digOnes + " единиц ");

        System.out.println("\n 10. Преобразование секунд");

        int totalSec = 86399;       
        int timeHH = totalSec / 3600;
        int timeMM = totalSec % 3600 / 60;
        int timeSS = totalSec  % 60;

        System.out.println("\nВремя = " + timeHH + ":" + timeMM + ":" + timeSS);
    }
}