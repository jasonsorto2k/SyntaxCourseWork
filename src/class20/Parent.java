package class20;

public class Parent {

    String name;

    static String lastName;

    //private Parent(){
      //  System.out.println("I am a parent class constructor");
    //}

    public static void main(String[] args) {

        Parent p = new Parent();
    }


    public void hello(){
        System.out.println("Hello, from parent class.");
    }

    protected static void Bye (){
        System.out.println("protected method bye from parent class.");
    }

    private void money(){
        System.out.println("Private method money from parent class.");
    }


}
