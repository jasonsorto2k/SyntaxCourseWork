package class16;

public class Task3 {

    // Create a method that will print whether the given string is palindrome or not

    //return type = void
    //method name = isPalindrome
    //parameters = String inputStr


    void isPalindrome (String inputStr){
        String str = inputStr;
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();

        if(str.equals(reversedStr)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }

    public static void main(String[] args) {

        Task3 ts3 = new Task3();
        ts3.isPalindrome("madam");
    }


}
