package chapter5;

public class Arithemetic {
    public static void main(String[] args) {
        Arithemetic arith = new Arithemetic();
        System.out.println(arith.add(2, 4));
        System.out.println(arith.add(3, 4, 5));
        System.out.println(arith.add(4, 5.0));
    }
//    public  int add(int a, int b){
//        return a + b;
//    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(int a, double b){
        return a + b;
    }
}
