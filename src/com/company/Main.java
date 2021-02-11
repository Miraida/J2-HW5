package com.company;

import java.util.*;

public class Main  {

    public static void main(String[] args) {
        ArrayList<String> listA = getArrayList();
        printList(listA);
        ArrayList<String> listB = getArrayList();
        printList(listB);

        System.out.println("-------After mixing----------");
        ArrayList<String> listC = mixArrayList(listA,listB);
        printList(listC);

        System.out.println("----------After sort---------");
        Collections.sort(listC,new Comparators());
        printList(listC);
                  // other  option
                 //        Collections.sort(listC, new Comparator<String>() {
                //            @Override
               //            public int compare(String o1, String o2) {
              //                return o1.length()-o2.length();
             //            }
            //        });
    }

    private static <E> void printList(ArrayList<E> list){
        Iterator iterator = list.iterator();
        int i = 0;
          while (iterator.hasNext()){
                   System.out.println(i+" : "+ iterator.next());
                   i++;
           }
    }

    private static ArrayList<String> getArrayList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < 5){
            System.out.println("Enter "+(i+1)+" user name: ");
            list.add(scanner.nextLine());
            // заставим юзера помучиться, если поленился ввести данные
            if (list.get(i).equals("")) {list.remove(i); }
            else i++;
        }
        return list;
    }

    private static ArrayList<String> mixArrayList(ArrayList listA,ArrayList listB){
        ArrayList<String> listC = new ArrayList<>();
        int  b = 4;
        for (int i = 0; i <5 ; i++) {
            listC.add(listA.get(i).toString());
            listC.add(listB.get(b-i).toString());
        }
        return listC;
    }

}
