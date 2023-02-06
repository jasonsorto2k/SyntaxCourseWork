package class19;

public class ThisKeyword {

    int a,b;                    // ---------------Instance variables

    ThisKeyword(int a, int b){
        this.a=a;               //---------------Initializing instance variables using This keyword
        this.b=b;

    }

    public void sum(int a, int b){
        System.out.println("Sum of local variables = "+ (a+b));
        System.out.println("Sum of instance variables = "+ (this.a+this.b));

    }

    void hello(){
        System.out.println("Hello, Batch 15!");
    }

    void howAreYou(){
        System.out.println("How are you?");
    }

    void greetings (){
        hello();            // ----------calling methods within another method
        howAreYou();

    }


    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(10,20);
        obj.sum(100,200);

        //----------------------------------------------

        obj.greetings();



    }
}
