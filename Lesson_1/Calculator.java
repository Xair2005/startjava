public class Calculator {
    public static void main(String[] args) {
        int numb1 = 123;
        int numb2 = 5;
        String sign = "t";
        int result = 0;

        if (sign == "+") {
            result = numb1 + numb2;
        } else if (sign == "-") {
            result = numb1 - numb2;
        } else if (sign == "*") {
            result = numb1 * numb2;
        } else if (sign == "^") {
            result = numb1;
            for (int i = 2; i <= numb2; i++) {
                result *= numb1;
            }
        } else if (sign == "/") {
            if (numb2 != 0) {
                result = numb1 / numb2;    
            }
        } else if (sign == "%") {
            if (numb2 != 0) {
                result = numb1 % numb2;
            }
        } else {
            System.out.println("Предупреждени: Использован не верный знак оператора \"" + sign 
                + "\" Используйте знаки +; -; *; ^; /; %");
        }
        System.out.println(numb1 + " " + sign + " " + numb2 + " = " + result);
    }
}
