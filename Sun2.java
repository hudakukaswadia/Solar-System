
/**
 * Models the Sun. 
 * This class represents Sun. In this case, inheritance is applied,
 * and the Location class is inherited 
 * therefore displaying it on the screen.
 */

public class Sun2 extends Location

{
    private double diameter;                //the diameter of the sun - private class attribute
    private String colour;                  //The color of the sun - private class attribute

    /** 
    * Obtains the Diameter.
    * @return the diameter.
    */

    public double getDiameter()

    {
        return diameter;
    }

    /** 
    * Obtains the Color.
    * @return the colour.
    */

    public String getColour()

    {
        return colour;
    }

    /**
    *
    * Constructor. Create a new instance of a Sun.
    *
    * @param diameter This includes the diameter of the sun. The size of the object.
    * @param colour the colour of this object, as a string. Case insentive. <p>One of: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, 
	* MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW.
    *
    */

    public Sun2(double distance, double angle, double diameter, String colour)

    {
        super(distance, angle);

        this.diameter = diameter;
        this.colour = colour;
        
    }

     

}