package com.test;

public class Calculator
{
	public int addition(int a,int b)
	{
		return a+b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int substraction(int a,int b)
	{
		if(a>b)
			return a-b;
		else
			return b-a;
	}
	public double division(int a,int b)
	{
		if(a>b)
			return a/b;
		else
			return b/a;
	}
	public int factorial(int n)
	{
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f *= i;
		}
		return f;
	}
	public void additionWithException(int a, int b)
	{
		int c = a/b;
		System.out.println(c);
	}
	public int twoNegetiveNum(int a,int b)
	{
		return a+b;
	}
	public int twoPositiveNumber(int a,int b)
	{
		return a+b;
	}
	}
