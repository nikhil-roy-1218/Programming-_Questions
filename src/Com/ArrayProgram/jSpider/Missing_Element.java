package Com.ArrayProgram.jSpider;

public class Missing_Element {
    public static void main(String[] args){
        int a[]={1,2,5,6,7,8};
        int n=a.length+1;
        int natNum= n*(n+1)/2;
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println("Missing element is: "+ (natNum-sum));
    }
}
