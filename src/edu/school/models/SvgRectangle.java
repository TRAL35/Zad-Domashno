package edu.school.models;

import java.awt.Color;

public class SvgRectangle extends SVGObject {

   
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    private int hight;
    
    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    //constr rec
    public SvgRectangle(int startX, int startY, int width, int hight,
			Color strokeColor, int strokeWidth, Color fill)
	{
		super(startX, startY, strokeColor, fill, strokeWidth);
		setWidth(width);
		setHight(hight);
		
	}
    //svg rec
    public String toSvgCode() {
		String result = "<rect ";
		result += "x=\""+getX()+"\" y=\""+getY()+"\" ";
		result += "width=\""+getWidth()+"\" height=\""+getHight()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
        result += "fill =\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>";
		return result;
	}

}
