
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int j = -1;
        for(int i=0,sum = 0;i<gas.length;i++){
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0){
                j = i;
                sum = 0;
            }
        }
        return total >= 0 ? j+1 : -1;
    } 
}

// simplyfi
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int n = gas.length;
      int total_gas = 0;
      int total_gas = 0;
      int curr_gas = 0;
      int start_point = 0;
      
      for(int i=0;i<n;i++){
        total_gas += gas[i];
        total_cost += cost[i];
        
        curr_gas += gas[i] - cost[i];
        
        if(curr_gas < 0){
          start_point = i+1;
          curr_gas = 0;
        }
      }
      return (total_gas < total_cost) ? -1 : start_point;
    }
}
 
