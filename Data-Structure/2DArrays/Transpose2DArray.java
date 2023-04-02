

class Transpose {
    public static void main(String[] args) {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int row = matrix.length;
        int col = matrix[0].length;
        
          for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
