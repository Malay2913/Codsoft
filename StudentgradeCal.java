import java.util.Scanner;
public class StudentgradeCal { 
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the marks of 5 subjects:");
        for(int i=0;i<5;i++)
        {
            System.out.print("Subject "+(i+1)+": ");
            marks[i]=obj.nextInt(); 
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 100 || marks[i] < 0) {
                System.out.println("Invalid marks for Subject ");
                return;
            }
        }

        int total=0;
        for(int i=0;i<5;i++)
        {
            total+=marks[i];
        }

        float avg =total/5.0f;

        System.out.println("Total marks: "+total);
        System.out.println("Average marks: "+avg);
        System.out.print("Grade: ");
        
        if(avg>=90)
        {
            System.out.println("A+");
        }
        else if(avg>=80 && avg<90)
        {
            System.out.println("A");
        }
        else if(avg>=70 && avg<80)
        {
            System.out.println("B+");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("C+");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
}
}