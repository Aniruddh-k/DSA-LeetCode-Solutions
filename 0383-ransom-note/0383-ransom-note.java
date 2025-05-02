class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[27];
        for(int i =0;i<magazine.length();i++)
        {
            int value = (magazine.charAt(i)-'a')+1;
            arr[value]++;
        }
        for(int i = 0;i<ransomNote.length();i++)
        {
            int value2 = (ransomNote.charAt(i)-'a')+1;
            if(arr[value2]>0)
            {
                arr[value2]--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}