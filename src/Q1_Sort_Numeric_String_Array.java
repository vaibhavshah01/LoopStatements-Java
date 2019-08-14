import java.util.Arrays;
// program about sorting numeric and string
public class Q1_Sort_Numeric_String_Array {
    public static void main(String[] args) {
        int[]num={32,15,57,23,67};
        String[]city={"Abu","Godhra","Valsad","Surat","Bomaby"};

            System.out.println("Original order of number :"+ Arrays.toString(num));
            //for sorting the number
            Arrays.sort(num);
            // after sorting print in ascending order
            System.out.println("Sorted in order:"+ Arrays.toString(num));

            System.out.println("Original order of city :"+ Arrays.toString(city));
            // for sorting the city
            Arrays.sort(city);
            //after sorting city in alphabetical order
            System.out.println("Sorted in order:" + Arrays.toString(city));
        }
    }
