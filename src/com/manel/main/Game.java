package com.manel.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

import com.manel.entities.Enemy;
import com.manel.entities.Entity;
import com.manel.entities.Player;
import com.manel.graficos.Spritesheet;
import com.manel.graficos.UI;
import com.manel.world.World;

public class Game extends Canvas implements Runnable,KeyListener,MouseListener{

	private static final long serialVersionUID = 1L;
	private Thread thread;
	private boolean isRunning;
	private static JFrame frame;
	public static final int WIDTH = 320; 
	public static final int HEIGHT = 180;
	public static final int scale = 3;

	public static BufferedImage image;
	
	public static List<Entity> entities;
	public static List<Enemy> enemies;
	public static List<Enemy> deadEntities;
	
	public static Spritesheet spritesheet;
	public static Spritesheet playersheet;
	public static Spritesheet enemiessheet;
	
	public static Player player;
	public static World world;
	
	public static Random rand;
	
	public static UI ui;
	
  public Game() {
	  rand = new Random();
	  addKeyListener(this);
	  addMouseListener(this);
	  this.setPreferredSize(new Dimension(WIDTH*scale, HEIGHT*scale));
      initFrame();
      
      //Inicializando objetos
      ui = new UI();
      image = new BufferedImage(160*scale, 120*scale, BufferedImage.TYPE_INT_ARGB);
      entities = new ArrayList<Entity>();
      enemies = new ArrayList<Enemy>();
      deadEntities = new ArrayList<Enemy>();
      
      playersheet = new Spritesheet("/Knight_1/Knight_Sheet.png");
      spritesheet = new Spritesheet("/spritesheet.png");
      enemiessheet = new Spritesheet("/Enemies/Dog_idle.png");
      
      player = Entity.createPlayer(0, 0);
      entities.add(player);
      world = new World("/world.png");
  }

  public void initFrame() {
      frame = new JFrame("Game #1");
      frame.add(this);
      frame.setResizable(false);
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

  }

  public synchronized void start() {
      thread = new Thread(this);
      isRunning = true;
      thread.start();
  }

  public synchronized void stop() {
      isRunning = false;
      try {
          thread.join();

      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
  
  public static void main(String[] args) {
      Game game = new Game();
      game.start();
  }

  public void tick() {
      for (int i=0; i < entities.size(); i++) {
    	  Entity e = entities.get(i);
    	  e.tick();
      }
  }

  public void render() {
      BufferStrategy bs = this.getBufferStrategy();
      if (bs == null) {
          this.createBufferStrategy(3);
          return;
      }
      Graphics g = image.getGraphics();
      g.setColor(new Color(0,148,255));
      g.fillRect(0, 0, WIDTH*scale, HEIGHT*scale);

      /*Renderização do jogo*/
      world.render(g);
      for (int i=0; i < entities.size(); i++) {
    	  Entity e = entities.get(i);
    	  e.render(g);
      }
      for (int i=0; i < deadEntities.size(); i++) {
    	  Entity e = deadEntities.get(i);
    	  e.render(g);
      }
      ui.render(g);
      /**/
      g.dispose();
      g = bs.getDrawGraphics();
      g.drawImage(image, 0, 0, WIDTH*scale, HEIGHT*scale, null);
      bs.show();
  }

  @Override
  public void run() {
      //Limitando para 60 FPS  
      long lastTime = System.nanoTime();
      double amountOfTicks = 60.0;
      double ns = 1000000000 / amountOfTicks;
      double delta = 0;
      int frames = 0;
      double timer = System.currentTimeMillis();
      requestFocus();
      while (isRunning) {
          long now = System.nanoTime();
          delta+= (now - lastTime) / ns;
          lastTime = now;
          if (delta >= 1) {
              tick();
              render();
              frames ++;
              delta --;
          }

          if (System.currentTimeMillis() - timer >= 1000) {
              System.out.println("FPS: " + frames);
              frames = 0;
              timer += 1000;
          }
      }
      
      stop();
  }

	

  @Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			player.right = true;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			player.left = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			player.up = true;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			player.down = true;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			player.right = false;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			player.left = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			player.up = false;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
			player.down = false;
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	//MOUSE
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			Game.player.idle = false;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

