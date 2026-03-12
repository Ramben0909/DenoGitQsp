package SWE;

import java.util.HashMap;
import java.util.Scanner;

public class Practice5 {
	
	
	public static int[] arr = {2,3,4,5,0,6,7,8,2,0};
	 public static void firstprob() {
    	 int n = arr.length/2;
    	 for(int i=n-1;i>=0;i--) {
    		 System.out.print(arr[i]+" ");
    	 }
    	 for(int i=n;i<arr.length;i++) {
    		 System.out.print(arr[i]+" ");
    	 }
	 }
 
	 public static void sndporb() {
		 for(int i=0;i<arr.length;i+=2){
			 System.out.println(arr[i]);
		 }
	 }
	 
	 public static void av() {
		 int val =0;
		 for(int i=0;i<arr.length;i++) {
			 val+=(arr[i]);
		 }
		 val/=arr.length;
		 System.out.println(val);
	 }
	 
	 public static void countodeven() {
		 int odd=0;
		 int even =0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 even++;
			 }else {
				 odd++;
			 }
		 }
		 
		 System.out.println("Odd elements are: "+odd);
		 System.out.println("Even elements are: "+even);
	 }
	 public static void prod() {
		 long num=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 num*=arr[i];
		 }
		 System.out.println("Product is :"+num);
		 
	 }
	 public static void maxel() {
		 int num = Integer.MIN_VALUE;
		 for(int a:arr) {
			 if(a>num) num=a;
		 }
		 System.out.println("Max value is: "+num);
	 }
	 
	 public static void nextel() {
		 int num = Integer.MAX_VALUE;
		 int next = num+1;
		 for(int a:arr) {
			 if(a<num) {
				 next=num;
				 num=a;
			 }else if(a<next) {
				 next=a;
			 }
		 }
		 System.out.println("2nd Min value is: "+next);
	 }
	 
	 
	 public static void shift() {
		 int i=0;
		 for(int j=0;j<arr.length;j++){
			 if(arr[j] >0) {
				 arr[i]=arr[j];
				 i++;
			 }
		 }
		 while(i<arr.length) {
			 arr[i]=0;
		 }
		 for(int a:arr) {
			 System.out.print(a);
		 }
	 }
	 
	 public static void swap(int[] arr,int i,int j) {
		 arr[i]=arr[i]+arr[j];
		 arr[j]=arr[i]-arr[j];
		 arr[i]=arr[i]-arr[j];
	 }
	 public static void sort(int[] arr) {
		 for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]>arr[i+1]) {
				 swap(arr,i,i+1);
				 i=-1;
			 }
		 }
		 for(int a :arr) {
			 System.out.print(a);
		 }
	 }
	 
	 public static void freq() {
		 int arr[]= {1,4,8,4,6,7,2,4,9};
		 HashMap<Integer,Integer> table = new HashMap<>();
	 }
	 
     public static void main(String[] args) {
//    	 Scanner sc = new Scanner(System.in);
//    	 System.out.println("Enter the size");
//    	 int n = sc.nextInt();
//    	 int[] arr = new int[n];
//    	 for(int i=0;i<n;i++) {
//    		 System.out.println("Enter the number");
//    		 arr[i]=sc.nextInt();
//    	 }
//    	sort(arr);
     	    	 
     }
}
