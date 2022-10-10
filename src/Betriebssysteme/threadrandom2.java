package Betriebssysteme;

public class threadrandom2 extends Thread {
    private int min;
    private int max;
    private int[] array1;

    public threadrandom2(int max, int min) {
        this.max = max;
        this.min = min;
        this.array1 = new int[0];
    }

    public int[] getArray(){
        return array1;
    }

    @Override
    public void run() {
        int count = max-min;
        array1 = new int[max-min];
        for(int i = 0; i < count; i++){
            array1[i] = (int)(Math.random()*max);
        }
    }
}
