import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    if(n == 0)
    {
        return;
    }
    int size = m+n-1;
    int i = m-1;
    int j = n-1;
    while(size>=0)
    {
        int element1,element2;
        element1 = (i>=0)? nums1[i]: Integer.MIN_VALUE;
        element2 = (j>=0)? nums2[j]: Integer.MIN_VALUE;
        if(element1<element2)
        {
            nums1[size] = element2;
            j--;
            size--;
        }
        else
        {
            nums1[size] = element1;
            i--;
            size--;
        }
    }
 }
}