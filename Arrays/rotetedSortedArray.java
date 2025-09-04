public class rotetedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 2, 3, 4, 5, 6 };
        int target = 4;
        System.out.println("element found in "+(Search(arr, target,arr.length)+1)+"  position");

    }

    static int Search(int[] arr, int tar, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[mid] >= arr[start]) { // left side
                if (arr[start] <= tar && tar <= arr[end])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (arr[mid] <= tar && arr[end] >= tar)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

        }

        return -2;
    }
}
