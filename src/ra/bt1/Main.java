package ra.bt1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}