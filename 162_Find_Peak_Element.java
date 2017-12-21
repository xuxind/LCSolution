//162. Find Peak Element
//A peak element is an element that is greater than its neighbors.
//Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
//The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
//You may imagine that num[-1] = num[n] = -∞.
//For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
//Note:
//Your solution should be in logarithmic complexity.

class Solution1 {
    public int findPeakElement(int[] nums) {
        int i;
        if(nums.length==1){return 0;}
        if(nums[nums.length-1]>nums[nums.length-2]){return nums.length-1;}
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
               return i;
            }
            else continue;
        }
        
        return -1;
    }
}

class Solution2 {
    public int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length-1);
    }
    public int search(int[] nums, int l, int r)
{
    if(r==l)return l;
    int mid=(l+r)/2;
    if(nums[mid]>nums[mid+1])
        return search(nums,l,mid);
    return search(nums,mid+1,r);
}
}

public class Solution3 {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
