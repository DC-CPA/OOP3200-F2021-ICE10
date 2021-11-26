
/**
 * @authors  Katherine Bellman - 100325825
 * @file    OOP3200 - Fall 2021 - Java ICE 10
 * @date    November 24th 2021
 */

package ca.durhamcollege;
import java.util.Random;

//singleton = only one instance of it at a time
public class RandomVector
{
    private Random m_rand;

    //STEP 1 --private static instance
    private static RandomVector m_instance = null;

    //STEP 2 --make the default constructor private
    private RandomVector()
    {
        m_rand = new Random();
    }
    //STEP 3-- make a public instance method that acts as a "portal" to the class
    public static RandomVector Instance()
    {
        if(m_instance == null)
        {
            //works like a pointer
            m_instance = new RandomVector();
        }
        return m_instance;
    }


    public final
    Vector2D createVector2D(final Vector2D start, final Vector2D end)
    {
        Random rand = new Random(); //instance of random class

        //sample values  5, 10 and 20, 30
        //minx = 5
        //maxx = 20

        //miny = 10
        //maxy = 30

//generate random X value
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float randomX = (rand.nextFloat() * (maxX - minX)) + minX;

//generate random Y value
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());
        float randomY = (rand.nextFloat() * (maxY- minY)) + minY;


         return new Vector2D(randomX, randomY);
    }
}
