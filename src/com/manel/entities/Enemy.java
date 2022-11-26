package com.manel.entities;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.manel.graficos.Spritesheet;
import com.manel.main.Game;

public class Enemy extends Entity{
	
	public String nome;

	public double enemyHP, currentHP;
	private double speed = 0.2;
	private int maskx = 8, masky = 8, maskw = 8, maskh = 10; //Mascaras
	private int secs = 0;
	
	private boolean gettingAtacked = false;
	
	public Enemy(int x, int y, int width, int height, BufferedImage sprite, String nome) {
		super(x, y, width, height, sprite);
		
		this.nome = nome;
		this.enemyHP = 100+(10*((Player.getStage()-1)*9.5));
		this.currentHP = 100+(10*((Player.getStage()-1)*9.5));
	}
	
	public void tick() {
		if (isColiddingWithPlayer() == true) {
			Player.moved = false;
			double dano = Player.DMG;
			double danoClick = dano + (dano*0.10);
			if (Game.player.idle == true) {
				if (secs == 0 || secs == 45) {
					this.currentHP -= dano;
					secs = 0;
				}
			} else if (Game.player.idle == false){
				this.currentHP -= danoClick;
				Game.player.idle = true;
				//System.out.println(danoClick);
				}
			secs ++;
			//System.out.println(this.currentHP);
			Game.player.idle = true;
			if (this.currentHP <= 0) {
				Player.qntdMonstrosMortos ++;
				Game.enemies.remove(this);
				Game.entities.remove(this);
				this.setSprite(new Spritesheet("/Enemies/Street_Dog_Dead.png").getSprite(0, 0, 32, 32));
				Game.deadEntities.add(this);
				Player.moved = true;
				this.currentHP = this.enemyHP;
				Player.currentExp += 11 + (0.2*(Player.stage-1));
			}
		}
	}
	
	public boolean isColiddingWithPlayer() {
		Rectangle enemyCurrent = new Rectangle(this.getX() + maskx, this.getY() + masky, maskh, maskw);
		Rectangle player = new Rectangle(Game.player.getX(), Game.player.getY(),64,64);
		
		return enemyCurrent.intersects(player);
	}
	
	public void render(Graphics g) {
		super.render(g);
		//g.setColor(Color.blue);
		//g.fillRect(this.getX() + maskx - Camera.x, this.getY() + masky - Camera.y, maskw, maskh);
	}
}
