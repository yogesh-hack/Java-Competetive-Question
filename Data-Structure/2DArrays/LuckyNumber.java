// Lucky Number -> max in column and min in row

// Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
// Output: [15]
// Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        // 1. find min value in each rows and store
        // 2. find max values in each column and store
        // 3. whose value i find both in row and column, print


        // implements

        List<Integer> ans = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int[] rowmin = new int[row];

        for(int i=0;i<row;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<col;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            rowmin[i] = min;
        }

        int[] colmax = new int[col];

        for (int j = 0; j < col; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colmax[j] = max;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rowmin[i] == matrix[i][j] && matrix[i][j] == colmax[j]){
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;

    }
}
