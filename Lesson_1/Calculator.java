public class Calculator {
    public static void main(String[] args) {
        int numb1 = 123;
        int numb2 = 5;
        char sign = 't';
        int result = 0;
        char plus = '+';
        char minus = '-';
        char multiply = '*';
        char divide = '/';
        char extent = '^';
        char module = '%';


        if (sign == plus) {
            result = numb1 + numb2;
        } else if (sign == minus) {
            result = numb1 - numb2;
        } else if (sign == multiply) {
            result = numb1 * numb2;
        } else if (sign == extent) {
            result = numb1;
            for (int i = 2; i <= numb2; i++) {
                result *= numb1;
            }
        } else if (sign == divide) {
            if (numb2 != 0) {
                result = numb1 / numb2;    
            }
        } else if (sign == module) {
            if (numb2 != 0) {
                result = numb1 % numb2;
            }
        } else {
            System.out.println("Предупреждение: Использован не верный знак оператора \"" + sign 
                + "\" Используйте знаки +; -; *; ^; /; %");
        }
        System.out.println(numb1 + " " + sign + " " + numb2 + " = " + result);
    }
}
