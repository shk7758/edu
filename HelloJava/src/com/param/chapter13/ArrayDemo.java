package com.param.chapter13;

public class ArrayDemo {
	int member;
	int[][] dataMatrixArr;
	//static final int FIRST_DIM_SIZE = 2;
	//static final int SECOND_DIM_SIZE = 2;
	public void initMatrixArr(int firstDimSize, int secondDimSize){
		dataMatrixArr = new int [firstDimSize][secondDimSize];
		int incrementValue = 0;
		for(int i=0; i<dataMatrixArr.length; i++){
			for(int j=0; j<dataMatrixArr[i].length; j++){
				dataMatrixArr[i][j] = ++incrementValue;
			}
		}
	}
	public void transformArrSize(){
		dataMatrixArr[3] = new int[]{0,0,0,0,0,0,0,0};
	}
	
	public static void main(String[] args){
		ArrayDemo obj = new ArrayDemo();
		obj.initMatrixArr(4,4);
		System.out.println("31324");
		
		/*int [] valArr1 = {1,2,3,4,5,6,7,8,9,10};
		 int [] valArr2 = new int []{1,2,3,4,5,6,7,8,9,10};
		 reversearrayValue(reverseArr);
		 for(int val : reverseArr){
		 System.out.println(val);
		 }*/
		  
		  }
		  /*	public static void reverse(int [] param){
		  	int temp = 0;, front = 0, rear = param.length-1;
		  	for(; front<param.length/2; front++,rear--){
		  	temp = param[front];
		  	front = param[rear];
		  	param = temp;
		  	}
		  }
*/
}
