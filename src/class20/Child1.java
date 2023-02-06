package class20;

public class Child1 extends Parent{

    public static void main(String[] args) {

        Child1 c1 = new Child1();
        c1.hello();
        c1.Bye();

        Parent.Bye();//accessing static method from parent class
        Child1.Bye();//accessing static method from  parent class using child class name

        //c1.money() "has private access modifier

        c1.name="Jason";
        Child1.lastName="Sorto";
    }
}
