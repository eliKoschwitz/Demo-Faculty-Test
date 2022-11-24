package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isThePersonCountOver30() {
        //GIVEN
        int count = 30;
        //WHEN
        boolean actual = Main.personCount(count);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void isThePersonCountUnder30(){
        //GIVEN
        int count = 29;
        //WHEN
        boolean actual = Main.personCount(count);
        //THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void isThePersonCount30(){
        //GIVEN
        int count = 30;
        //WHEN
        boolean actual = Main.personCount(count);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void alarmLevelRed(){
        //GIVEN
        int count = 30;
        //WHEN
        boolean actual = Main.personCount(count);
        //THEN
        Assertions.assertTrue(actual);
    }
}