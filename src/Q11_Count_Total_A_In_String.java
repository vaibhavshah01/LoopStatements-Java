import java.util.Scanner;
// program about total 'a'in the string
public class Q11_Count_Total_A_In_String {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the string: ");
            String str = in.nextLine();

            System.out.print("Number of  a: " + count_a(str)+"\n");
        }
        public static int count_a(String str)
        {
            int count = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == 'a'|| str.charAt(i)=='A' )
                {
                    count++;
                }
            }
            return count;
        }
    }

