import java.util.Scanner;
class RectangleArea {
    public static void main(String[]args){
        Scanner heightWidth = new Scanner(System.in);
System.out.print("Enter height of the rectangle:");
int height = heightWidth.nextInt();
System.out.print("Enter width of the rectangle:");
int width = heightWidth.nextInt();
int areaOfRectangle = height * width;
System.out.println("The Area of the Rectangle is:" +areaOfRectangle);
    }
    
}
