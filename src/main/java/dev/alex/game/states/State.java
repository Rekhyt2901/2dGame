package dev.alex.game.states;
import java.awt.Graphics;

import dev.alex.game.Game;

public abstract class State {
	
	protected Game game;
	
	
	public State(Game game) {
		this.game = game;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
}
