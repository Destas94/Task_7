import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите number: ");
        int number = in.nextInt();
        switch(number)
        {
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
            default :
                System.out.println("Такой константы нет!");
        }
        System.out.println("Данное значение имеется в константах");
    }
}
