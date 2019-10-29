/**
 * Models the location. 
 * This class represents Location. 
 * The objects of the solar system can be displayed appropriately 
 */

public class Location
{
    private double distance;            //the distance of the object - private class attribute.
    private double angle;               //the angle of the object - private class attribute.

    /** 
    * Obtains the Distance.
    * @return the distance.
    */

    public double getDistance()

    {
        return distance;
    }

    /** 
    * Obtains the Angle.
    * @return the angle.
    */

    public double getAngle()

    {
        return angle;
    }

    /**
    *
    * Constructor. Create a new instance of a Location.
    *
    * @param distance the distance from this object to the point about which it is orbiting.
    * @param angle the angle (in degrees) that represents how far the object is around its orbit. 
    *
    */

    public Location(double distance, double angle)
    {
        this.distance = distance;

        this.angle = angle;

    }

}