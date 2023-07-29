package com.nt.beans;

import java.util.Date;

public class A {
	public Date getSysDATE() {
		return new Date();
	}
	
	public void m1() {

		System.out.println("dev m1::12345");
		System.out.println("abc.123");

	}

	public void m2() {
		
		System.out.println("dev m1::12345");
		System.out.println("abc.123");
		
		
	}

	public void m4() {
		System.out.println("m4");
	}


	public void m3() {
		
		System.out.println("dev m1::12345");
		System.out.println("abc.123");
		System.out.println("A.m3()");
		
		
	}

}
