package Com.ArrayProgram.jSpider;

public class Biggest_Element {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,80,70,60,90,70};
        int big=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        System.out.println(big);
    }
}
