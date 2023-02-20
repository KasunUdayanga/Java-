/**
 * Bublemis
 */
public class Bublemis {

   void bublsort(int []a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j]<a[j-1]) {
                    int temp =a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;

                }
            }
        }
    }
    void print(int[]a){
        System.out.println("After sorting: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Bublemis ob1=new Bublemis();
        int num[]={12,32,43,34};
      

        System.out.println("Before sorting: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        ob1.bublsort(num);
        System.out.println( ); 
        ob1.print(num);
       
       
       
    }
}