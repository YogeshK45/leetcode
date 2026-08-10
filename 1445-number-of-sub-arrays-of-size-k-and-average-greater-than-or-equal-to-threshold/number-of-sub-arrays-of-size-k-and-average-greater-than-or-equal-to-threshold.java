class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum = sum+arr[i];
        }

        int count = 0;
        if(sum>= k * threshold){
             count++;
        }
    
        
    
    for(int right = k; right<arr.length;right++){
        sum+= arr[right];
        sum-= arr[right-k];
        if(sum>= k* threshold){
        count++;
        }
    }
    return count;
    }
}