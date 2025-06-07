public class j_06_array {

    public static void main(String[] args) {
        // declaration--memory allocation
        int[] marks = new int[5];

        // initialization
        marks[0] = 40;
        marks[1] = 41;
        marks[2] = 42;
        marks[3] = 43;
        marks[4] = 44;

        // declaration, memory allocation, and initialization at same
        int[] marks1 = { 1, 2, 3, 4, 5 };

        // METHODS

        int len = marks1.length; // givses length

        // for each loop
        for (int elem : marks1) {
            // System.out.println(elem);
        }
        ;

        // 2-d array

        int[][] flats = new int[2][2]; // 2x2 matrix

        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[1][0] = 200;
        flats[1][1] = 201;
        
    }
}
