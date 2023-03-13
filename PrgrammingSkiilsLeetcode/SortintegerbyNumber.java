


class Solution {
    public static int countBits(int n) {
    int count = 0;
    while (n != 0) {
        count += n & 1;
        n >>= 1;
    }
    return count;
}

public static int[] sortByBits(int[] arr) {
    int[] bitCounts = new int[10001];
    for (int n : arr) {
        bitCounts[n] = countBits(n);
    }
    int[] result = Arrays.copyOf(arr, arr.length);
    for (int i = 0; i < result.length - 1; i++) {
        for (int j = i + 1; j < result.length; j++) {
            if (bitCounts[result[i]] > bitCounts[result[j]] || (bitCounts[result[i]] == bitCounts[result[j]] && result[i] > result[j])) {
                int temp = result[i];
                result[i] = result[j];
                result[j] = temp;
            }
        }
    }
    return result;
}

}

// TC: O(n + n * logn + n) => O(n * logn)
// SC: O(n)
