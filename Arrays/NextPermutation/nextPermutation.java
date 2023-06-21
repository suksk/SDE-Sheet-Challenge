class Solution {
    static List<Integer> nextPermutation(int N, int arr[]) {
        // code here
        List<Integer> ans = new ArrayList<>();
        // Step 1: Find the break point
        int ind = -1; // break point

        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                // index i is the break point
                ind = i;
                break;
            }
        }
        // Step 2: Find the next greater element
        // and swap it with arr[ind]
        for (int i = N - 1; i > ind && ind != -1; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        // Step 3: Reverse the right half

        int l = ind + 1, r = N - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < N; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}