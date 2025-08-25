import java.util.ArrayList;
import java.util.List;





public class A_10_Intersection_Two_Sorted {

    private static List<Integer> intersection(int [] arr1, int [] arr2){

        List<Integer>temp = new ArrayList<>();

        int n1 = arr1.length, n2=arr2.length;
        int i=0,j=0;

        while( i<n1 && j<n2){

            /* 
             * Here we just checked if two elem is same will add it and move both pointer
             * else if 1st elem is small will move i as to be equal it have to be more
             * same for second elem
             * when one of them is over then left one cant be matched with anyone
             */
            if( arr1[i] == arr2[j]){
                temp.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {

        int[] arr1 = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 7 };
        int[] arr2 = { 1, 1,2, 3, 3, 4, 7, 8, 8, 9, 9, 10 };

        List<Integer> ans = intersection(arr1, arr2);
        System.out.println(ans);

    }
}
