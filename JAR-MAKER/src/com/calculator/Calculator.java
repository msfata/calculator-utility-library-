package com.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator<T> {
	private static BigDecimal bd, bd1;

	public static void main(String[] args) {
		var x = DEVISSION(20.1, 5.1);
		System.out.println(x);

	}

	operation operation;

	public static <T> BigDecimal calculate(operation op, T a, T b) {

		String s = String.valueOf(a);
		bd = new BigDecimal(s);

		String s1 = String.valueOf(b);
		bd1 = new BigDecimal(s1);

		switch (op) {
		case ADDATION:
			return bd.add(bd1);
		case SUBTRACTION:
			return bd.subtract(bd1);
		case MULTIPLICATION:
			return bd.multiply(bd1);
		case DEVISSION:
			return bd.divide(bd1, 2, RoundingMode.HALF_UP);
		default:
			return null;
		}
	}

	public static <T> BigDecimal ADDATION(T a, T b) {

		String s = String.valueOf(a);
		bd = new BigDecimal(s);

		String s1 = String.valueOf(b);
		bd1 = new BigDecimal(s1);

		return bd.add(bd1);

	}

	public static <T> BigDecimal SUBTRACTION(T a, T b) {

		String s = String.valueOf(a);
		bd = new BigDecimal(s);

		String s1 = String.valueOf(b);
		bd1 = new BigDecimal(s1);

		return bd.subtract(bd1);

	}

	public static <T> BigDecimal MULTIPLICATION(T a, T b) {

		String s = String.valueOf(a);
		bd = new BigDecimal(s);

		String s1 = String.valueOf(b);
		bd1 = new BigDecimal(s1);

		return bd.multiply(bd1);

	}

	public static <T> BigDecimal DEVISSION(T a, T b) {

		String s = String.valueOf(a);
		bd = new BigDecimal(s);

		String s1 = String.valueOf(b);
		bd1 = new BigDecimal(s1);

		return bd.divide(bd1, 2, RoundingMode.HALF_UP);

	}

}
