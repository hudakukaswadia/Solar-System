/**
 * Models the Planet. 
 * This class represents Planet. In this case, inheritance is applied,
 * and the sun2 class is inherited 
 * therefore displaying it on the screen.
 */

public class Planet2 extends Sun2

{
    private double angle;                   //angle of the planet - priivate class attribute.
    private double speed;                   //speed of the planet when its orbiting around the sun - private class attribute.

    /** 
    * Obtains the Speed.
    * @return the speed.
    */

    public double getSpeed()

    {
        return speed;
    }

    /** 
    * Obtains the Move (method).
    * @return the angle.
    */

    public double move()

    {
        angle += speed;
        return angle;
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
    * Constructor. Create a new instance of a Planet.
    *
    * @param speed This includes the speed of the planet, the velocity at which the planet orbits the sun
    * @param angle the angle (in degrees) that represents how far the planet is around its orbit of the sun.
    *
    */

    public Planet2(double distance, double angle, double diameter, String colour, double speed)
    {

        super(distance, angle, diameter, colour);

        this.speed = speed;
        this.angle = angle;

    }

}