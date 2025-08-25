import java.util.ArrayList;
import java.util.List;

public class A_9_Union_Two_Sorted {

    private static List<Integer> unionSorted(int [] arr1, int [] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0,j=0;
        List<Integer> temp = new ArrayList<>();

        /*  Two pointer -->
         * 
         * put i and j =0;
         * now as array is sorted it will have smaller at first
         * so will check if the arr1 elem is smaller or arr2;
         * if arr1 is smaller then will check it must not be equal to the last inserted
         * if its case will insert and increment i and j repectively
         * but if its cant be taken it means it already included so we still move pointer
         */
        while(i<n1 && j<n2){

            if(arr1[i]<=arr2[j]){

                if(temp.size() == 0 || temp.get(temp.size()-1) != arr1[i]){
                    temp.add(arr1[i]);
                };
                i++;
            }
            else{
                if (temp.size() == 0 || temp.get(temp.size() - 1) != arr2[j]) {
                    temp.add(arr2[j]);
                };
                j++;
            }
        };

        // Add remaining elements of arr1
        while (i < n1) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != arr1[i]) {
                temp.add(arr1[i]);
            };
            i++;
        }

        // Add remaining elements of arr2
        while (j < n2) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != arr2[j]) {
                temp.add(arr2[j]);
            };
            j++;
        }
        return temp;
    }
    public static void main(String[] args) {

        int[] arr1 = { 1,1,2,3,4,5,5,6,7,7 };
        int[] arr2 = {1,2,3,3,4,7,8,8,9,9,10 };

        List<Integer> ans = unionSorted(arr1,arr2);
        System.out.println(ans);

    }
}
