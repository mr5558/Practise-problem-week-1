import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;
        double areaCm, areaIn;

        // Input
        System.out.print("Enter base (in cm): ");
        base = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        height = sc.nextDouble();

        // Area in square centimeters
        areaCm = 0.5 * base * height;

        // Convert sq cm to sq inches
        // 1 inch = 2.54 cm
        // 1 sq inch = 6.4516 sq cm
        areaIn = areaCm / 6.4516;

        // Output
        System.out.println("The Area of the triangle in sq in is " 
                            + areaIn + 
                            " and sq cm is " + areaCm);

        sc.close();
    }
}