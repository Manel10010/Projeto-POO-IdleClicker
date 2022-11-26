package com.manel.entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.manel.main.Game;
import com.manel.world.Camera;

public abstract class Entity {
	public static BufferedImage ENEMY_EN = Game.enemiessheet.getSprite(0, 0, 32, 32);
	public static BufferedImage LIFE_PACK_EN = Game.spritesheet.getSprite(8*16, 0, 16, 16);
	
	protected double x;
	protected double y;
	protected int width;
	protected int height;
	
	private BufferedImage sprite;
	
	protected int maskx, masky, maskw, maskh;
	
	public Entity(int x, int y, int width, int height, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
		
		this.maskx = 0;
		this.masky = 0;
		this.maskw = width;
		this.maskh = height;
	}
	//Builder
	public static Enemy createEnemyDog(int xx, int yy) {
		Enemy en = new Enemy(xx*16,yy*16-16,32,32, Entity.ENEMY_EN, "Street Dog");
		return en;
	}
	
	public static Player createPlayer(int x, int y) {
		Player player = new Player(x,y,64,64,Game.spritesheet.getSprite(0,64,64,64));
		return player;
	}
	
	//Métodos especiais
	
	public void setSprite(BufferedImage sprite) {
		this.sprite = sprite;
	}
	
	public void setMask(int maskx, int masky, int maskw, int maskh) {
		this.maskx = maskx;
		this.masky = masky;
		this.maskw = maskw;
		this.maskh = maskh;
	}
	
	public int getX() {
		return (int)this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return (int)this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
		
	public void tick() {
			
		}
	
	public static boolean isColidding(Entity e1, Entity e2) {
		Rectangle e1Mask = new Rectangle(e1.getX() + e1.maskx, e1.getY() + e1.masky, e1.maskw, e1.maskw);
		Rectangle e2Mask = new Rectangle(e2.getX() + e2.maskx, e2.getY() + e2.masky, e2.maskw, e2.maskw);
		
		return e1Mask.intersects(e2Mask);
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, this.getX() - Camera.x, this.getY() - Camera.y, null);
	}
	
}
