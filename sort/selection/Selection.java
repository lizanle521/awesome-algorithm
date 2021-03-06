import java.util.*;

public class Selection {
    public static void sort(Comparable[] a) {
	int num = a.length;
      
        for(int i = 0; i < num; i++) {
	    int min = i;
	    for(int j = i + 1; j < num; j++) {
		if(Util.less(a[j], a[min]))
		    min = j;  
	    }
	    Util.exch(a, i, min);
        }
    }

    public static void main(String[] args) {
	Integer[] a = new Integer[]{1,5,3,9,8,4,10,6};
	sort(a);
	for(int i = 0; i < a.length; i++) {
	    System.out.println(a[i]);
	}
    }
}
