package com.enigma.model;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Mobil {
    private Integer postX;
    private Integer postY;
    private Integer fuel=0;
    private char[] commends;

    private final String FORWARD = "F";
    private final String BACKWARD = "B";
    private final String LEFT = "L";
    private final String RIGHT = "R";

    public Mobil(Integer x, Integer y){
        this.postX=x;
        this.postY=y;
    }



    public vo id fillFuel(Integer fuel){
        this.fuel=this.fuel + fuel;
    }

    private void move(String movement){
        if(movement.equals(RIGHT)) {
            this.postX++;
        }
        else if(movement.equals(FORWARD)){
            this.postY++;
        }
        else if(movement.equals(LEFT)){
            this.postX--;
        }
        else if(movement.equals(BACKWARD)){
            this.postY--;
        }
    }

    public void setCommends(String commends){
        this.commends = commends.toCharArray();
    }

    public String getPositions(){
        return "(" + postX + "," + postY + ")";
    }

    public void run(){
        for(int i=0; i < this.commends.length; i++){
            if(fuel==0){
                System.out.println("Bensin Habis");
                break;
            }
            move(String.valueOf(this.commends[i]));
            System.out.println(this.commends[i] + getPositions());
            if((i+1) % 3 == 0){
                fuel--;
            }
        }
    }

    public String print() {
        return "Mobil{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                ", commends=" + Arrays.toString(commends) +
                '}';
    }
}