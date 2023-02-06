package HW_1_31_2023;

public class Task3 {

    // 3) Write a java class that have 4 constructors with 4 different access levels of constructors (private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    // and observe result.

    public Task3(){
        System.out.println("Constructor without any parameters");
    }

    private Task3(String name){
        System.out.println("Constructor with String as parameters");
    }

    protected Task3(int age){
        System.out.println("Constructor with int as a parameter");
    }

    Task3(Double weight){
        System.out.println("Constructor with double as a parameter");
    }


}

