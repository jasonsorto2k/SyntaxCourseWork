package class13;

public class BuilderDemo {

    public static void main(String[] args) {

        String state = "VA";
        String state2 = "VA";
        String state3 = "VA";
        String state4 = "VA";
        String state5 = "VA";
        String state6 = "VA";
        String state7 = "VA";

        // Saves memory but is a slow process,
        // immutable strings are not changeable once created on the memory of computer, and the reason they're
        // immutable is when same memory cell can be shared many variables and if we allow any of the variable
        // to change the value it can break the computer system


        // When we should use String Class:
        //  When we want to save as much memory as possible, and we are okay if the programs get a little slow.

        // When should we use StringBuilder Class:
        //  When we want maximum speed, and we don't care how much memory our programs going to occupy.

        // What does it mean by String is immutable:
        //  It means Strings are not changeable once created in the memory of the computer, and the reason they are
        // immutable is that same memory cell can be shared across many variables and if we allow any of the
        // variable to change the value it can break the complete system
    }
}
