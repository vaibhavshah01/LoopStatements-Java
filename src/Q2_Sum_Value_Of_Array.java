public class Q2_Sum_Value_Of_Array {
    public static void main(String[] args) {
        //create an array with number 1 to 5
        int[] myNum={1,2,3,4,5};
            //fill it with numbers using a for loop
                for (int i=0;i<myNum.length;i++)
                myNum[i]=i+1;
             //doing sum
                int sum=0;
                for (int n:myNum)
                    sum += n;
             // print the result
             System.out.println(sum);

        }
    }

