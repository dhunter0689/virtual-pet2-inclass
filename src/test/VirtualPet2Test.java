package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VirtualPet2Test {
	VirtualPet2 underTest = new VirtualPet2();

	@Test
	public void hungerShouldBe0AtStart() {

		// Act
		int result = underTest.getHunger();

		// Assert
		assertEquals(0, result);
	}

	@Test
	public void thirstShouldBe0AtStart() {

		// Act
		int result = underTest.getThirst();

		// Assert
		assertEquals(0, result);
	}

	@Test
	public void boredomShouldBe0AtStart() {

		// Act
		int result = underTest.getBoredom();

		// Assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldDecreaseBy1AfterEat() {
		// Act
		int beforeEat = underTest.getHunger();
		underTest.eat();
		int result = underTest.getHunger();

		// Assert
		assertEquals(beforeEat - 1, result);
	}

	@Test
	public void thirstShouldDecreaseBy1AfterDrink() {
		// Act
		int beforeDrink = underTest.getThirst();
		underTest.drink();
		int result = underTest.getThirst();

		// Assert
		assertEquals(beforeDrink - 1, result);
	}

	@Test
	public void boredomShouldDecreaseBy1AfterPlay() {
		// Act
		int beforePlay = underTest.getBoredom();
		underTest.play();
		int result = underTest.getBoredom();
		// Assert
		assertEquals(beforePlay - 1, result);
	}

	@Test
	public void hygieneShouldDecreaseBy1AfterPlay() {
		// Act
		int beforePlay = underTest.getHygiene();
		underTest.play();
		int result = underTest.getHygiene();

		// Assert
		assertEquals(beforePlay - 1, result);
	}

	@Test
	public void healthIncreaseby1AfterEat() {
		// Act
		int afterEat = underTest.getHealth();
		underTest.eat();
		int result = underTest.getHealth();

		// Assert
		assertEquals(afterEat + 1, result);
	}

	@Test
	public void energyDecreasesBy2AfterPlay() {
		// Act
		int afterPlay = underTest.getEnergy();
		underTest.play();
		int result = underTest.getEnergy();
		//assert
		assertEquals(afterPlay -2, result);
		
	}
}
