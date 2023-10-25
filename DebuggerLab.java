import java.util.Scanner;

public class DebuggerLab {

    public static void main(String[] args) {
        int arrSize = 5;
        int[] arr = new int[arrSize];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+arrSize+" numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            System.out.println("You added the value "+arr[i]+" at index "+ i+
                    " to your array");
        }
        mysterySort(arr);

    }

    public static void mysterySort(int[] arr) {
        for (int startIndex = 1; startIndex < arr.length; startIndex++) {
            int key = arr[startIndex];
            int keyIndex = startIndex - 1;
            while (keyIndex >= 0 && key < arr[keyIndex]) {
                arr[keyIndex + 1] = arr[keyIndex];
                --keyIndex;
            }
            arr[keyIndex + 1] = key;
        }
    }


}
