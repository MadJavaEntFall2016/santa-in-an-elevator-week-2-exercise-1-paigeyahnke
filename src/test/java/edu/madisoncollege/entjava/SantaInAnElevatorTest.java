package edu.madisoncollege.entjava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Paige on 9/10/2016.
 */
public class SantaInAnElevatorTest {

    @Test
    public void determineFloorNumber() throws Exception {
        SantaInAnElevator test1 = new SantaInAnElevator();
        String instructions = test1.getInstructions();
        Integer floorNumber = test1.determineFloorNumber(instructions);
    }

}