class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] result = new int[n];
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            int count = (h1.containsKey(A[i]))? h1.get(A[i]):0;
            h1.put(A[i],count+1);
            int count2 = (h1.containsKey(B[i]))? h1.get(B[i]):0;
            h1.put(B[i],count2+1);
            int res = 0;
            for(Integer value : h1.values())
            {
                if(value>1)
                {
                    res = res + 1;
                }
            }
            result[i] = res;
        }
        return result;
    }
}