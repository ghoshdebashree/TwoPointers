import java.util.Arrays;

public class SumOfThree {
    public static boolean checkSum(int[] arr, int sum){
        Arrays.sort(arr);
        int low = 1;
        int high = arr.length -1;
        for(int i = 0; i< arr.length - 2; i++){
            while(low < high){
                int triplets = arr[i] + arr[low] + arr[high];
                if(triplets == sum){
                    return true;
                }
                else if(triplets < sum){
                    low++;
                }
                else
                    high --;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] numsList = {{3, 7, 1, 2, 8, 4, 5},
                {-1, 2, 1, -4, 5, -3},
                {2, 3, 4, 1, 7, 9},
                {1, -1, 0},
                {2, 4, 2, 7, 6, 3, 1}};

        int[] testList = {10, 7, 20, -1, 8};
        for (int i = 0; i < testList.length; i++) {
            System.out.print(i + 1);
            System.out.println(".\tInput array: " + Arrays.toString(numsList[i]));

            if (checkSum(numsList[i], testList[i])) {
                System.out.println("\tSum for " + testList[i] + " exists ");
            } else {
                System.out.println("\tSum for " + testList[i] + " does not exist ");
            }
        }
    }
}
