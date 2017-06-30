package com.param.chapter13;

public class reverseArray {
	public static void main(String[] args) {
	
	int [] arr = new int[10];
	for(int i =0; i<arr.length; i++){
		arr[i] = i+1;
	}
	
    for(int i =0; i<arr.length; i++){
		System.out.print(arr[i]+"");
	}
    System.out.println("");
	
	for(int i =arr.length-1; i>=0; i--){
		System.out.print(arr[i]+"");
	 
	}
	}
	public static void reverse(int [] array){
		
	}

}

/*
 ex)
 ArrayDemo

int 배열 크기 10, 초기값1~10 할당

<< reverseArrayValue ex)1~10 -> 10~1 >>
return type : void
parameter :  int[ ] array
reverseArrayValue
 
 public static void main(Sting[] args){
 int [] valArr1 = {1,2,3,4,5,6,7,8,9,10};
 // int [] valArr2 = neww int []{1,2,3,4,5,6,7,8,9,10};
 reversearrayValue(reverseArr);
 for(int val : reverseArr){
 System.out.println(val);
 }
  
  }
  	public static void reverse(int [] param){
  	int temp = 0;, front = 0, rear = param.length-1;
  	for(; front<param.length/2; front++,rear--){
  	temp = param[front];
  	front = param[rear];
  	param = temp;
  	}
  }
 */
