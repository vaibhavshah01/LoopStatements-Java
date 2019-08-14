import java.util.Arrays;
// program about find duplicate element in Array
public class Q7_Duplicate_Value_Find_In_Array {
    public static void main(String[] args) {
        //filling the element
        int[]my_array= {2,5,7,9,1,2,6,7,8,9};

        for (int i=0;i<my_array.length-1;i++)
        {
            for (int j=i+1;j<my_array.length;j++)
            {
                if ((my_array[i]== my_array[j])&& (i != j))
                {
                    //printing the duplicate element
                    System.out.println("Duplicate Element: "+ my_array[j]);

                }
            }
        }
    }
}
