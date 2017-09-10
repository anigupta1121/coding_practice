package beginning;

import java.util.*;

/**
 * Created by guptaanirudh100 on 7/12/2017.
 */
public class HackerLandRadio {

    public static void main(String[] args) {
        FastReader in=new FastReader();
        int n = in.nextInt();
        int k = in.nextInt();
        Lands[] x = new Lands[n];
        for(int i=0; i < n; i++){
            Lands land=new Lands();
            land.setA(in.nextInt());
            land.setCovered();
            x[i]=land;

        }
//        Arrays.sort(x, (o1, o2) -> o1.getA()-o2.getA());
        Arrays.sort(x, Comparator.comparingInt(Lands::getA));
        for(int i=1; i < n; i++){

        }





    }

    public int binarySearch(int a[], int x, int low, int high) {


        while (high > low) {
            int mid = (low + high) / 2;
            if (a[mid] == x) {
                return mid;
            }
            if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}
 class Lands {
    public int a=0;
    public boolean covered=false;

    int getA() {
        return a;
    }

    void setA(int a) {
        this.a = a;
    }

    boolean isCovered() {
        return covered;
    }

    void setCovered() {
        this.covered = false;
    }




}
