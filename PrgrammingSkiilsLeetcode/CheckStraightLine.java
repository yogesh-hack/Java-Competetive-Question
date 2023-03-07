// Problem : 1232

// Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
// Output: true


class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n == 1 || n == 2) return true;

        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[1][0];
        double y2 = coordinates[1][1];

        double slope ;
        double x = x2-x1;
        if(x == 0) slope = -111111;
        else slope = (y2-y1)/(x);
       
        
        for(int i = 2;i<n;i++){
            x1=coordinates[i-1][0];
            y1=coordinates[i-1][1];
            x2=coordinates[i][0];
            y2=coordinates[i][1];
             x = x2-x1;
             double m ;
            if( x== 0) m = -111111;
            else m = (y2-y1)/(x);
            
            if( m!=slope ) return false;

        }
      return true;
    }
}
