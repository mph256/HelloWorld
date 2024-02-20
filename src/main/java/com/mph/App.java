package com.mph;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

    	if(args.length > 0)
    		Arrays.asList(args).forEach(arg -> System.out.println("Hello " + arg + "!"));
    	else
    		System.out.println("Hello World!");

    }

}