import java.util.Scanner;
class InputTwoNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
int numberOne = sc.nextInt();
System.out.print("Enter another number:");
int numberTwo = sc.nextInt();
int sum = numberOne + numberTwo;
System.out.println("The sum is:" +sum);
    }
    
}
