// Write a program to find second min second max elements in array


import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the elements");
			int a=Integer.parseInt(br.readLine());
			int arr[]=new int[a];
			System.out.println("Enter the array elements");
			for(int i=0;i<arr.length;i++){
				arr[i]=Integer.parseInt(br.readLine());
			}
			int n=0;
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					n=arr[i];
					arr[i]=arr[j];
					arr[j]=n;
				}
			}
			System.out.println("second max="+arr[1]);
			System.out.println("second min="+arr[a-2]);
		
	}
}
	


