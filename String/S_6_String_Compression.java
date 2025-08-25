class Solution {
    public int compress(char[] chars) {
        

        int low =0;
        int indx =0;
        int high = chars.length;

        while(low<high){

            char curr = chars[low];
            int start= low;
            
            while(low<high && chars[low] == curr){
                low++;
            }

            chars[indx++] = curr;

            int val = low-start;
            
            if(val>1){

                String s = String.valueOf(val); // convert number to string
                for (int k = 0; k < s.length(); k++) {

                    chars[indx++] = s.charAt(k); // append each digit

                }
            }
        }

        return indx;
    }
}