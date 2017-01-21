package com.example.try_shoot_game.enemy;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Canvas;

public class EnemyManager {
	private List<Enemy> enemies = new ArrayList<Enemy>(); 
	
	public void createEnemy(){
		EnemyFactory enemyFactory = new EnemyFactory();
		enemies.add(enemyFactory.createEnemy());
	}
	
	public List<Enemy> getEnemies(){
		return enemies;
	}
	
	public void drawEnemies(Canvas canvas){
		for(Enemy enemy : enemies){
			enemy.draw(canvas);
		}
	}
	
	public void moveEnemies(int dx, int dy){
		for(Enemy enemy : enemies){
			enemy.move(dx, dy);
		}
	}
	
	public void moveEnemiesUpAndDown(int dy){
		for(Enemy enemy : enemies){
			enemy.moveUpAndDown(dy);
		}
	}
	
	public void moveEnemiesLeftAndRight(int dx){
		for(Enemy enemy : enemies){
			enemy.moveLeftAndRight(dx);
		}
	}
}
