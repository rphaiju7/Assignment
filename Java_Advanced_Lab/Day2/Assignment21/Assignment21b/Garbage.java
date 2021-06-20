package Java_Advanced_Lab.Day2.Assignment21.Assignment21b;

public class Garbage {
    String garbageLocation;
    Garbage garbage;

    public static void main(String[] args) {
        Garbage garbage1 = new Garbage();
        garbage1.garbage = new Garbage();
        garbage1.garbageLocation = "Mysore";
        garbage1.garbage.garbageLocation = "Hootagalli";
        garbage1.garbage.garbage= garbage1;
        garbage1.garbage.garbage = null;
        garbage1.garbage=null;
        garbage1 =null;
    }
}