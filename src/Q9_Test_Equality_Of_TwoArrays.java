//program about test equality of two arrays
public class Q9_Test_Equality_Of_TwoArrays {
    static void  equality_test_two_arrays(int[] my_array1, int[] my_array2)
    {
        boolean  equalOrNot = true;

        if(my_array1.length == my_array2.length)
        {
            for (int i  = 0; i < my_array1.length; i++)
            {
                if(my_array1[i] != my_array2[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot  = false;
        }

        if  (equalOrNot)
        {
            System.out.println("Two arrays are equal.");
        }
        else
        {
            System.out.println("Two  arrays are not equal.");
        }
    }

    public static void  main(String[] args)
    {
        int[] array1 =  {10, 20, 30, 40, 100};
        int[] array2 =  {10, 20, 30, 50, 100};
        int[] array3 =  {10, 20, 30, 40, 100};

        equality_test_two_arrays(array1,  array2);
        equality_test_two_arrays(array1, array3);
    }
}


