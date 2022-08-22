package com.custom.annotation;


import java.io.*;

// Sample for marker annotation:
// Custom annotation declaration
@interface books_data
{
	// Multiple variable declaration
	String book_name();
	int book_price();
	String author();
}

// Using the custom Annotation
@books_data(book_name = "Effective Java", book_price = 30,
			author = "Joshua Bloch")

// Class 1
class book_store {
}

// Class 2
class Books2 {

	// Main driver method
	public static void main(String[] args)
	{
		// Print statement
		System.out.println("how to use the annotations");
	}
}
