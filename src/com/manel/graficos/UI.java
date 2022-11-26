package com.manel.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.manel.entities.Player;
import com.manel.main.Game;

public class UI {
	
	public void render (Graphics g) {
		//Enemies life bar/ Stage
		if (Game.enemies.size() > 0) {
			g.setColor(Color.red);
			g.fillRect(Game.WIDTH/2, 15, 150, 12);
			g.setColor(Color.green);
			g.fillRect(Game.WIDTH/2, 15, (int)((Game.enemies.get(0).currentHP/Game.enemies.get(0).enemyHP)*150), 12);
			g.setColor(Color.white);
			g.setFont(new Font("arial", Font.BOLD,12));
			g.drawString((int)Game.enemies.get(0).currentHP+"/"+(int)Game.enemies.get(0).enemyHP, Game.WIDTH/2+50, 15+10);
			g.drawString(Game.enemies.get(0).nome, Game.WIDTH/2+50-40, 13);
			g.setColor(Color.yellow);
			g.drawString("Stage "+Player.stage, Game.WIDTH/2+50+45, 13);
			
			//Exp Bar
			g.setColor(Color.gray);
			g.fillRect(Game.WIDTH/2, Game.HEIGHT*2-12, 150, 8);
			g.setColor(Color.MAGENTA);
			g.fillRect(Game.WIDTH/2, Game.HEIGHT*2-12, (int)((Player.getCurrentExp()/(int)Player.getNextLevelExp())*150), 8);
			g.setColor(Color.white);
			g.setFont(new Font("arial", Font.BOLD,10));
			g.drawString("Exp: "+(int)Player.getCurrentExp() + "/" + Player.getNextLevelExp(), Game.WIDTH/2+50, Game.HEIGHT*2-12);
		}
	}
}
