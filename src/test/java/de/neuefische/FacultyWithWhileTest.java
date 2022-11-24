package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FacultyWithWhileTest {

    @Test
    void faculty3Expect6() {
        //GIVEN
        int num = 3;
        //WHEN
        int actual = FacultyWithWhile.facultyWhile(num);
        //THEN
        Assertions.assertEquals(6, actual);
    }

    @Test
    void faculty4Expect24() {
        //GIVEN
        int num = 4;
        //WHEN
        int actual = FacultyWithWhile.facultyWhile(num);
        //THEN
        Assertions.assertEquals(24, actual);
    }
}