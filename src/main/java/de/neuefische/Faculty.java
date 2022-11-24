package de.neuefische;

public class Faculty {

    public static int faculty(int num){
        int facul = 0;
        for(int i = 1; i < num; i++){
            facul = facul * i;
        }
        return facul;
    }

}
