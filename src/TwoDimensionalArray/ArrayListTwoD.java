package TwoDimensionalArray;

import java.util.ArrayList;

public class ArrayListTwoD {
    static void main(String[] args) {
        ArrayList<ArrayList<Integer> > arr = new ArrayList<>();

        ArrayList <Integer> a = new ArrayList<>();
        a.add(23); a.add(2); a.add(45); a.add(132);

        ArrayList <Integer> b = new ArrayList<>();
        b.add(34); b.add(5); b.add(87);

        ArrayList <Integer> c = new ArrayList<>();
        c.add(34); c.add(4); c.add(56); c.add(55);

        arr.add(a);
        arr.add(b);
        arr.add(c);

//        System.out.println(arr);

//        for(int i = 0; i<arr.size(); i++){
//            for(int j = 0; j < arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j) + " ");
//            }
//
//            System.out.println();
//        }


        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }


}
