public class S_5_Excel_Sheet_Colm {
    public static int titleToNumber(String columnTitle) {

        int total = 0;
        for (int i = 0; i < columnTitle.length(); i++) {

            int num = (columnTitle.charAt(i) - 'A') + 1;
            total = total * 26 + num;
        }

        return total;
    }

    public static void main(String[] args) {

        String s = "AB";

        System.out.println(titleToNumber(s));
    }
}
