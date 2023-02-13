import java.util.*;
public class element {
    int arr[]={12,34,56,24,56};
    Scanner sc =new Scanner(System.in);
    int a,b;
    void getSearchElement(){
        System.out.print("Enter the number what you want to search:");
        a=sc.nextInt();
    } 
    void search(){
        boolean eq=false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==a) {
                eq=true;
                b=i;
                break;
            }
        }
        if (eq) {
            System.out.println("Search element is found");
            System.out.println("Found location is "+""+(b+1));
        }else{
            System.out.println("Search element is not found");             
        }
    }
    public static void main(String[] args) {
        element ob=new element();
        ob.getSearchElement();
        ob.search();
    }
}