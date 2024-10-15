class Solution {
    public double average(int[] salary) {
        double n = salary.length;
        double sum = 0;
        Arrays.sort(salary);
    
        for(int i = 1; i< n -1; i++){
            sum += salary[i];
        }
        double avg = sum/ (n-2);
        return avg;
    }
}