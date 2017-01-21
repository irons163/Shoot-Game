package com.example.try_shoot_game.Controller;

import com.example.try_shoot_game.BitmapUtil;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Controller {
	private int x, y;
	private Bitmap bitmap;
	
	public Controller(int x, int y){
		this.x = x;
		this.y = y;
		this.bitmap = BitmapUtil.redPoint;
	}
	
	public void draw(Canvas canvas){
		canvas.drawBitmap(bitmap, x, y, null);
	}
}
