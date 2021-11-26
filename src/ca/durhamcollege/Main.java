
/**
 * @authors  Katherine Bellman - 100325825
 * @file    OOP3200 - Fall 2021 - Java ICE 9
 * @date    November 23rd, 2021
 */

package ca.durhamcollege;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

// driver class
public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String prompt = "";
        int numberOfPoints = 4;

        //instatiates the collection container
        Vector<Vector2D> points = new Vector<Vector2D>();

        //builds a vector of 4 points
        for (int i = 0; i < numberOfPoints; i++) {
            points.add(Vector2D.zero());
        }


        for (int i = 0; i < 3; i+=2)
        {
            System.out.print("Enter the first point (x, y): ");
            prompt = keyboard.nextLine();
            var values = prompt.split(",");
            points.get(i).set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));


            System.out.println("\n--------------------------------------------------------------" );
            System.out.println("You Entered " + points.get(i).toString() + " for the first point" );
            System.out.println("--------------------------------------------------------------\n" );

            System.out.print("Enter the second point (x, y): ");

            prompt = keyboard.nextLine();
            values = prompt.split(",");
            points.get(i+1).set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

            System.out.println("\n--------------------------------------------------------------" );
            System.out.println("You Entered " + points.get(i+1).toString() + " for the second point" );
            System.out.println("--------------------------------------------------------------\n" );

                                                // To use RandomVector container class, need to pass through Instance() FIRST
            Vector2D randomVector2D = RandomVector.Instance().createVector2D(points.get(i), points.get(i+1));
            System.out.println("\n--------------------------------------------------------------" );
            System.out.println("The Random Vector is" + randomVector2D.toString());
            System.out.println("--------------------------------------------------------------\n" );

            points.add(randomVector2D);
        }


        System.out.printf("Magnitude of first random point is: %.3f \n", points.get(4).getMagnitude());
        System.out.printf("Magnitude of second random point is: %.3f \n",points.get(5).getMagnitude());
        System.out.printf("Distance between first random point and second random point is: %.3f \n", Vector2D.distance(points.get(4), points.get(5)));
        System.out.println("--------------------------------------------------------------\n" );
    }
}
