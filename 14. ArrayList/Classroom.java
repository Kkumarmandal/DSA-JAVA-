import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        //ArrayList <String> list2 = new ArrayList<>();
        //ArrayList <Boolean> list3 = new ArrayList<>();
        
        // Add Element 
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(4);

        list.add(6, 7);

        System.out.println(list);

        // Get Element
        /*int element = list.get(3);
        System.out.println("The element of index is  " + element);*/

        // Remove Element
        /*list.remove(2);
        System.out.println(list);*/

        //Set Element at Index
        /*list.set(2, 10);
        System.out.println(list);*/

        //Contain element
        /*System.out.println(list.contains(10));
        System.out.println(list.contains(12));*/

        // Size of ArrayList
        //System.out.println("The Size of the array " + list.size());

        // Print the arrayList

        /*for (int i=0; i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();*/

        // Reverse the arrayList

        /*for (int i = list.size()-1; i>= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();*/

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++){
        //     if (max < list.get(i)) {
        //         max = list.get(i);                
        //     }
        max = Math.max(max, list.get(i));
        }        
        System.out.println("Max element = " + max);

    }
}
