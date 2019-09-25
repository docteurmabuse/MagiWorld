package com.tizzone.magiworld.player;

public abstract class Player {
	private int level;
	private int constitution;
	private int strength;
	private int dexterity;
	private int intelligence;

	public Player(final int level, final int constitution, final int strength, final int dexterity, final int intelligence) {
		this.level = level;
		this.constitution = constitution;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}

	public int getLevel() {
		return level;
	}

	public int getConstitution() {
		return constitution;
	}

	public int getStrength() {
		return strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setLevel(final int level) {
		this.level = level;
	}

	public void setConstitution(final int constitution) {
		this.constitution = constitution;
	}

	public void setStrength(final int strength) {
		this.strength = strength;
	}

	public void setDexterity(final int dexterity) {
		this.dexterity = dexterity;
	}

	public void setIntelligence(final int intelligence) {
		this.intelligence = intelligence;
	}

	public void  basicAttack(int hit){

	}

	public void  specialAttack(int hit){

	}

}
