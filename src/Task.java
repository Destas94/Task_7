import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int X = 5;
        int Y = 6;
        int Z = 7;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите number: ");
        int number = in.nextInt();
        if (number==X|number==Y|number==Z){
            System.out.println("Данное значение имеется в константах");
            }else{
            System.out.println("Такой константы нет!");
        }
    }

}
