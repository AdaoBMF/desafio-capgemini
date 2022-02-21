package com.capgemini.questao1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.questao1.Stairway;

class StairwayTest {

	int n = 0;

	@Test
	void stairwayTest() {
		Stairway.stairway(n);
		assertEquals(n, Stairway.output.length());
	}
}
