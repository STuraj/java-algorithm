package day17;

public class MoveZeroes {
    public  static void moveZeroes(int [] num){
        int index=0;
        for (int i=0; i<num.length; i++){
            if (num[i]!=0){
                num[index]=num[i];
                index++;
            }
        }
        while (index<num.length){
            num[index]=0;
            index++;
        }
    }

    public static void main(String[] args) {
        int [] num = {0,1,0,3,12};
        moveZeroes(num);
        for (int nums : num){
            System.out.print(nums + " ");
        }
    }
}
