import java.util.Scanner;
public class Q18_Do_While_Loop_Multiplication_Table {


        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int num,range;
            System.out.println("Enter the number: ");
            num=sc.nextInt();
            System.out.println("Enter the range: ");
            range=sc.nextInt();
            int i=1;
            do{
                System.out.println(num+"x"+i+"="+num*i);
                i++;
            }
            while(i<=range);
        }
    }

