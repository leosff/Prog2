package Betriebssysteme;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class threadtest {

    public static void main(String[] args) {
        threadtest(100, 0, 5);
    }


    public static void threadtest(int max, int min, int threadNumber) {

        long startTime = System.nanoTime();

        int thread_block_size = (max - min + threadNumber - 1) / threadNumber;

        ArrayList<threadrandom1> ThreadList = new ArrayList<threadrandom1>();

        int currMin = min;
        int currMax = min + thread_block_size;

        for (int i = 0; i < threadNumber; i++) {
            threadrandom1 thread = new threadrandom1(currMax, currMin);
            ThreadList.add(thread);
            thread.start();

            currMax = Math.min(currMax + thread_block_size, max + 1);
            currMin += thread_block_size;
        }

        for (threadrandom1 t : ThreadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
            }
        }

        int[] merge = new int[max];
        int current = 0;
        int i = 0;

        for (threadrandom1 t : ThreadList) {
            int[] array1 = t.getArray();
            for (int curri = 0; curri < array1.length; curri++) {
                merge[current++] = array1[curri];
            }


        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime + " ns");
    }

}

