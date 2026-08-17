package Com.ArrayProgram.jSpider;

public class Smallest_Element {
    static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,40,70,5};
        int small=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
