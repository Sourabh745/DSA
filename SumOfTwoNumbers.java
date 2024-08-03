import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to checks its two sum ");
        int c = sc.nextInt();

        int count=0;
        for(int i=1; i<=c; i++){
            Inner:
            for(int j = 1; j<= c; j++){
                int a = i*i;
                int b = j*j;
                if((a+b) > c){
                    break Inner;
                }
                else if((a+b) == c){
                    System.out.println("Square sum of "+i+" and "+j+" is : True");
                    count++;
                    break;
                }
                else{
                    continue;
                }
            }
            if(count != 0){
                break;
            }
        }
        if(count == 0){
            System.out.println("false");
        }
    }
}
