class Solution {
    public int findDuplicate(int[] num) {
     int a[] = new int[num.length];
        for(int i =0;i<num.length;i++){
            a[num[i]]++;
            if(a[num[i]] == 2){
                return num[i];
            }
        }
        return 0;
    }
}
