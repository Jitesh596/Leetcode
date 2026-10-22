class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        int maxi = Integer.MIN_VALUE;
        int maxr = 0;
        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++){
                if(mat[i][j] == 1)
                count ++;
            }
            if(count > maxi) {
                maxi = count;
                maxr = i;
            }
        }
        return new int []{maxr, maxi};
    }
}