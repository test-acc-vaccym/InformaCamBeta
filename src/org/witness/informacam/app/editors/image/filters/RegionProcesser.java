package org.witness.informacam.app.editors.image.filters;

import java.util.Properties;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

public interface RegionProcesser {
	
	public void processRegion(RectF rect, Canvas canvas, Bitmap originalBmp);
	
	public Properties getProperties();
	
	public Bitmap getBitmap();
	
	public void setProperties(Properties props);
	
}