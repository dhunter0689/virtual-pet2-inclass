package test;

public class VirtualPet2 {

	private int hunger = 0;
	private int thirst = 0;
	private int boredom = 0;
	private int hygiene = 0;
	private int health = 0;
	private int energy = 0;

	public int getHunger() {
		return this.hunger;
	}

	public int getThirst() {
		return this.thirst;
	}

	public int getBoredom() {
		return this.boredom;
	}

	public int getHygiene() {
		return this.hygiene;
	}

	public int getHealth() {
		return this.health;
	}

	public int getEnergy() {

		return this.energy;
	}

	public void eat() {
		this.hunger--;
		this.health++;
	}

	public void drink() {
		this.thirst--;

	}

	public void play() {
		this.boredom--;
		this.hygiene--;
		this.energy = -2;

	}

}
