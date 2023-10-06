package ra.bt2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}