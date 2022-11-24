package de.neuefische;

public class FacultyWithWhile {

    public static int facultyWhile(int count){
        int sCount = count;
        int x = 1;
        int y = 1;
        int z = 1;

        while(true){
            x = x * y;
            if(sCount <= z){
                break;
            }
            z++;
            y++;
        }
        return x;
    }
}
