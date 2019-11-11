public class Triangle {
    private float side1, side2, side3;

    public Triangle(float s1, float s2, float s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public String triangleType(){
        String results = "";
        if ((side1 <= 0) || (side2 <= 0) || (side3 <= 0)){
            System.out.println("Error: Sides cannot be less than or equal to 0.");
            results+="Invalid";
        }
        if ((side1 == side2) && (side1 == side3)) //equilateral test
            results+="Equilateral";
        if (((side1 == side2) && (side1 != side3)) ||
                ((side1 == side3) && (side1 != side2)) ||
                ((side2 == side3) && (side2 != side1))) //Iso Test
            results+="Isosceles";
        if ((side1 != side2) && (side1 != side3) && (side2 != side3)) //Scalene Test
            results+="Scalene";
        if (((side1*side1) == ((side2*side2) + (side3*side3))) ||
                ((side2*side2) == ((side1*side1) + (side3*side3))) ||
                ((side3*side3) == ((side1*side1) + (side2*side2)))) //Right Test
        /*(((Math.sqrt((side1*side1)+(side2*side2))) == side3) ||
                ((Math.sqrt((side1*side1)+(side3*side3)))== side2) ||
            ((Math.sqrt((side3*side3)+(side2*side2)))== side1))*/
            results+=" and a Right";
        return results;
    }
}
