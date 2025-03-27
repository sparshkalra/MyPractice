package com.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Hello, CompletableFuture!";
        });

        future.thenAccept(result -> System.out.println(result));

        // Ensuring main thread doesn't exit before async operation completes
        future.join();

        //Used when the task does not return a result.

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            System.out.println("Running async task");
        });
        future.join();

        //Used when you want to process and transform the result.


        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Hello")
        	    .thenApply(result -> result + " World");
        	System.out.println(future.join()); // Output: Hello World
        	
        	CompletableFuture<String> future4 = CompletableFuture.supplyAsync(() -> "Hello");
        	CompletableFuture<String> future5 = CompletableFuture.supplyAsync(() -> "World");

        	CompletableFuture<String> combined = future4.thenCombine(future5, (f1, f2) -> f1 + " " + f2);

        	System.out.println(combined.join()); 
	}

	
	/*
	 * 
	 * ❌ Limitations of Future:
Cannot Manually Complete a Future: The result is set only by the computation, not manually.

Blocking get(): Calling get() blocks the thread until the result is available.

No Exception Handling: No built-in way to handle exceptions.
No Chaining: Cannot combine multiple futures easily. (thenApply
)

Adapter Pattern is used to make incompatible interfaces work together.

Bridge Pattern is used to decouple abstraction from its implementation so they can evolve independently.


	 */
}
