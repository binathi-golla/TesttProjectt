package com.codebind.demooo_mavenn;

public class Sweet extends Newyeargift{
	public Sweet(String sname,int sqty) {
		super(sname,sqty);
		}
		@Override
		void wrap() {
		System.out.println(this.getGName()+" is gift wrapped!");
		}
	
}
