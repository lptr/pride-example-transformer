package com.example.transformer;

import com.example.producer.Producer;

public class Transformer {
	public String transform() {
		Producer producer = new Producer();
		return "Hello " + producer.produce() + "!";
	}
}
