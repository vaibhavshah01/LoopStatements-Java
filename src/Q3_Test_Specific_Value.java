public class Q3_Test_Specific_Value{
//progam about finding specific value in the Array
    public static boolean contains(int[] arr, int num) {
        for (int n : arr) {
            if (num == n) {
            // number in Array print true
                return true;
            }
        }
            // number not in Array print false
            return false;
    }

    public static void main(String[] args) {
            int[] my_Array1= {25,32,47,56,98,64};
            // checking the number which is in the Array
            System.out.println(contains(my_Array1,32));
            // checking the number which is not in Array
            System.out.println(contains(my_Array1,79));

        }
}