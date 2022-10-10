package Betriebssysteme;

import java.util.Random;

public class threadrandom1 extends Thread {
    private int min;
    private int max;
    private int[] array1;

    public threadrandom1(int max, int min) {
        this.max = max;
        this.min = min;
        this.array1 = new int[0];
    }

    public int[] getArray(){
        return array1;
    }

    public void run() {
        int count = max-min;
        array1 = new int[max-min];
        Random number = new Random();
        for(int i = 0; i < count; i++){
            array1[i] = number.nextInt(max);;
        }
    }
}
