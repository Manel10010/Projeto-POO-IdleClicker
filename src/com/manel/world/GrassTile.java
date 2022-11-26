package com.manel.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.manel.main.Game;

public class GrassTile implements Tile{
	protected static BufferedImage TILE_GRASS = Game.spritesheet.getSprite(80, 0, 16, 16);
	private int x,y;
	
	public GrassTile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(this.TILE_GRASS, this.x - Camera.x, this.y - Camera.y, null);
	}
}
