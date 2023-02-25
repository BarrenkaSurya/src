package NewtonSchool_.newtonschool;

import java.util.Scanner;

public class ArrayFunctions {
	//  public static void printarray(int a[],int n) {
    //    for(int i=0; i<n; i++) {
    //    	System.out.print(a[i]+" ");
    //    }
//	}
 //   public static void main(String[] args) {
 //      Scanner sc = new Scanner(System.in);
       
  //     int n= sc.nextInt();
 //      int arr[]=new int[n];
 //      for(int i=0; i<n; i++) {
 //   	   arr[i]=sc.nextInt();
  //     }
   //    printarray(arr,n);
   // }
	
//.................................................................................................................................................................	
	
//	public static int[] incArrayValue(int a[],int n) {
//		for(int i=0; i<n; i++) {
//			a[i]=a[i]+1;
//		}
//		return a;
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0; i<n; i++) {
//			arr[i]=sc.nextInt();
//		}
//		arr=incArrayValue(arr,n);
//	}
	
//.................................................................................................................................................................
	public static int [] pairOfK(int arr[], int n) {
		Scanner sc =new Scanner(System.in);
		int k=sc.nextInt();
		boolean isPresent=false;
		for(int i=0; i<n; i++) {
			int x=k-arr[i];
			for(int j=0; j<n; j++) {
				if((arr[j]==x) && (j!=i)) {
					isPresent=true;
					System.out.println("the numbers are:"+arr[i]+","+arr[j]);
					break;
				}
			
	      	}
			if(isPresent==true) {
				break;
			}
		
		}
		if(isPresent!=true) {
			System.out.println("pair is not present");
			
		}
		return arr;	
	}

		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		 arr=pairOfK(arr, n);
	}
	
	
	
	
	
	
		
}
