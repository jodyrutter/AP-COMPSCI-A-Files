/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/3/2015 v1.0
 */
public class TestTriangles
{
    public static void main(String[] args)
    {
        //Declare triangle objects
        Triangle triangle1 = new Triangle(4.0,5.0,6.0);
        Equilateral triangle2 = new Equilateral(5.0);
        IsoscelesRight triangle3 = new IsoscelesRight(1.5);
        
        //Print
        System.out.println("Triangle has sides A = "+triangle1.getSideA()+", B = "+triangle1.getSideB()+", C = "+triangle1.getSideC());
        System.out.println("Equilateral Triangle has sides A = "+triangle2.getSideA()+", B = "+triangle2.getSideB()+", C = "+triangle2.getSideC());
        System.out.println("Isosceles Right Triangle has sides A = "+triangle3.getSideA()+", B = "+triangle3.getSideB()+", C = "+triangle3.getSideC());
    }
}