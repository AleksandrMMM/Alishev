package WhileLessons;

public class ClassAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setMameAndAge("Roman", 54);

        person1.sayHello();
        person1.speak();

        Person person2 = new Person();
        person2.setMameAndAge("Vova", 24);

        person2.speak();

        int years1 = person1.yarsOld();
        int years2 = person2.yarsOld();

        System.out.println(years1);
        System.out.println(years2);

    }
}

class Person{
    String name;
    int age;

    void setMameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    void speak(){
        for(int i = 0; i < 3; i++) {
            System.out.println("my name " + name + " my age " + age);
        }
    }
    void sayHello(){
        System.out.println("say Hello");
    }
    int yarsOld() {
        int years = 65 - age;
        return years;
    }
}
