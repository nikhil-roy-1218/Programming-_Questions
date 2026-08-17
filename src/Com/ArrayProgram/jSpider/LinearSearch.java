package Com.ArrayProgram.jSpider;

public class LinearSearch {
    public static void main(String[] args){
        int a[]={20,30,40,50,60,70};
        int target=50;
        int index=linearSearch(a,target);
        if(index==-1)
            System.out.println("Element not fount");
        else
            System.out.println("Element found at index "+index);
    }
    private static int linearSearch(int[] a,int target){
        for (int i=0;i<=a.length-1;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}
