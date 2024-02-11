import java.util.*;
public class StudentGradeSystem{

    public static float Average(float total,int noSub){
        float avg=total/noSub;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of Subjects : ");
        int noSub=sc.nextInt();
        int marks[]=new int[20];
        String name[]=new String[20];
        int sum=0;

        for(int i=1;i<=noSub;i++){

            System.out.println("Enter the Name of Subject "+i);
            name[i]=sc.next();

            System.out.println("Enter the Marks of Subject "+i);
            marks[i]=sc.nextInt();   
            sum=sum+marks[i];       
        }

        for(int i=1;i<=noSub;i++){
            System.out.println("Subject : "+name[i]+"\t Marks : "+marks[i]);

        }

        System.out.println("Total Marks obtained in All Subject : \t"+sum);
        float Avg=Average(sum,noSub);
        System.out.println("Average is : \t"+Avg);

    if(Avg>=90){
        System.out.println("Grade is \tA+");
    }else if(Avg<=89 && Avg>=80){
        System.out.println("Garde is \tA");
    }else if(Avg<=79 && Avg>=70){
        System.out.println("Grade is \tB+");
    }else if(Avg<=69 && Avg>=60){
        System.out.println("Grade is \tB");
    }else if(Avg<=59 && Avg>=50){
        System.out.println("Grade is \tC+");
    }else if(Avg<=49 && Avg>=40){
        System.out.println("Grade is \tC");
    }else if(Avg<=39 && Avg>=30){
        System.out.println("Grade is \tC");
    }else{
        System.out.println("Fail");
    }
    }
}