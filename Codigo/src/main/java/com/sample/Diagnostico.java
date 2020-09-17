package com.sample;

public class Diagnostico {
	double nodulotam;
	int postech,flag;
	boolean hcc,highend,estavel;
	
	public Diagnostico(double nodulotam, int postec, boolean hcc, boolean highend, boolean estavel) {
		super();
		this.nodulotam = nodulotam;
		this.postech = postec;
		this.hcc = hcc;
		this.highend = highend;
		this.estavel = estavel;
	}
	public Diagnostico(double nodulotam, boolean hcc) {
		super();
		this.nodulotam = nodulotam;
		this.hcc = hcc;
		this.postech=100;
		this.flag = 0;
	}
	
	public Diagnostico(boolean hcc) {
		super();
		this.hcc = hcc;
		this.postech=100;
		this.flag = 0;
	}
	
	public double getNodulotam() {
		return nodulotam;
	}
	public void setNodulotam(double nodulotam) {
		this.nodulotam = nodulotam;
	}
	public int getPostech() {
		return postech;
	}
	public void setPostech(int postec) {
		this.postech = postec;
	}
	public boolean isHcc() {
		return hcc;
	}
	public void setHcc(boolean hcc) {
		this.hcc = hcc;
	}
	public boolean isHighend() {
		return highend;
	}
	public void setHighend(boolean highend) {
		this.highend = highend;
	}
	public boolean isEstavel() {
		return estavel;
	}
	public void setEstavel(boolean estavel) {
		this.estavel = estavel;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}

}