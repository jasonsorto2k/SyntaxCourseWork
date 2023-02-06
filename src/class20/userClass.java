package class20;

public class userClass {

    // Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.
    // You do not have permission to send messages in this channel.

    String name;
    long mobileNumber;

    userClass(String name, long mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

}

class userInfo extends userClass {

    String userAddress;

    userInfo(String name, long mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;

    }

    public void userDetails() {
        System.out.println("User's name is " + name + ", users mobile number is " + mobileNumber + " and the user's address is " + userAddress);

    }

    public static void main(String[] args) {

        userInfo user = new userInfo("Jason", 1234567890, "123 Learn Something, St.");
        user.userDetails();
    }
}

