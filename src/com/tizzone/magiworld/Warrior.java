package com.tizzone.magiworld;

public class Warrior extends Character{


	public Warrior(final int level, final int constitution, final int strength, final int dexterity, final int intelligence) {
		super(level, constitution, strength, dexterity, intelligence);
	}

	@Override
	public void basicAttack(final int hit) {
		super.basicAttack(hit);
	}
	@Override
	public void specialAttack( final int hit){
		super.specialAttack(hit);
	}

}