import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] arr = {1,3,5,7,9,8,6,4,2};

    public static void main(String[] args) {
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhập số cần tìm: ");
            int search = sc.nextInt();
            binarySearch(search);
        }

    }

    private static void binarySearch(int search) {
        int low = 0;
        int hight = arr.length - 1;
        int mid ;
        while (low <= hight) {
            mid = (hight+low)/2;
            if(search == arr[mid]) {
                System.out.println("Phần tử được tìm kiếm có tồn tại trong mảng");
                return;
            } else if   (search < arr[mid]) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("phần tử tìm kiếm không có trong mảng");
    }
}
