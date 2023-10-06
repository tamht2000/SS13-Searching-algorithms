import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int[] arr = {1,2,2,4,5,5,7,9,6,2,1,6,7,8,3,2,2,3,4,5};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào số cần tìm kiếm");
        int search =  sc.nextInt();
        LinearSearch(search);
    }

    private static void LinearSearch(int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Phần tử cần tìm nằm ở vị trí " + i);
            }
        }
        System.out.println("Phần tử cần tìm không tồn tại");
    }
}