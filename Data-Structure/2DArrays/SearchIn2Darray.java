// Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    //     int left = 0;
    //     int right = matrix[0].length - 1;

    //     // binary search
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[i].length;j++){
    //              while(left <= right){
    //                  int mid = (left+right)/2;
    //                  if(matrix[i][mid] == target){
    //                      return true;
    //                  }
    //                  else if(matrix[i][mid] < target){
    //                      left = mid - 1;
    //                  }            
    //                  else{
    //                      right = mid + 1;
    //                  }
    //             }
    //         }
    //     }
    //    return false;
    // }


      int left = 0; 
      int row = matrix.length;
      int right = matrix[0].length-1;

      while(right >= 0 && left < row ){
        if(matrix[left][right] == target){
          return true;
        }
        if(matrix[left][right] < target){
          left++;
        }
        else{
          right--;
        }
      }
      return false;
  }
}
