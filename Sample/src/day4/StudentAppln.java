package day4;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentAppln {

public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Student> stdList=new ArrayList<>();
stdList.add(new Student(108,"pooja",40,60,50));
stdList.add(new Student(109,"chaya",40,20,60));
stdList.add(new Student(110,"kavya",52,45,35));
stdList.add(new Student(111,"disha",80,87,59));
stdList.add(new Student(112,"keerthi",60,40,30));
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
String result;
int total;
float avg;
System.out.println("Enter the register number of student to know the result");
int refNo=sc.nextInt();
int i=-1;
int n=stdList.size();
//System.out.println(n);

try {
for(Student stud : stdList) {
i++;
//System.out.println(i);
if(stud.getRegNo()==refNo) {
total=stud.getSub1()+stud.getSub2()+stud.getSub3();
avg=(float)(total/3);
   if(stud.getSub1()>=40 && stud.getSub2()>=40 && stud.getSub3()>=40)
   {
    result ="Cleared the examination";
   }
   else
   {
    result = " not cleared the examination";
   }
System.out.println("total marks of the student "+total);
System.out.println("average marks of the student "+avg);
System.out.println("student has"+result);
System.exit(0);
}
else if(i<n)
continue;

else
throw new StudentNotFoundException();
}
}
catch(StudentNotFoundException e) {
e.printStackTrace();

}
}
}


