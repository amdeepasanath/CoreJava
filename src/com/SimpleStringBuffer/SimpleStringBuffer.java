package com.SimpleStringBuffer;

/* SimpleStringBuffer.java
 - Copyright (c) 2014, HerongYang.com, All Rights Reserved.
 */
public class SimpleStringBuffer implements SimpleStringBufferable {
	private char[] buffer;
	private int capacity;
	private int length;

	public SimpleStringBuffer() {
		this(16);
	}

	public SimpleStringBuffer(int l) {
		capacity = l;
		buffer = new char[capacity];
		length = 0;
	}

	public SimpleStringBuffer append(String str) {
		String s = str;
		if (s == null)
			s = "null";
		if (length + s.length() > capacity) {
			int l = Math.max(length + s.length(), 2 * capacity);
			char[] b = new char[l];
			for (int i = 0; i < length; i++) {
				b[i] = buffer[i];
			}
			buffer = b;
			capacity = l;
		}
		for (int i = 0; i < s.length(); i++) {
			buffer[length + i] = s.charAt(i);
		}
		length += s.length();
		return this;
	}

	public String toString() {
		return new String(buffer, 0, length);
	}

	public static void main(String args[]) {
		SimpleStringBuffer strapp = new SimpleStringBuffer();
		strapp.append("Deepa");
		// strapp.append("Deepa");
		// System.out.println(strapp.append("Deepa"));
		System.out.println(strapp.append(null));
	}
}
