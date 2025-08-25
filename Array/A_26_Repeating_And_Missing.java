public class A_26_Repeating_And_Missing {
    
    static class Pair<U,V> {
    
        private  U missing;
        private  V repeating;

        public Pair(U missing,V repeating){
            this.missing = missing;
            this.repeating = repeating;
        }

        public U getMissing (){ return missing;}
        public V getRepeating(){return repeating;}
    }

    private static Pair<Integer, Integer> findMissingAndRepeating(int[] nums) {
        int n = nums.length;
        int xr = 0;

        // Step 1: XOR all nums and 1..n
        for (int i = 0; i < n; i++) {
            xr = xr ^ nums[i];
            xr = xr ^ (i + 1);
        }

        // Step 2: Get rightmost set bit
        int diffBit = xr & -xr;

        int oneClub = 0, zeroClub = 0;

        // Step 3: Divide nums[] into two buckets
        for (int i = 0; i < n; i++) {
            if ((nums[i] & diffBit) == 0)
                zeroClub ^= nums[i];
            else
                oneClub ^= nums[i];
        }

        // Step 4: Divide numbers 1..n into two buckets
        for (int i = 1; i <= n; i++) {
            if ((i & diffBit) == 0)
                zeroClub ^= i;
            else
                oneClub ^= i;
        }

        // Step 5: Identify missing vs repeating
        for (int num : nums) {
            if (num == oneClub)
                return new Pair<>(zeroClub, oneClub);
        }
        return new Pair<>(oneClub, zeroClub);
    }

    public static void main(String[] args) {
        
        int []num = {1,2,3,4,5,6,7,9,9};

        Pair<Integer,Integer> res = findMissingAndRepeating(num);
        System.out.println("Missing-> " + res.getMissing() + " Repeating-> " + res.getRepeating());
    }
}
