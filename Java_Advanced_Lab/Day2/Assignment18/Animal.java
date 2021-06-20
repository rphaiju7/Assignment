package Java_Advanced_Lab.Day2.Assignment18;

interface PetAnimal{
    public void friend();
    public void plays();
}
public class Animal {
    String name;
    int age;
    char gender;

    public Animal(String name,int age,char gender){
        this.name = name;
        this.age=age;
        this.gender=gender;
    }

}
class Hippo extends Animal{

    public Hippo(String name, int age, char gender) {
        super(name, age, gender);
    }
    public void displayInfo(){
        System.out.println("Animal: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class dog extends Animal implements PetAnimal{

    public dog(String name, int age, char gender) {
        super(name, age, gender);
    }
    @Override
    public void friend() {
        System.out.println("Good dog");
    }

    @Override
    public void plays() {
        System.out.println("Good Dog likes to play");
    }
    public void displayInfo(){
        System.out.println("Animal: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class cat extends Animal implements PetAnimal{

    public cat(String name, int age, char gender) {
        super(name, age, gender);
    }
    @Override
    public void friend() {
        System.out.println("Affectionate animal");
    }

    @Override
    public void plays() {
        System.out.println("Entertaining animal");
    }
    public void displayInfo(){
        System.out.println("Animal: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class Main{
    public static void main(String[] args) {
        Hippo hippo = new Hippo("Hippo",5,'M');
        hippo.displayInfo();
        dog dog = new dog("Pup",1,'M');
        dog.friend();
        dog.plays();
        dog.displayInfo();
        cat cat = new cat("Mini",2,'F');
        cat.friend();
        cat.plays();
        cat.displayInfo();
    }
}