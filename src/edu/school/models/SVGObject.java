package edu.school.models;

import java.awt.Color;

public abstract class SVGObject {
	private int x;
	
	private int y;
	
	private Color color;

	private int strokeWidth;

	private Color fill;

	public SVGObject(int x, int y, Color color, Color fill, int strokeWidth)
	{
		setX(x);
		setY(y);
		setColor(color);
		setFill(fill);
		setStrokeWidth(strokeWidth);
	}
	
	public SVGObject(int x, int y)
	{
		this(x, y, Color.BLACK, Color.BLUE, 5);
	}
	
	public SVGObject()
	{
		this(0,0);
	}

    public SVGObject(Color strokeColor, int strokeWidth2, Color fill2) {
		setColor(color);
		setFill(fill2);
		setStrokeWidth(strokeWidth2);
	}

	public SVGObject(int startX, int startY, Color strokeColor, int strokeWidth3) {
		setX(startX);
		setY(startY);
		setColor(strokeColor);
		setStrokeWidth(strokeWidth3);
	}

    public Color getFill(){
        return fill;
    }
    public void setFill(Color fill){
        this.fill = fill;
    }

	public int getStrokeWidth() {
		return strokeWidth;
	}


	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract String toSvgCode();
	
	protected String toRGB(Color color)
	{
		if(color == null)
			return "";
		String result = "rgb(";
		result += color.getRed()+",";
		result += color.getGreen()+",";
		result += color.getBlue()+")";
		return result;
	}
}
