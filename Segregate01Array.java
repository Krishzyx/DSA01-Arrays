class segregate {
    public static void segregate_01(int arr[], int n) {
        int count_0 = 0, count_1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count_0++;
            } else {
                count_1++;
            }
        }

        for (int i = 0; i < count_0; i++) {
            System.out.print("0 ");
        }

        for (int i = count_0; i < n; i++) {
            System.out.print("1 ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        int n = arr.length;
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nSegregated array: ");
        segregate_01(arr, n);
    }
}

