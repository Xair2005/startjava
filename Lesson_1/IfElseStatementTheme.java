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
};

if (!isMen) {
    System.out.println("Это женщина");
};

if (height < 1.80 ) {
    System.out.println("Рост ниже 180см");
} else {
    System.out.println("Рост выше 179см");
};

if (firstChar == 'M') {
    System.out.println("Имя начинается на M");
} else if (firstChar == 'I') {
    System.out.println("Имя начинается на I");
} else {
    System.out.println("Имя начинается ни на M, ни на I");
};

System.out.println("\n 2. Поиск max и min числа");





};
};