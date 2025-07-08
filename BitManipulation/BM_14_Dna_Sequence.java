package BitManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BM_14_Dna_Sequence {
     public List<String> findRepeatedDnaSequences(String s) {
        
        int len = s.length();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        List<String> ans = new ArrayList<>();

        if(len <=10) return ans;
        
        for(int i=0;i<=len-10;i++){

            String dna = s.substring(i,i+10);

            if(!set1.add(dna)){
                set2.add(dna);
            }
        };
        ans.addAll(set2);
        return ans;
    }
}
