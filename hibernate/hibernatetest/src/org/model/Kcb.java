package org.model;

/**
 * Kcb entity. @author MyEclipse Persistence Tools
 */

public class Kcb implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -292640124798548665L;
	private String kch;
	private String kcm;
	private Integer xf;
	private Integer xs;

	// Constructors

	/** default constructor */
	public Kcb() {
	}

	/** minimal constructor */
	public Kcb(String kch) {
		this.kch = kch;
	}

	/** full constructor */
	public Kcb(String kch, String kcm, Integer xf, Integer xs) {
		this.kch = kch;
		this.kcm = kcm;
		this.xf = xf;
		this.xs = xs;
	}

	// Property accessors

	public String getKch() {
		return this.kch;
	}

	public void setKch(String kch) {
		this.kch = kch;
	}

	public String getKcm() {
		return this.kcm;
	}

	public void setKcm(String kcm) {
		this.kcm = kcm;
	}

	public Integer getXf() {
		return this.xf;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

	public Integer getXs() {
		return this.xs;
	}

	public void setXs(Integer xs) {
		this.xs = xs;
	}

}