package com.example.try_shoot_game.enemy;

import com.example.try_shoot_game.BitmapUtil;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class Enemy {
	private int x, y;
	private Bitmap bitmap;
	
	public Enemy(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.bitmap = BitmapUtil.redPoint;
	}
	
	public void draw(Canvas canvas){
		canvas.drawBitmap(bitmap, x, y, null);
	}
	
	public void move(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public void moveLeftAndRight(int dx){
		x += dx;
	}
	
	public void moveUpAndDown(int dy){
		y += dy;
	}
	
	public void moveRandom(){
		
	}
}
