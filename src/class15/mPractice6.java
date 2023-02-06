package class15;

public class mPractice6 {

    // Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail (String userName, String lastName, String email){
        String address = userName+lastName+email;
        return address;

    }

    public static void main(String[] args) {

        mPractice6 mp6 = new mPractice6();
        System.out.println(mp6.createEmail("Jason","Sorto","@outlook.com"));
    }
}
