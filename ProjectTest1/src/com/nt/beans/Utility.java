package com.nt.beans;

import java.util.Date;

public class Utility {
	public Date getSysDate() {
		return new Date();
	}
	public void m1() {
/*<<<<<<< HEAD
		System.out.println("Utility m1() method....abcd");
=======*/
		System.out.println("Utility m1() method::1234");
		System.out.println("abc123");
//>>>>>>> branch 'master' of https://github.com/AamirNit/TechProject.git
	}
	public void m2() {
		System.out.println("Utility.m2()");
	}
	public void m3() {
		System.out.println("Utility.m3()");
	}
	public void m4() {
		System.out.println("Utility.m4()");
	}
	public void m5() {
		System.out.println("Utility.m5()");
	}
}
