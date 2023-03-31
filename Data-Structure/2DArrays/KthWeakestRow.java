// Input: mat = 
// [[1,1,0,0,0],
//  [1,1,1,1,0],
//  [1,0,0,0,0],
//  [1,1,0,0,0],
//  [1,1,1,1,1]], 
// k = 3
// Output: [2,0,3]
// Explanation: 
// The number of soldiers in each row is: 
// - Row 0: 2 
// - Row 1: 4 
// - Row 2: 1 
// - Row 3: 2 
// - Row 4: 5 
// The rows ordered from weakest to strongest are [2,0,3,1,4].

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int row = mat.length;
        int col = mat[0].length;
        int[] soldiersCount = new int[row];
        int[] result = new int[k];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                soldiersCount[i] += mat[i][j];
            }
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            map.put(i, soldiersCount[i]);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        
        return result;
    }
}
