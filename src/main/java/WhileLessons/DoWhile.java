package WhileLessons;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);
        System.out.println("vvedi 5");
        int t = s.nextInt();
        while (t != 5){
            System.out.println("vvedi 5");
            t = s.nextInt();
        }
        System.out.println("vy vvely 5");
*/
        int v;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("vvedi 12");
            v = s.nextInt();

        }while (v != 12);
        System.out.println("vy vvely 12");

    }

}
