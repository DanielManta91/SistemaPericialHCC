package com.sample;

public class Estados {
	String CP;
	int PST,nrnodule,PS,flag;
	double noduleTam;
	boolean bilirubina,PP,AD,PI,N1,M1;
	public Estados(String cP, int pST, int nrnodule, double noduleTam, boolean bilirunina, boolean pP,boolean AD,int PS) {
		super();
		CP = cP;
		PST = pST;
		this.AD=AD;
		this.nrnodule = nrnodule;
		this.noduleTam = noduleTam;
		this.bilirubina = bilirunina;
		this.PS=PS;
		PP = pP;
	}
	public Estados(String cP, int pST) {
		super();
		CP = cP;
		PST = pST;
		this.flag=0;
	}
	
	public Estados(String cP, int pST, boolean pI, boolean n1, boolean m1) {
		super();
		CP = cP;
		PST = pST;
		PI = pI;
		N1 = n1;
		M1 = m1;
		this.flag=0;
	}
	
	
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
	public int getPST() {
		return PST;
	}
	public void setPST(int pST) {
		PST = pST;
	}
	public int getnrNodule() {
		return nrnodule;
	}
	public void setnrNodule(int nodule) {
		this.nrnodule = nodule;
	}
	public double getNoduleTam() {
		return noduleTam;
	}
	public void setNoduleTam(double noduleTam) {
		this.noduleTam = noduleTam;
	}
	public boolean isBilirubina() {
		return bilirubina;
	}
	public void setBilirubina(boolean bilirubina) {
		this.bilirubina = bilirubina;
	}
	public boolean isPP() {
		return PP;
	}
	public void setPP(boolean pP) {
		PP = pP;
	}
	public boolean isAD() {
		return AD;
	}
	public void setAD(boolean aD) {
		AD = aD;
	}
	public int getPS() {
		return PS;
	}
	public void setPS(int pS) {
		PS = pS;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public boolean isPI() {
		return PI;
	}
	public void setPI(boolean pI) {
		PI = pI;
	}
	public boolean isN1() {
		return N1;
	}
	public void setN1(boolean n1) {
		N1 = n1;
	}
	public boolean isM1() {
		return M1;
	}
	public void setM1(boolean m1) {
		M1 = m1;
	}
	


}
