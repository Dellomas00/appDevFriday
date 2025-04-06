public class Calculator {
    
    //Addition
    public static int add(int a, int b) {
        return a + b;
    }
    //Suubtraction
    public static int sub(int a, int b) {
        return a - b;
    }
    //Multiplication
    public static int mul(int a, int b) {
        return a * b;
    }
    //Division
    public static int div(int a, int b) {
        return a / b;
    }
    //Modulus
    public static int mod(int a, int b) {
        return a % b;
    }
    //Square
    public static int square(int a, int b) {
        return a * a;
    }
    //Cube
    public static int cube(int a, int b) {
        return a * a * a;
    }
    //Max
    public static int max(int a, int b) {
        if(a > b){
        return a;
        } else {
            return b;
        }
    }
    //Min
    public static int min(int a, int b) {
        if(a < b){
            return a;
            } else {
                return b;
            }
    }
    //Equal
    public static boolean equal(int a, int b) {
        if(a == b){
            return true;
            } else {
                return false;
            }
    }
}

