package Java_Advanced_Lab.Day2.Assignment21;

class Tyre{}
public class Car {
    Tyre tyre;
    String name;

    public static void main(String[] args) {
        Car carMain = new Car();
        carMain.setFeatures(carMain);
    }
    void setFeatures(Car car){
        tyre = new Tyre();
        car.setName("Swift");
    }
    void setName(String name)
    {
        this.name = name;
    }
}