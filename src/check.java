import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int m=sc.nextInt(), s=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==m)
            {s=1;}
        }
        if(s==1) {
            System.out.println("Entered Number is Present in the array");
        }
        else
            System.out.println("The Number you Entered is not present");
    }
}
