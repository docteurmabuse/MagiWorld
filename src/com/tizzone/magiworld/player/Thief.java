package com.tizzone.magiworld.player;

public class Thief extends Player {

	public Thief(final int level, final int constitution, final int strength, final int dexterity, final int intelligence) {
		super(level, constitution, strength, dexterity, intelligence);
	}

	@Override
	public void basicAttack(final int hit) {
		super.basicAttack(hit);
	}

	@Override
	public void specialAttack(final int hit) {
		super.specialAttack(hit);
	}
}
