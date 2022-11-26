package com.manel.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.manel.main.Game;

public class Tile {
	public static BufferedImage TILE_GRASS = Game.spritesheet.getSprite(80, 0, 16, 16);
	public static BufferedImage TILE_DIRT = Game.spritesheet.getSprite(96, 0, 16, 16);
	public static BufferedImage TILE_SKY = Game.spritesheet.getSprite(48, 0, 16, 16);
	public static BufferedImage TILE_CLOUD = Game.spritesheet.getSprite(64, 0, 16, 16);
	
	private BufferedImage sprite;
	private int x,y;
	
	public Tile (int x, int y, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}
	
	public void render (Graphics g) {
		g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
	}
}
