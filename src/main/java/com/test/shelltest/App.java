package com.test.shelltest;

import fit.ColumnFixture;

public class App extends ColumnFixture
{
	int num1;
	int num2;
	int add;
	public int result()
	{
		add = num1+num2;
		return add;
	}
    public static void main( String[] args )
    {
        System.out.print("");
    }
}
