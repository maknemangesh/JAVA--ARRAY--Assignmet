// Write a program to find min and max elements in array


import java.io.*;
class Demo{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of elements");
		int a=Integer.parseInt(br.readLine());
		int arr[]=new int[a];
		int min=0;int max=0;
		System.out.println("enter the elements in the array");
			for(int i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(br.readLine());
			}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("max Element is "+max);
		for(int i=0;i<arr.length;i++){
			if(max>arr[i]){
				max=arr[i];
				min=arr[i];
			}
		}
		System.out.println("min element id=s "+min);
	}
}
