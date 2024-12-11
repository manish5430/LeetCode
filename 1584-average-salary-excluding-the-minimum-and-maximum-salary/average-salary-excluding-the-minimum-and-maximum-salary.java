class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int[] arr = Arrays.copyOfRange(salary, 1, salary.length-1);

        double sum = 0;
        for(int num : arr){
            sum += num;
        }

        return sum/arr.length;
    }
}