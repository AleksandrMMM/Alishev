package WhileLessons;

public class Arrays_ofStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "goodbye";
        strings[2] = "java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        System.out.println(strings[1]);

        for(int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
        for (String string: strings
             ) {
            System.out.println(string);
        }

            int[] numbers2 = {1,2,3};
            int sum = 0;
            for(int x: numbers2){
                System.out.println(sum + x);
            }
        }
    }


