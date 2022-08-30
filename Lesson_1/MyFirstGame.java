public class MyFirstGame {
    public static void main(String[] args) {
        int compNumb = 100;
        int userNumb = 4;
        boolean isFinish = false;
        int i = 1;
        do {
            if (userNumb == compNumb) {
                isFinish = true;
                System.out.println("Вы победили!");
                System.out.println("c " + i + " попытки");
            } else if (userNumb > compNumb) {
                System.out.println("Число " + userNumb + " больше того, что загадал компьютер");
                userNumb = userNumb - 10;
            } else if (userNumb < compNumb) {
                System.out.println("Число " + userNumb + " меньше того, что загадал компьютер");
                userNumb = userNumb + 20;
            }
            if (userNumb > 100) {
                userNumb = userNumb - 99;
            }
            i++;
            if (i > 1000 && isFinish != true) {
                isFinish = true;
                System.out.println("Мы зациклились!");
            }
        } while (isFinish != true);
    }
}