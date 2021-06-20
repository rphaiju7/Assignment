package Java_Advanced_Lab.Day2.Assignment20.Package1;

public class Child1 extends Base{
    public void getValues() {
        System.out.println(getVariable1());
        System.out.println(getVariable2());
        System.out.println(variable3);
        System.out.println(variable4);
    }

}
class Child2 extends Base{
    public static void main(String[] args) {
        Base base = new Base();
        System.out.println(base.variable3);
        System.out.println(base.variable4);
    }
}