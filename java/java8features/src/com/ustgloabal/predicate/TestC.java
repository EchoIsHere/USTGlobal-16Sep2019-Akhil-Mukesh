package com.ustgloabal.predicate;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i->i*i;
		
		int res = f.apply(4);
		System.out.println(res );
	}

}
