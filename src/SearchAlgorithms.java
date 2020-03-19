import java.util.ArrayList;
import java.util.Random;

public class SearchAlgorithms {

    ArrayList<Integer> data = new ArrayList<Integer>();

    int forCount;

    Random rand = new Random();



    public void dataFillStatic(int forMax){
        data.clear();

        for (int forCount=0; forCount<forMax;forCount++){
            data.add(forCount);

        }

    }
    public void dataFillRand(int forMax){
        data.clear();
        for (int forCount=0; forCount<forMax;forCount++){
            data.add(rand.nextInt(forMax));
        }

    }



    public String find(int tal, int arrayMax, int fillType){
        String a = null;

        if (fillType == 1){
            dataFillStatic(arrayMax);
        } else
            dataFillRand(arrayMax);
        System.out.println("\n"+data);
        for (int i = 0; i<data.size(); i++) {
            if (data.get(i)==tal) {
                a = "\nTallet, " + tal + " er blevet fundet på plads " + i + " i indexet";
                //System.out.println(a);

                return a;
            }
        }

        a = "\n" + tal + " er ikke blevet fundet";
        //System.out.println(a);
        return a;
    }

    public int findAlle(int tal, int arrayMax, int fillType){

        if (fillType == 1){
            dataFillStatic(arrayMax);
        } else if (fillType == 2) {
            dataFillRand(arrayMax);
        }
        int sameCount = 0;
        for (int i = 0; i<data.size(); i++){
            if (data.get(i)==tal){
                sameCount++;
            }
        }
        //System.out.println("\n"+data);
        //System.out.println("\nDer blev fundet " + sameCount + " pladser med tallet " + tal + " i indexet");
        return sameCount;
    }
    public int findMax(int arrayMax, int fillType){

        if (fillType == 1){
            dataFillStatic(arrayMax);
        } else
            dataFillRand(arrayMax);

        int maksTal = 0;
        for ( int i = 0; i<data.size(); i++){
            if (data.get(i)>maksTal){
                maksTal = data.get(i);
            }
        }
        // System.out.println("\nDet højeste tal I indexet er = " + maksTal);
        return maksTal;
    }

}
