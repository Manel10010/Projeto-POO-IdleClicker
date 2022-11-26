package com.manel.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.manel.main.Game;

public class SkyTile implements Tile{
	protected static BufferedImage TILE_SKY = Game.spritesheet.getSprite(48, 0, 16, 16);
	private int x,y;
	
	public SkyTile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(this.TILE_SKY, this.x - Camera.x, this.y - Camera.y, null);
	}
}

