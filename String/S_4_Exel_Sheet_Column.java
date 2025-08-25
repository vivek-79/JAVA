public class S_4_Exel_Sheet_Column {
    

    public static String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--; // To get 0-based Index
            
            int rem = columnNumber % 26;

            sb.append((char) ('A' + rem));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        
        int num =701;

        System.out.println(convertToTitle(num));
    }
}
