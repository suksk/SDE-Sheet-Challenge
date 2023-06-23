//User function Template for Java

class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) {
        // code here
        // Take the transpose of the matrix
        // matrix[0].length --> number of columns on row 0
        for (int i = 0; i < n; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse every col using two pointer method
        for (int col = 0; col < n; col++) {
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = 0;
                temp = matrix[i][col];
                matrix[i][col] = matrix[j][col];
                matrix[j][col] = temp;
            }
        }
    }
}