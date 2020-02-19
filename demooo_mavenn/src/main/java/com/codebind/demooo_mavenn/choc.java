package com.codebind.demooo_mavenn;

public class choc extends Newyeargift{
 public choc(String cname,int cqty) {
    super(cname,cqty);
}
@Override
void wrap() {
	System.out.println(this.getGName()+" is gift wrapped!");
	}
}
