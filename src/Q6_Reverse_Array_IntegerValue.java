import java.util.Arrays;
public class Q6_Reverse_Array_IntegerValue {
            // program about reverse an integer value which is Array
    public static void main(String[] args) {
            //filling the element
            int[] my_Array1 = {10, 20, 30, 40, 50};

            //print original Array order
            System.out.println("Original array : " + Arrays.toString(my_Array1));

            for (int i = 0; i < my_Array1.length / 2; i++){
            // create a temp holder for Array
            int temp=my_Array1[i];

            my_Array1[i] = my_Array1[my_Array1.length-i-1];

            my_Array1[my_Array1.length-i-1] = temp;
        }
            // print reverse Array order
        System.out.println("Reverse array :" +Arrays.toString(my_Array1));
    }
}