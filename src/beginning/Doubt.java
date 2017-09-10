package beginning;

import java.util.*;

/**
 * Created by guptaanirudh100 on 8/22/2017.
 */
public class Doubt {
    public static void main(String[] args) {

        int a[]=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=0;
        }

        List list2=new Vector();
//        doIt(a);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Enumeration<Integer> enumeration= Collections.enumeration(list);
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        //finding max in a collection
        System.out.println(Collections.max(list));
        //with a comparator
        System.out.println(Collections.max(list, Comparator.comparingInt(o -> o)));

       //creates n copies of 4 and returns as a list
       List<Integer> newList=Collections.nCopies(5,4);


       Collections.reverse(list);

       Collections.shuffle(list);
        System.out.println("after shuffling");
       Iterator<Integer> iterator=list.listIterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }


       List<String> listString=Collections.singletonList("STRING");
        System.out.println("Singleton list");
        for (String x :
                listString) {
            System.out.println(x);
        }
    }

    public static void doIt(int a[]){
        for(int i=0;i<a.length;i++){
            a[i]=2;
        }
    }
}

