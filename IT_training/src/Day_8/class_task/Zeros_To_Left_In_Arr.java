package Day_8.class_task;

public class Zeros_To_Left_In_Arr {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5};
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Array after moving zeros to the left:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
