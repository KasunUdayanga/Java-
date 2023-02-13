import java.util.Scanner;
public class binary {
  
    Scanner sc =new Scanner(System.in);
    int[] getArray(){

  
        System.out.println("Enter size of arry :");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the Arry element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        return a;
    }

    int getSearchElement(){
        System.out.println("Enter element you want to search: ");
        int s=sc.nextInt();
        return s;
        
    }
    int binarySearch(int ar[],int searchEle){
        int lowerbound=0;
        int upperBound=ar.length;
        while (lowerbound<=upperBound) {
            int mid =(lowerbound+upperBound)/2;
                if (ar[mid]==searchEle) {
                    return mid;
                }else if(searchEle>ar[mid]){
                   return lowerbound=mid+1;
                }else{
                   return upperBound=mid-1;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        binary ob=new binary();
    int a[]=ob.getArray();
    int b=ob.getSearchElement();
       System.out.println( "Index of the element: "+ob.binarySearch(a, b));
    }
}