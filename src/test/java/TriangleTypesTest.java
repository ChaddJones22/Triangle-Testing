import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTypesTest {
    String result;

    @Test
    public void testIsosceles(){
        Triangle t = new Triangle(2, 2, 3);
        result = t.triangleType();
        assertEquals("Isosceles", result, "Test for Isosceles Triangle.");
    }

    @Test
    public void testScalene(){
        Triangle t = new Triangle(1,2,3);
        result = t.triangleType();
        assertEquals("Scalene", result,"Testing for Scalene Triangle.");
    }

    @Test
    public void testEquilateral(){
        Triangle t = new Triangle(2,2,2);
        result = t.triangleType();
        assertEquals("Equilateral", result, "Testing for Equilateral Triangle.");
    }

    @Test
    public void testRight(){
        Triangle t = new Triangle(3,4,5);
        result = t.triangleType();
        assertEquals("Scalene and a Right", result, "Testing for Right Triangle.");
    }

    /*@org.junit.jupiter.api.Test
    void main() { }*/
}