//215. Kth Largest Element in an Array

//Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
//For example,
//Given [3,2,1,5,6,4] and k = 2, return 5.

class Solution1 {
    public int findKthLargest(int[] nums, int k) {
       
            int m=0;
            for(int i=0;i<nums.length-1;i++)
            {
                m=nums[i];
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[j]>nums[i])
                    {
                        int t;
                        t=nums[i];
                        nums[i]=nums[j];
                        nums[j]=t;
                    }
                }
                
            }
            
        return nums[k-1];      
    }
}
