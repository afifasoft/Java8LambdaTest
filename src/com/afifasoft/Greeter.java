package com.afifasoft;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		greeter.greet(() -> System.out.println("Hello world lambda"));
		System.out.println();
	}
	
	
//	greetingFunction = () -> System.out.println("Hello world!");

//	greet(greetingFunction);
	
		
//	public void greet(greetingFunction) {
//		greetingFunction();
//	}
	
	
	doubleNumberFunction = (int a) -> {
		return a * 2;
	};
	
	doubleNumberFunctionShort = (int a) -> return a * 2;
	
	addFunction = (int a, int b) -> a + b;
	
	safeDivideFunction = (int a, int b) -> {
		if(b == 0) return 0;
		return a / b;
	};
	
	
	stringLengthCountFunction = (String s) -> s.length();
	
	
}
