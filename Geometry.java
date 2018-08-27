/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a rectangle.
     *
     * @param b  length of base of rectangle
     * @param h  height of the rectangle
     * @return   area of the rectangle
     */
    public static double rectangleArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a trapezoid.
     *
     * @param b  length of base of trapezoid
     * @param h  height of the trapezoid
     * @param b2 length of second base of trapezoid
     * @return   area of the trapezoid
     */
    public static double trapezoidArea(double base1, double base2, double height) 
    {
        double area = ( (base1 + base2) / 2) * height;
        return area;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = rectangleArea(5.2, 9.3);
        System.out.println(ra1);
    }
    
    /**
     * Calculates the volume of a rectangular prism
     * 
     * @param l length of the prism
     * @param w width of the prism
     * @prism h height of the prism
     * @return  volume of the rectangular prism
     */
    public static double rectangularprismVolume(double length, double width, double height)
    {
         double volume = width * length * height;
         
         return volume;
    }
    
    /**
     * Calculates the volume of a cone
     * 
     * @param r radius of cone
     * @param h height of cone
     * @return  volume of cone
     */
    public static double coneVolume(double radius, double height)
    {
        double volume = Math.PI * Math.pow(radius, 2) * (height / 3);
    
        return volume;
    }
    
    /**
     * Calculates surface area of a rectangular prism
     * 
     * @param l length of prism
     * @param w width of the prism
     * @param h hegith of the prism
     * @return  surface area of rectangular prism
     */
    public static double rectangularprismSurfaceArea(double length, double width, double height)
    {
        double SurfaceArea = 2*(width*length+height*length+height*width);
        
        return SurfaceArea;
    }
    
    /**
     * Calculates surface area of a sphere
     * 
     * @param radius of prism
     * @return  surface area of sphere
     */
    public static double sphereSurfaceArea(double radius)
    {
        double SurfaceArea = 4*Math.PI*Math.pow(radius,2);
        
        return SurfaceArea;
    }
    
    /**
     * Calculates the hypotenuse of a right triangle when given lengths of the two legs
     * 
     * @param a length of one side
     * @param b length of the other side
     * @return  hypotenuse of right tringle
     */
    public static double hypotenuse(double a, double b)
    {
        double hypotenuse = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        
        return hypotenuse;
    }
    
    /**
     * Calculates the distance between two points (x1, y1) and (x2, y2)
     * 
     * @param x1 x value of first point
     * @param x2 x value of second point
     * @param y1 y value of first point
     * @param y2 y value of second point
     * @return  distance between two point
     */
    public static double distnaceFormula (double x1, double x2, double y1, double y2)
    {
        double distanceFormula = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        
        return distanceFormula;
    }
    
    /**
     * Calculates slope of the line between two points (x1, x2) and (x2, y2)
     * 
     * @param x1 x value of first point
     * @param x2 x value of second point
     * @param y1 y value of first point
     * @param y2 y value of second point
     * @return  slop of the line
     */
    public static double slope (double x1, double x2, double y1, double y2)
    {
        double slope = (y2-y1)/(x2-x1);
        
        return slope;
    }
    
    /**
     * Calculates the area of a triangle when given three sides (a, b, c)
     * 
     * @param a side length
     * @param b side length
     * @param c side length
     * @return  area of triangle
     */
    public static double triangleArea (double a, double b, double c)
    {
        double p = (a+b+c)/2;
        double triangleArea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        return triangleArea;
    }
}
