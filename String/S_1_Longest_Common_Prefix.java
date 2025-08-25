public class S_1_Longest_Common_Prefix {
    


    private static String solveCommonPrefix(String [] str){

        String prefix = str[0];

        for( int i=1;i<str.length;i++){

            while(str[i].indexOf(prefix) !=0){

                prefix = prefix.substring(0,prefix.length()-1);


                if(prefix == "") return "";
            }
        }

        return prefix;
    }



    public static void main(String[] args) {
        
        String [] str = {"Flower","Flow","Flight"};


        String ans = solveCommonPrefix(str);
        System.out.println(ans);
    }
}
