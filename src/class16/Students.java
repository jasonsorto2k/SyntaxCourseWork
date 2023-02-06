package class16;

public class Students {

     /*
     Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

    String name;
    String id;
    static int noOfStudents;

    public static void main(String[] args) {

        Students nezir=new Students();
        nezir.name="Nezir";
        nezir.id="1";
        nezir.noOfStudents++;

        Students ardasher=new Students();
        ardasher.name="ardasher";
        ardasher.id="2";
        ardasher.noOfStudents++;
        System.out.println(Students.noOfStudents);


    }
}

