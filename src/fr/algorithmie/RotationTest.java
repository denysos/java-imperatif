package fr.algorithmie;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotationTest {

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	void testRotation0elements() {
		int[] tableauATraiter = {};
		int[] tableauFinal = {};
		Rotation rotation = new Rotation();
		assertArrayEquals(tableauFinal, rotation.rotation(tableauATraiter));
	}

	@Test
	void testRotation1elements() {
		int[] tableauATraiter = { 1 };
		int[] tableauFinal = { 1 };
		Rotation rotation = new Rotation();
		assertArrayEquals(tableauFinal, rotation.rotation(tableauATraiter));
	}

	@Test
	void testRotation2elements() {
		int[] tableauATraiter = { 1, 2 };
		int[] tableauFinal = { 2, 1 };
		Rotation rotation = new Rotation();
		assertArrayEquals(tableauFinal, rotation.rotation(tableauATraiter));
	}

	@Test
	void testRotation3elements() {
		int[] tableauATraiter = { 1, 2, 3 };
		int[] tableauFinal = { 3, 1, 2 };
		Rotation rotation = new Rotation();
		assertArrayEquals(tableauFinal, rotation.rotation(tableauATraiter));
	}
}
