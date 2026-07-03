package Day_10.class_task;

public class Print_string_duplicates_arr{
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape"};
        System.out.println("Duplicate strings in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}


