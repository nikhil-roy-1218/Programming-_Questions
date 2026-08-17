package Com.ArrayProgram.jSpider;

public class Odd_Element {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,9,8,5,12};
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]%2!=0){
                sum=sum+a[i];

            }

        }
        System.out.println(sum);
    }
}
