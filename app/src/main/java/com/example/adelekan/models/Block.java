package com.example.adelekan.models;

import android.graphics.Color;
import android.graphics.Point;

public class Block {
    private int shapeIndex;
    private int frameNumber;
    private BlockColor color;
    private Point position;
}
private Block(int shapeIndex, BlockColor blockColor) {
    this.frameNumber = 0;
    this.shapeIndex = shapeIndex;
    this.color = blockColor;
    this.position = new Point(AppModel.FieldConstants.COLUMN_COUNT.getValue()/2,0);
}

public enum BlockColor {
    PINK(Color.rgb(255, 105, 180), (byte) 2),
    GREEN(Color.rgb(0, 128, 0), (byte) 3),
    ORANGE(Color.rgb(128, 160, 0), (byte) 4),
    

}