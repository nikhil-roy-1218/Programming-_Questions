package Com.ArrayProgram.jSpider;
// Write a program to merge two array
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArray {
    static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={100,200,300,400,500};
        System.out.println(Arrays.toString(merge(a,b)));
    }

    private static int[] merge(int[]a,int[]b){
        int c[]=new int[a.length+b.length];
        for(int i=0;i<=a.length-1;i++){
            c[i]=a[i];
        }
        for(int j=0;j<=b.length-1;j++){
            c[a.length+j ] = b[ j ];
        }
        return c;
    }
}
