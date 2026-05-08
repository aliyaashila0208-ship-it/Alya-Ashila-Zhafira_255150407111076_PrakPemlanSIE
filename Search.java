import java.util.Arrays;

public class Search {

    public static int linearSearch(int[] arr, int search) {
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            check++;
            if (arr[i] == search) {
                System.out.println("Jumlah pengecekan Linear Search: " + check);
                return i;
            }
        }
        System.out.println("Jumlah pengecekan Linear Search: " + check);
        return -1;
    }

    public static int binarySearch(int[] arr, int search) {
        int check = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            check++;
            int mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Jumlah pengecekan Binary Search: " + check);
                return mid;
            }
            if (arr[mid] < search) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Jumlah pengecekan Binary Search: " + check);
        return -1;
    }

    public static void main(String[] args) {
        int[] dataArray = {10, 25, 34, 42, 55, 68, 77, 88, 91, 100};

        System.out.println("Data Array: " + Arrays.toString(dataArray));
        System.out.println("--------------------------------------------------");

        int hasilLinearTidakAda = linearSearch(dataArray, 99);
        System.out.println("Hasil pencarian Linear (Cari 99): " + hasilLinearTidakAda + "\n");

        int hasilBinaryTidakAda = binarySearch(dataArray, 99);
        System.out.println("Hasil pencarian Binary (Cari 99): " + hasilBinaryTidakAda + "\n");
    }
}