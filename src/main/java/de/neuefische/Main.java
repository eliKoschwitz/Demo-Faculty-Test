package de.neuefische;

public class Main {

    public static boolean personCount(int count){
        if(count > 30) {
            return true;
        } else if (count < 30){
            return false;
        } else if(count == 30) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}