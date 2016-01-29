package com.github.kunalherkal.smallexamples.meaningful;

final class BadStudent {
	private String rn;
	private String fn;
	private String ln;
	
	public BadStudent(String rn, String fn, String ln) {
		super();
		this.rn = rn;
		this.fn = fn;
		this.ln = ln;
	}

	public String getRn() {
		return rn;
	}

	public void setRn(String rn) {
		this.rn = rn;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	@Override
	public String toString() {
		return "GoodStudent [rn=" + rn + ", fn=" + fn + ", ln=" + ln + "]";
	}

}
