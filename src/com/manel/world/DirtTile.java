package com.manel.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.manel.main.Game;

public class DirtTile implements Tile{
	
	private static BufferedImage TILE_DIRT = Game.spritesheet.getSprite(96, 0, 16, 16);
	private int x,y;
	
	public DirtTile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(this.TILE_DIRT, this.x - Camera.x, this.y - Camera.y, null);
	}

}
