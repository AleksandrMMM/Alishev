package JavaRush;

public class Task0303 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(12, 14.6));
        System.out.println(convertEurToUsd(15, 32.9));

        //напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
        //напишите тут ваш код

    }
}
