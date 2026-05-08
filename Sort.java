import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static int[] bubble(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] < list[i]) {
                    int t = list[i];
                    list[i] = list[k];
                    list[k] = t;
                    tukarAtauGeser++;
                }
            }
        }
        System.out.println("Jumlah tukar/geser Bubble Sort: " + tukarAtauGeser);
        return list;
    }

    public static int[] insertion(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int k = i - 1;
            while (k >= 0 && list[k] > key) {
                list[k + 1] = list[k];
                k = k - 1;
                tukarAtauGeser++;
            }
            list[k + 1] = key;
        }
        System.out.println("Jumlah tukar/geser Insertion Sort: " + tukarAtauGeser);
        return list;
    }

    public static int[] selection(int[] list) {
        int tukarAtauGeser = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < list.length; k++) {
                if (list[k] < list[minIndex])
                    minIndex = k;
            }
            int t = list[minIndex];
            list[minIndex] = list[i];
            list[i] = t;
            tukarAtauGeser++;
        }
        System.out.println("Jumlah tukar/geser Selection Sort: " + tukarAtauGeser);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[30];
        Random rand = new Random();
        int jumlahIsi = 0;

        while (jumlahIsi < 30) {
            int angkaBaru = rand.nextInt(100) + 1;
            boolean angkaKembar = false;

            for (int i = 0; i < jumlahIsi; i++) {
                if (arr[i] == angkaBaru) {
                    angkaKembar = true;
                    break;
                }
            }

            if (!angkaKembar) {
                arr[jumlahIsi] = angkaBaru;
                jumlahIsi++;
            }
        }

        System.out.println("Data Array Awal:");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n--------------------------------------------------\n");

        System.out.println("Hasil Bubble Sort:");
        System.out.println(Arrays.toString(bubble(arr.clone())));
        System.out.println();

        System.out.println("Hasil Insertion Sort:");
        System.out.println(Arrays.toString(insertion(arr.clone())));
        System.out.println();

        System.out.println("Hasil Selection Sort:");
        System.out.println(Arrays.toString(selection(arr.clone())));
    }
}