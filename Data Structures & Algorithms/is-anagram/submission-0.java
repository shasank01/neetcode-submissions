class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            int position = ch - 'a';
            arr[position]++;
        }
        for(char ch2 : t.toCharArray()){
            int position2 = ch2 - 'a';
            arr[position2]--;
        }
        for(int num : arr){
            if(num!=0){
                return false;
            }
        }
        return true;
    }

}
