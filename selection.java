public class selection {
    void sort(int[]a){
        int n= a.length;
            for (int i = 0; i < n-1; i++) {
                int min_idx=i;
                for (int j = i+1; j < n; j++) {
                    if (a[j]<a[min_idx]) {
                        min_idx=j;
                    }
                }
                int temp=a[min_idx];
                a[min_idx]=a[i];
                a[i]=temp;
            }
    }
    void print(int[]a){
        System.out.println("After sorting: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        selection ob=new selection();
        int arr[]={23,33,22,25,65};
       
       
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        ob.sort(arr);
        System.out.println();
        ob.print(arr);
    }
}
