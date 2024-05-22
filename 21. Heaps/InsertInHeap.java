import java.util.*;

public class InsertInHeap {
    static class Heap {
        ArrayList <Integer> arr = new ArrayList<>();

        // INSERT
        public void add (int data){
            //add at last idx
            arr.add(data);
            // chid indx
            int x = arr.size()-1;
            //parent idx
            int par = (x -1)/2;

            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);  //temp = child.value
                arr.set(x, arr.get(par));   //child.value = parent.value
                arr.set(par, temp); // parent.idx = temp.value
            }
        }

        // PEEK
        public int peek (){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {
        
    }
}
