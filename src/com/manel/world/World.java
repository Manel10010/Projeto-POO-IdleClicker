package com.manel.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.manel.entities.Enemy;
import com.manel.entities.Entity;
import com.manel.entities.Lifepack;
import com.manel.main.Game;

public class World {
	
	public static Tile[] tiles;
	public static int WIDTH, HEIGHT;
	public static final int TILE_SIZE = 16;
	
	public World(String path) {
		try {
			BufferedImage map = ImageIO.read(getClass().getResource(path));
			int[] pixels = new int[map.getWidth() * map.getHeight()];
			WIDTH = map.getWidth();
			HEIGHT = map.getHeight();
			tiles = new Tile[map.getWidth() * map.getHeight()];
			map.getRGB(0, 0, map.getWidth(),map.getHeight(), pixels, 0, map.getWidth());
			for (int xx = 0; xx < map.getWidth(); xx++) {
				for (int yy = 0;  yy < map.getHeight(); yy++) {
					int pixelAtual = pixels[xx + (yy*WIDTH)];
					
					if (pixelAtual == 0xFF4CFF00) {
						//Grama
						System.out.println("TERRA");
						tiles[xx + (yy* WIDTH)] = new GrassTile(xx*16,yy*16,Tile.TILE_GRASS);
					} else if (pixelAtual == 0xFF7F3300) {
						//Terra
						tiles[xx + (yy* WIDTH)] = new DirtTile(xx*16,yy*16,Tile.TILE_DIRT);
					}else if (pixelAtual == 0xFF0094FF) {
						//Céu
						tiles[xx + (yy* WIDTH)] = new SkyTile(xx*16,yy*16,Tile.TILE_SKY);
					}else if (pixelAtual == 0xFFFFFFFF) {
						//Núvem
						tiles[xx + (yy* WIDTH)] = new CloudTile(xx*16,yy*16,Tile.TILE_CLOUD);
					} else if (pixelAtual == 0xFFFFD800) {
						//Player
						System.out.println("PLAYER");
						Game.player.setX(xx*16);
						Game.player.setY(yy*13+8);
						tiles[xx + (yy* WIDTH)] = new SkyTile(xx*16,yy*16,Tile.TILE_SKY);
					}else if (pixelAtual == 0xFFFF0000) {
						//Enemy
						Enemy en = new Enemy(xx*16,yy*16-16,32,32, Entity.ENEMY_EN, "Street Dog");
						Game.entities.add(en);
						Game.enemies.add(en);
						tiles[xx + (yy* WIDTH)] = new SkyTile(xx*16,yy*16,Tile.TILE_SKY);
					}else if (pixelAtual == 0xFFFF00DC){
						//Life Pack
						Lifepack pack = new Lifepack(xx*16,yy*16,16,16,Entity.LIFE_PACK_EN);
						Game.entities.add(pack);
						tiles[xx + (yy* WIDTH)] = new SkyTile(xx*16,yy*16,Tile.TILE_SKY);
					}else {
						//Céu
						tiles[xx + (yy* WIDTH)] = new SkyTile(xx*16,yy*16,Tile.TILE_SKY);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isFree(int xnext, int ynext) {
		int x1 = xnext / TILE_SIZE;
		int y1 = ynext / TILE_SIZE;
		
		int x2 = (xnext+TILE_SIZE-1) / TILE_SIZE;
		int y2 = ynext / TILE_SIZE;
		
		int x3 = xnext / TILE_SIZE;
		int y3 = (ynext+TILE_SIZE-1) / TILE_SIZE;
		
		int x4 = (xnext+TILE_SIZE-1) / TILE_SIZE;
		int y4 = (ynext+TILE_SIZE-1) / TILE_SIZE;
		
		return !(tiles[x1+(y1*World.WIDTH)] instanceof GrassTile ||
				tiles[x2+(y2*World.WIDTH)] instanceof GrassTile ||
				tiles[x3+(y3*World.WIDTH)] instanceof GrassTile ||
				tiles[x4+(y4*World.WIDTH)] instanceof GrassTile);
	}
	
	public void render(Graphics g) {
		for (int xx = 0; xx < WIDTH; xx++) {
			for (int yy = 0; yy < HEIGHT; yy++) {
				Tile tile = tiles[xx + (yy*WIDTH)];
				tile.render(g);
			}
		}
	}
	
}
