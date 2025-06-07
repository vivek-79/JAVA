public class j_07_methods {

    // method overloading :- we can create same named methods having different parameters
    // cant do method overloading by changing return type 

    static int addNum(int x ,int y){
        int z;

        z = x+y;
        return z;
    };
    static int addNum(int x ,int y, int z){
        int s;

        s = x+y+z;
        return s;
    };

    
    static int sum(int ...args){

        int res =0;
        for(int a:args){
            res+=a;
        }

        return res;
    }
    public static void main(String[] args) {
        int a  =3;
        int b = 5;

        int res = addNum(a, b);
        System.out.println(res);

        // varargs using spread operator

        int summ = sum(2,3,4,5);
        System.out.println(summ);
    }


}
