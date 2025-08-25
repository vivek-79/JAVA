import java.util.ArrayList;
import java.util.List;

class Solution {

    private static int merge(int[] arr, int low, int mid, int high) {

        int cnt = 0;
        List<Integer> temp = new ArrayList<>();

        int i = low, j = mid + 1;

        while (i <= mid && j <= high) {

            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                cnt += (mid - i + 1);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= high) {
            temp.add(arr[j]);
            j++;
        }

        for (int k = low; k <= high; k++) {
            arr[k] = temp.get(k - low);
        }

        return cnt;
    }

    private static int mergeSort(int[] arr, int low, int high) {

        if (low >= high)
            return 0;

        int mid = (low + high) / 2;

        int cnt = 0;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);

        cnt += merge(arr, low, mid, high);

        return cnt;
    }

    static int inversionCount(int arr[]) {

        return mergeSort(arr, 0, arr.length - 1);

    }
}