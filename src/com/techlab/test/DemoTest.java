package com.techlab.test;

import com.techlab.model.Car;
import com.techlab.model.IMovable;

public class DemoTest {

	public static void main(String[] args) {
		IMovable m = new Car();
		m.move();
	}

}
