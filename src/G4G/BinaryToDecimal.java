package G4G;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String user_Input = "0110";
        int parseUserInput = Integer.parseInt(user_Input);
        int sum = 0;
        for (int index = 0; index < user_Input.length(); index++) {
            int remainder;
            if (index == 0){
                remainder = parseUserInput%10;
                sum += remainder * Math.pow(2,index);
            }
            else {
                parseUserInput = parseUserInput / 10;
                remainder = parseUserInput%10;
                sum+= remainder * Math.pow(2,index);
            }
        }
        System.out.println(sum);
    }
}
