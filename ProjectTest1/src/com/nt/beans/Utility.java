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

	public void m8() {
<<<<<<< HEAD
		System.out.println("m8() method() in master");
	}
=======
		System.out.println("m8() method()");
	}
	public void m9() {
		System.out.println("Utility.m9()");
	}

>>>>>>> branch 'master' of https://github.com/AamirNit/TechProject.git
}
