import java.util.Scanner;

class PassValue { 
    float total; 
    float percent; 
    float percentCalculator(float x, float y) 
    { total=y; 
        percent=x;
         float percentResult=((percent/total)*100);
          return percentResult;
         } 
        } 
        class calculator {
public static void main(String []args)
{
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Total Marks= ");
    float totalObtain=s.nextInt();
    System.out.print("Enter Total Marks = ");
    float percentage=s.nextInt();
    PassValue objectValue=new PassValue();
    float finalResult= objectValue.percentCalculator(totalObtain,percentage);
    System.out.println("Marks Obtain:"+finalResult);
 } 
}
