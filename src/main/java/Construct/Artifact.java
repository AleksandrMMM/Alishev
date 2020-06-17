package Construct;

public class Artifact {
    int number;
    String culture;

    public  Artifact(int number){
        this.number = number;

    }
    public Artifact(int number, String culture){
        this.number = number;
        this.culture = culture;
    }

    public static void main(String[] args) {
        Artifact Art = new Artifact(12);
        Artifact Art2 = new Artifact(15, "Actek");

        System.out.println(Art.number);
        System.out.println(Art2.culture);
    }
}
