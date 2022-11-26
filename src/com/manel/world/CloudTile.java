package com.manel.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.manel.main.Game;

public class CloudTile implements Tile{
	protected static BufferedImage TILE_CLOUD = Game.spritesheet.getSprite(64, 0, 16, 16);
	private int x,y;
	
	public CloudTile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(this.TILE_CLOUD, this.x - Camera.x, this.y - Camera.y, null);
	}
}
