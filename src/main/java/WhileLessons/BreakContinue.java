package WhileLessons;

public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            i++;
            if(i == 15){
                break;
            }
            System.out.println(i);
        }
        System.out.println("the end");
    }
}

class cont{
    public static void main(String[] args) {
        for(int i = 0;i <= 15; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println("nechet chislo " + i);

        }

    }


}
