import java.util.*;

class Student{
    String studentName;
    String studentAddress;
    String studentGender;
    int studentAge = 0;
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = sc.next();
        System.out.print("Enter Student Age: ");
        studentAge = sc.nextInt();
        System.out.print("Enter Student Address: ");
        studentAddress = sc.next();
        System.out.print("Enter Student Gender: ");
        studentGender = sc.next();
    }
}

class StuDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int num = sc.nextInt();
        Student[] students = new Student[num];
        for (int i = 0; i < num ; i++){
            students[i] = new Student();
        }
    }
}


