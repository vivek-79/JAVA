public class j_05_string {
    
    // string is also a class and a data type ;
    // name = new Strng("vivek")

    public static void main(String[] args) {
        
        // int a  =6;
        // float b = 5.5f;

        // System.out.printf("valuue of a is %d and value of b is %f",a,b);

        // %d - int
        // %f - float
        // %s - string
        // %c - char

        // METHODS

        String str = "Vivek";

        int len = str.length(); // length
        String lstr = str.toLowerCase(); // lower case
        String ustr = str.toUpperCase(); // upper case
        String trimStr = str.trim(); // trims leding or preceeding white space
        String subStr = str.substring(2,3); // return substr from and to the given index
        String replaceStr = str.replace("v", "k"); // replace given char to given char or string
        boolean strtWith = str.startsWith("V"); // checks start
        boolean endWith = str.endsWith("ek"); // checks ending
        char charAt = str.charAt(2);// gives char at index
        int indxOf = str.indexOf("v"); // gives indx of first ocurance of string returns -1 if not
        int lstIndxOf = str.lastIndexOf("v"); // gives last occ of string returns -1 if not

        boolean isEqual = str.equals("Vikki");// checks if two str is equal
        boolean isEql = str.equalsIgnoreCase("vivek"); // checks two string equal ignores case senstivity
        
        System.out.println(lstIndxOf);
    }
}
