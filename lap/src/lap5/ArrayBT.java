package lap5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBT {

    // --- bai 1 --- //
    public void SumEvenNumberArrays(int[] array) {
        int cou = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                cou = cou + array[i];
            }
        }
        System.out.println("sum = " + cou);
    }

    // --- bai 2 --- //
    public void maxInArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("max = " + array[array.length - 1]);
    }

    // --- bai 3 --- //
    public void CountOccurrences(int[] aarryy, int elementTofind) {
        int coust = 0;
        for (int i = 0; i < aarryy.length - 1; i++) {
            if (aarryy[i] == elementTofind) {
                coust++;
            }
        }
        System.out.printf("phan tu %d xuat hien %d lan trong mang", elementTofind, coust);
    }

    // --- bai 4 --- //
    public void SumOfSquaresElements(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        int couts = 0;
        System.out.println("ad");
        for (int i = 0; couts == 0; i++) {
            System.out.printf("hay them gia tri cho mang, index %d = ", i);
            list.add(scanner.nextInt());

            System.out.print("ban co muon tiep tuc khong y/n: ");
            String a = scanner.next();
            if (a.equals("n")) {
                couts++;
            }
        }
        int sum = 0;
        for (int k = 0; k < list.size(); k++) {
            sum = sum + list.get(k) * list.get(k);
        }
        System.out.println("tong cac so binh phuong trong mang la: " + sum);

    }
}
