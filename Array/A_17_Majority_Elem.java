
public class A_17_Majority_Elem {

    private static int solveMajorityElem(int [] arr){

        int cnt= 0;
        int elem = -1;
        int n= arr.length;

        // Phase 1: Find candidate
        for (int num : arr) {
            if (cnt == 0) {
                elem = num;
                cnt = 1;
            } else if (num == elem) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Phase 2: Verify candidate
        int checkCnt = 0;
        for (int num : arr) {
            if (num == elem)
                checkCnt++;
        }


        return checkCnt > n/2 ? elem : -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 1, 3, 2,3,3};

        // Moores voting Algo
        int ans = solveMajorityElem(arr);
        System.out.println(ans);

    }
}
