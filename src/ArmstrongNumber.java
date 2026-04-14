public class ArmstrongNumber {
    public static void main(String[] args) {
       // int number = 153;
        int number = 185;
        int originalNum = number;
        int sum =0;
        while (number!=0){
            int digit = number%10;
            sum = sum+ digit*digit*digit;
            number=number/10;

        }
        if (sum==originalNum){
            System.out.println(originalNum+" is an Armstrong number");
        }else {
            System.out.println(originalNum+" is not an Armstrong number");
        }
    }
}
