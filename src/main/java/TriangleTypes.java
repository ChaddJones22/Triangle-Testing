import java.io.DataInputStream;
import java.io.IOException;

public class TriangleTypes {
    public static void main(String[] args) throws IOException {

        DataInputStream stdin = new DataInputStream(System.in);
        System.out.println("Types of Triangles Program!");

        String answer = "y";
        while (answer.equals("y")) {
            System.out.println("Enter the 3 sides of the triangle.");

            System.out.println("Side 1?");
            float side1 = Float.parseFloat(stdin.readLine());

            System.out.println("Side 2?");
            float side2 = Float.parseFloat(stdin.readLine());

            System.out.println("Side 3?");
            float side3 = Float.parseFloat(stdin.readLine());

            if ((side1 < 0) || (side2 < 0) || (side3 < 0))
                System.out.println("Error: Side cannot be negative number.");
            else {
                Triangle T = new Triangle(side1, side2, side3);

                System.out.println("We have a " + T.triangleType() + " triangle.");
            }
            System.out.println("Do you want to run program again? y or n?");
            answer = stdin.readLine();
        }

    }
}
