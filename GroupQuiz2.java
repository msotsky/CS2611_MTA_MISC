//Group: Weiting Li, Lopsii Olagoke, Max Sotsky, Pushkaraj Jadhav
public class GroupQuiz2 {
    public int maxValue(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public int packHelp(int[] weight, int[] sparkingJoy, int restriction,int numItem){
        if((restriction == 0) || (numItem == 0)){
            return 0;
        }
        if( restriction < weight[numItem-1]  ){
            return packHelp(weight, sparkingJoy, restriction,numItem-1);
        }else{
            return maxValue( sparkingJoy[numItem-1] + packHelp(weight, sparkingJoy,restriction-weight[numItem-1],numItem-1),
                    packHelp(weight,sparkingJoy,restriction,numItem-1) );
        }
    }
    public int helpSmoresPack(int[] weight, int[] sparkingJoy, int restriction){
        int numItem = weight.length;
        return packHelp(weight,sparkingJoy,restriction,numItem);
    }

    public static void main(String[] args) {
        int[] weight = new int[]{2,3,3,4};
        int[] sparkingValue = new int[]{1,2,5,9};
        GroupQuiz2 obj = new GroupQuiz2();
        System.out.println("max sparking value is "+ obj.helpSmoresPack(weight,sparkingValue,5));
    }
}
