package JavaRush;

import javax.imageio.stream.ImageInputStream;

public class Task0314 {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){

            for(int j = 1; j <= 10; j++){
                if(j == 11){
                    break;
                }
                System.out.print(i * j + " " );


            }


            System.out.println();
        }

    }
}
