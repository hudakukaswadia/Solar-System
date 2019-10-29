
/**
* Models Solar System.
* This class represents Solar System. When combined with the SolarSystem class given by Joe,
* instances of the SolarSystem2 class can be displayed on the screen.
*/

import javax.swing.*;

import java.awt.Color;

import java.util.Random;

import java.io.*;

public class SolarSystem2
{
    public static void main(String[] args)
    {
        Random rand = new Random();                                         // Create instance of random class - will generate random numbers
        SolarSystem ss = new SolarSystem(900, 900);                         // Create an object of class SolarSystem. (This will call the constructor). The size of the window has been allocated.
        Moon2[] moon2 = new Moon2[40];                                      // An array of moons with array length = 40
        Planet2[] planets = new Planet2[5];                                 // An array of planets with array length = 5
        Asteroid[] asteroid = new Asteroid[900];                            // An array of asteroids with array length = 900
        
        Sun2 s = new Sun2(0, 0, 50, "YELLOW");                              // Create an object of class Sun, set the values and color (This will call the constructor)

        //The distance, diameter, speed, angle and colour located in each

        planets[0] = new Planet2(60, 30, 15, "GREEN", 3);                   // mercury
        planets[1] = new Planet2(90, 30, 15, "PINK", 3);                    // venus
        planets[2] = new Planet2(140, 30, 15, "BLUE", 2);                   // earth
        planets[3] = new Planet2(180, 30, 15, "RED", 1.2);                  // mars
        planets[4] = new Planet2(350, 30, 15, "MAGENTA", 1.2);              // jupiter

        //The distance, diameter, speed, angle and colour located in each
        //Generate random doubles
        
        for (int i = 0; i < moon2.length; i++) 
        {
            moon2[i] = new Moon2(20 + rand.nextDouble() * 30, rand.nextDouble() * 360, 2, "WHITE", 1.0);
        }

        for (int i = 0; i < asteroid.length; i++) 
        {
            asteroid[i] = new Asteroid(250 + rand.nextDouble() * 50, rand.nextDouble() * 360, 2, "WHITE", 1.0);
        }

        // A while loop is created ensuring that the movement of the planets is continuous.
        // A loop has been created which inturn will then add planets and sun on the screen.

        while (true)

        {
            if (planets != null)
            {
                for (int i = 0; i < planets.length; i++)
                {
                    ss.drawSolarObject(s.getDistance(), s.getAngle(), s.getDiameter(), s.getColour());
                    ss.drawSolarObject(planets[i].getDistance(), planets[i].move(), planets[i].getDiameter(), planets[i].getColour());
                }
            }

            // A loop has been created which inturn will make 2 moons orbit around planet 3 which is Mars. 

            for (int i = 0; i < 2; i++) 
            {
                ss.drawSolarObjectAbout(moon2[i].getDistance(), moon2[i].getAngle() + moon2[i].move(), moon2[i].getDiameter(), moon2[i].getColour(), planets[3].getDistance(), planets[3].getAngle());
            }

            // A loop has been created which inturn will make 1 moon orbit around planet 2 which is Earth. 

            for (int i = 0; i < 1; i++) 
            {
                ss.drawSolarObjectAbout(moon2[i].getDistance(), moon2[i].getAngle() + moon2[i].move(), moon2[i].getDiameter(), moon2[i].getColour(), planets[2].getDistance(), planets[2].getAngle());
            }

            // A loop has been created which inturn will make 4 moons orbit around planet 4 which is Jupiter. 

            for (int i = 0; i < 4; i++) 
            {
                ss.drawSolarObjectAbout(moon2[i].getDistance(), moon2[i].getAngle() + moon2[i].move(),moon2[i].getDiameter(), moon2[i].getColour(), planets[4].getDistance(), planets[4].getAngle());
            }

            // A loop has been created which inturn will make all asteroids orbit around the Sun.

            for (int i = 0; i < asteroid.length; i++) 
            {
                ss.drawSolarObjectAbout(asteroid[i].getDistance(), asteroid[i].getAngle() + asteroid[i].move(),asteroid[i].getDiameter(), asteroid[i].getColour(), s.getDistance(), s.getAngle());
            }

            ss.finishedDrawing();

        }

    }

}