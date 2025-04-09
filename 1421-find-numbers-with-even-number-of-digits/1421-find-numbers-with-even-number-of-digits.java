class Solution {
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i:nums){
            if(even(i)%2==0){
                count++;
            }
        }
        return count; 
    }
    static int even(int i){
        return (int)(Math.log10(i)+1);
    }
    public static void main(String[] args){
        int arr[] = {12,345,2,6,7896};
        int result = findNumbers(arr);
        System.out.println(result);
    }
}