package com.codebind.demooo_mavenn;

public abstract class Newyeargift {
	  private String giftname;
	    private int giftqty;
	    public Newyeargift(String name,int qty) {
	    giftname=name;
	    giftqty=qty;
	    }
	    public void setGName(String x) {
	    giftname=x;
	    }
	    public String getGName() {
	    return giftname;
	    }
	    public void setGQty(int y) {
	    giftqty=y;
	    }
	    public int getGQty() {
	    return giftqty;
	    }
	    abstract void wrap();
}
