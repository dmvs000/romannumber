package com.susheelkb.romannumeral.domain;

public class RomanNumber {
	private int input;
	private String output;

	public RomanNumber() {

	}

	public RomanNumber(int input, String output) {
		this.input = input;
		this.output = output;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		RomanNumber that = (RomanNumber) obj;
		return (input == that.input) && output.equals(that.output);
	}

}
