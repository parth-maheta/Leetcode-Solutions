class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] nums3 = new int[l1+l2];
       double median = 0.0f;

        for (int i=0;i<l1;i++)
        {
            nums3[i] = nums1[i];
        }
        int j = l1;
        for (int i=0;i<l2;i++)
        {
            nums3[j] = nums2[i];
            j++;
        }

        Arrays.sort(nums3);
        if (nums3.length % 2 == 0)
        {
            int index2 = (nums3.length/2);
            int index1 = index2 - 1;
            median = (double)(nums3[index2] + nums3[index1])/2;
        }
        else 
        {
            int index = nums3.length/2;
            median = nums3[index];
        }
        return median;
    }
}