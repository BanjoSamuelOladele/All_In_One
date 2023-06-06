public class Test {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
    }
    public static String fakeBin(String numberString) {
            String result = "";
            for(int index =0; index < numberString.length(); index++){
                String number = "";
                number += numberString.charAt(index);
                if(Integer.parseInt(number) < 5) result +=0;
                result += 1;
            }
            return result;
        }
}
