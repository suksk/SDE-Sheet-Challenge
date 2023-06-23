class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            rotateBy90(mat);
        }
        return false;

    }

    public void rotateBy90(int[][] mat) {
        // Take the transpose of the matrix
        // matrix[0].length --> number of columns on row 0
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Reverse every row using tow pointer method
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length / 2; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - j - 1];
                mat[i][mat.length - j - 1] = temp;
            }
        }
    }
}
