import java.util.Arrays;
import java.util.HashSet;
//program about finding common element from two different arrays
public class Q8_Common_Element_TwoArrays {

   public static void main(String[] args)
        {
            //filling the element
            String[] array1 = {"Goa", "Abu", "Delhi", "Mehsana", "Surat", "Ahmedabad"};

            String[] array2 = {"Ahmedabad", "Godhra", "Bombay", "", "Surat", "Vadodara"};

            //print the arrays
            System.out.println("Array1 : "+ Arrays.toString(array1));

            System.out.println("Array2 : "+Arrays.toString(array2));

            //use HashSet
            HashSet<String> set = new HashSet<String>();

            for (int i = 0; i < array1.length; i++)
            {
                for (int j = 0; j < array2.length; j++)
                {
                    if(array1[i].equals(array2[j]))
                    {
                        set.add(array1[i]);
                    }
                }
            }
            // print common element
            System.out.println("Common element : "+(set));
        }
    }



