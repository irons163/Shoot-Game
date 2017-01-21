package com.example.try_shoot_game.shooter;

import com.example.try_shoot_game.BitmapUtil;
import com.example.try_shoot_game.CommonUtil;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Crosshair {
	Bitmap bitmap;
	
	public Crosshair(){
		this.bitmap = BitmapUtil.greenPoint;
	}
	
	public void draw(Canvas canvas){
		canvas.drawBitmap(bitmap, CommonUtil.screenWidth/2, CommonUtil.screenHeight/2, null);
	}
	
}
