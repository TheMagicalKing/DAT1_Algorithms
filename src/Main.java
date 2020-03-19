import java.util.Date;

/*
* This is a tiny library for testing how long a given algorithm takes to execute
*
* Usage:
* 1) replace myAlgorithm() with your own algorithm
* 2) change N to test, how long it takes to execute your code
*
* Be aware: You are likely to crash your apps :)
*
* See results of my execution:
* https://docs.google.com/spreadsheets/d/1bNa1zfQ4yqkKcMb42Kh8lSZjfu97V9hx9i1qyvlfAtw/edit#gid=0
*
* Written by András Ács anac@easj.dk in 2017
*
* */
public class Main {

    private static final int N = 60000; // Change the value of N for more or less iterations

    public static void main(String[] args) {

        SortingAlgorithms sort = new SortingAlgorithms();
        SearchAlgorithms search = new SearchAlgorithms();

        long startTime = MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");


        myAlgorithm();

        for (int i = 0; i < N; i++){
        sort.heapSort(100);
        }
        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);
        startTime = MyTimer.currentTimestamp();
        for (int i = 0; i < N; i++){
            sort.bubbleSort(100);
        }
        endTime = MyTimer.currentTimestamp();
        resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);
        for (int i = 0; i < N; i++){
            search.findAlle(20, 100,2);
        }
        endTime = MyTimer.currentTimestamp();
        resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);

        // Replace this with your own algorithm


    }


    /**
     * This is the algorithm, we are testing in the main method
     */
    private static void myAlgorithm() {

        for (int i = 0; i <N ; i++) {
            System.out.print(".");
        }

    }
}
