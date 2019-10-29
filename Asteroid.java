/**
 * Models the Asteroids orbiting the sun. 
 * This class represents Asteroid. In this case, inheritance is applied,
 * and the Planet2 class is inherited 
 * therefore displaying asteroids on the screen.
 */

public class Asteroid extends Planet2

{
    public Asteroid(double distance, double angle, double diameter, String colour, double speed)
    {
        super(distance, angle, diameter, colour, speed);
    }
    
}