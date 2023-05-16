// Write a program to check if a String contains any digits


import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str=br.readLine();

		char arr[]=new char[str.length()];
		int a=0;
		for(int i=0;i<str.length();i++){
			arr[i]=str.charAt(i);
			if(arr[i]<='9'){
				a=1;
			}
		}
			if(a==1){
				System.out.println("true string contains digit");

			}
			else{
				System.out.println("false");
			}
		}
	}


