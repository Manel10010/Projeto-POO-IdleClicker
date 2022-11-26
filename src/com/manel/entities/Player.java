package com.manel.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.manel.graficos.Spritesheet;
import com.manel.graficos.UI;
import com.manel.main.Game;
import com.manel.world.Camera;
import com.manel.world.World;

public class Player extends Entity {

	public static int qntdMonstrosMortos = 0;
	public static int stage = 1;
	
	public static int level = 1;
	public static double currentExp = 0;
	public static int nextLevelExp = 150;
	
	public boolean right, up, left, down;
	public int right_dir = 0;
	public int dir = right_dir;
	public double speed = 1.8;

	public static boolean moved = true;
	public boolean idle = true;
	private boolean dash = false;

	public static double DMG = 10;

	public BufferedImage[] runninPlayer;
	public BufferedImage[] idleAtacking;
	public BufferedImage[] clickAtacking;
	
	public boolean mudou = false;
	
	private int frames = 0, maxFrames = 10, index = 0,indexRun = 0,indexIdleAtack = 0,indexClickAtack = 0, maxIndex;
	public BufferedImage dashSprite = new Spritesheet("/Knight_1/Dash.png").getSprite(0, 0, 64, 64);

	public static double ENERGY = 100, maxENERGY = 100;

	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		runninPlayer = new BufferedImage[7];
		for (int i = 0; i < runninPlayer.length; i++) {
			runninPlayer[i] = Game.playersheet.getSprite(0 + (i * 64), 0, 64, 64);
		}
		maxIndex = runninPlayer.length - 1;

		idleAtacking = new BufferedImage[7];
		for (int i = 0; i < idleAtacking.length; i++) {
			idleAtacking[i] = Game.playersheet.getSprite(0 + (i * 64), 128, 64, 64);
		}

		clickAtacking = new BufferedImage[7];
		for (int i = 0; i < clickAtacking.length; i++) {
			clickAtacking[i] = Game.playersheet.getSprite(0 + (i * 64), 192, 64, 64);
		}
		
		maxIndex = runninPlayer.length;
	}

	public void tick() {
		if (this.currentExp >= this.nextLevelExp) {
			this.currentExp -= this.nextLevelExp;
			this.level++;
			this.nextLevelExp = 100 + (this.level*50);
			this.DMG = 5+(level*5);
			System.out.println("Level UP!");
		}
		if (checkColiddingEnemy()) {
			if (idle == true) {
				maxIndex = idleAtacking.length-1;
			} else {
				maxIndex = clickAtacking.length-1;
			}
		} else {
			if (idle == true && moved == true) {
				maxIndex = runninPlayer.length - 1;
			} else {
				if (Game.enemies.size() > 0) {
					maxIndex = clickAtacking.length-1;
					//index = 0;
					this.setX(Game.enemies.get(0).getX() - 32);
					dash = true;
				}
			}
		}
		
		if (moved == true) {
			x += speed;
		}
		if (moved || idle) {
			frames++;
			if (frames > maxFrames) {
				frames = 0;
				index++;
			}
			if (index > maxIndex) {
				index = 0;
			}
		}
		Camera.x = Camera.clamp(this.getX() - (Game.WIDTH / 2), 0, World.WIDTH * 16 - Game.WIDTH);
		
		//Finalizando fase e reniciando outra
		if (Game.enemies.size() == 0) {
			Game.deadEntities.clear();
			Game.image = new BufferedImage(160 * Game.scale, 120 * Game.scale, BufferedImage.TYPE_INT_ARGB);
			this.setX(0);
			this.setY(0);
			this.setStage();
			Game.world = new World("/world.png");
		}
	}

	public boolean checkColiddingEnemy() {
		for (int i = 0; i < Game.enemies.size(); i++) {
			Entity atual = Game.enemies.get(i);
			if (atual instanceof Enemy) {
				if (Entity.isColidding(this, atual)) {
					return true;
				}
			}
		}
		return false;
	}

	public void render(Graphics g) {
		if (checkColiddingEnemy()) {
			if (idle == true) {
				//maxIndex = idleAtacking.length;
				g.drawImage(idleAtacking[index], (int) this.getX() - Camera.x, (int) this.getY() - Camera.y, null);
			} else {
				//maxIndex = clickAtacking.length;
				g.drawImage(clickAtacking[index], (int) this.getX() - Camera.x, (int) this.getY() - Camera.y, null);
			}
		} else {
			if (idle == true && moved == true) {
				//maxIndex = runninPlayer.length;
				g.drawImage(runninPlayer[index], (int) this.getX() - Camera.x, (int) this.getY() - Camera.y, null);
			} else {
				if (dash == true) {
					//index = 0;
					//maxIndex = clickAtacking.length;
					g.drawImage(dashSprite, (int) this.getX() - Camera.x, (int) this.getY() - Camera.y, null);
					dash = false;
				}
			}
		}
	}
	
	public void setStage() {
		this.stage++;
	}
	
	public static int getStage() {
		return stage;
	}
	
	public static double getCurrentExp() {
		return currentExp;
	}
	
	public static int getNextLevelExp() {
		return nextLevelExp;
	}
}