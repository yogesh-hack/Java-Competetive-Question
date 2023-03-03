class Solution {
    public double average(int[] salary) {
        double avg = 0;

        // sort the array to find min and max
        
        Arrays.sort(salary);

        // at 0 index ->  min
        // at last index -> max

        for(int i = 1;i < salary.length - 1; i++){
            avg += salary[i];
        }

        return avg/(salary.length - 2);
    }
}
