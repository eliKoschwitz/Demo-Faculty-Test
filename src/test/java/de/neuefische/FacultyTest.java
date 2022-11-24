package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {

    @Test
    void FacultyNullReturnOne() {
        //GIVEN
        int num = 0;
        //WHEN
        int actual = Faculty.faculty(num);
        //THEN
        Assertions.assertEquals(1, actual);
    }

    @Test
    void FacultyOneReturnOne(){
        //GIVEN
        int num = 1;
        //WHEN
        int actual = Faculty.faculty(num);
        //THEN
        Assertions.assertEquals(1, actual);
    }

    @Test
    void FacultyTwoReturnTwo(){
        // GIVEN
        int num = 2;
        // WHEN
        int actual = Faculty.faculty(num);
        //THEN
        Assertions.assertEquals(2, actual);
    }

    @Test
    void FacultyThreeReturnSix(){
        // GIVEN
        int num = 3;
        // WHEN
        int actual = Faculty.faculty(num);
        //THEN
        Assertions.assertEquals(6, actual);
    }

    @Test
    void FacultyFourReturn24(){
        // GIVEN
        int num = 4;
        // WHEN
        int actual = Faculty.faculty(num);
        //THEN
        Assertions.assertEquals(24, actual);
    }

}