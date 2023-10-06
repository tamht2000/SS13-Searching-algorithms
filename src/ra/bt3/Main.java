package ra.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = getArr();
        System.out.println("Nhập số bạn muốn tìm kiếm trong danh sách:");
        Scanner sc = new Scanner(System.in);
        int searchNumber = Integer.parseInt(sc.nextLine());
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchNumber) {
                    result.append(i + "." + j + ",");
                }
            }

        }
        if(result.length() == 0){
            System.out.println("Không tìm thấy phần tử cần tìm kiếm");
            System.out.println(false);
        } else {
            System.out.println("Các vị trí xuất hiện số " + searchNumber + " là:");
            System.out.println(result);
            System.out.println(true);
        }
    }

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }
}