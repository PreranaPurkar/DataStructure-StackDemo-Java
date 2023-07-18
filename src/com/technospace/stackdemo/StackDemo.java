package com.technospace.stackdemo;

import java.util.Scanner;

public class StackDemo {

	int[] stack = new int[5];
	int top = -1;
	Scanner scanner=new Scanner(System.in);
	//Push function used for insert the element in stack
	
	public void push(){
		if(top==stack.length-1)
		{
			System.err.println("Stack is Overflow");
		}
		else{
			System.err.println("Enter the number to the stack");
			int n=scanner.nextInt();
			top++;
			stack[top]=n;
		}
	}
	//Display function used for Display the elements in stack
	public void display(){
		for(int i=top;i>=0;i--){
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
		StackDemo stackDemo = new StackDemo();
		stackDemo.push();
		stackDemo.push();
		stackDemo.push();
		stackDemo.push();
		stackDemo.push();
		stackDemo.display();

	}

}
