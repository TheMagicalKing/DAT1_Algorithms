import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SortingAlgorithms {

    Random rand = new Random();
    ArrayList<Integer> data = new ArrayList<Integer>();
    //---------------------------------\\
    //-----|---|--|̅ ̅ ----/\----|̲̅ ̲̅ |----\\
    //-----|___|--|__---/__\---|-------\\
    //-----|---|--|__--/----\--|-------\\
    //---------------------------------\\
    //-----|̅ ̅ ̅ ---|̅ ̅ ̅ |--|̅ ̅ \--̅ ̅|̅------\\
    //-----˪———˥--|   |--|__/---|------\\
    //------̲ ̲ ̲ |--|___|--|--\---|------\\
    //---------------------------------\\


    public void heapSort(int forMax){



        SortingAlgorithms h = new SortingAlgorithms(); // Not edited, but I would recommend static methods for this example



        // De næste par linjer sørger for at arrayet bliver tomt og får angivet nogle forskellige værdier

        data.clear();
        for (int forCount=0; forCount<forMax;forCount++){
            data.add(forCount);
        }
        Collections.shuffle(data);
        //System.out.println("Det originale Array\n" + data);

        int size = data.size();

        // Prerequisites for max heap sorting.

        for(int i = size / 2 - 1; i >= 0; i--) {
            h.maxHeap(data, i, size);
        }

        for(int i = size - 1; i >= 0; i--) {
            Collections.swap(data, i, 0);
            h.maxHeap(data, 0, i);
        }

        //System.out.print("\nDet heap sorterede array\n"+data+"\n");



    }


    public void maxHeap(ArrayList<Integer> array, int index, int size) {

        int largest = index; // Root Node
        int left = 2 * index + 1; // Left Child node
        int right = 2 * index + 2; // Right Child node

        if (left < size && array.get(left) > array.get(largest)) {
            largest = left;
        }
        if (right < size && array.get(right) > array.get(largest)) {
            largest = right;
        }

        if (largest != index) {
            Collections.swap(array, index, largest); // Swap the indexes not the values
            maxHeap(array, largest, size);
        }

    }

    //---------------------------------\\
    //----|̅ \--|    |--|̅ \--|----|̅ ̅ ---\\
    //----|_/--|    |--|_/--|----|__---\\
    //----| \--|    |--| \--|----|̅ ̅ ---\\
    //----|_/---\__/---|_/--|̲ ̲ --|__---\\
    //---------------------------------\\
    //-----|̅ ̅ ̅ ---|̅ ̅ ̅ |--|̅ ̅ \--̅ ̅|̅------\\
    //-----˪———˥--|   |--|__/---|------\\
    //------̲ ̲ ̲ |--|___|--|--\---|------\\
    //---------------------------------\\

    void bubbleSort(int forMax){
        data.clear();
        for (int forCount=0; forCount<forMax;forCount++){
            data.add(forCount);
        }
        //System.out.println("\nfør Arrayet blev rusket om\n" + data);
        Collections.shuffle(data);
        //System.out.println("\nefter Arrayet blev rusket om\n" + data);
        int n = data.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (data.get(j)>data.get(j+1)){
                    int temp = data.get(j);
                    int a = data.get(j+1);
                    data.set(j, a);
                    data.set(j+1,temp);
                }
            }
        }
        //System.out.println("\nefter Arrayet er blevet sorteret med bubble sort \n" + data);
    }





}
