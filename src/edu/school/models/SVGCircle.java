package edu.school.models;

import java.awt.Color;

public class SVGCircle extends SVGObject{

    private int r;

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }
    // constr circle
    public SVGCircle(int startX, int startY, int r, Color strokeColor, int strokeWidth, Color fill)
	{
		super(startX, startY, strokeColor, fill, strokeWidth);
		setR(r);
		
	}
    

    //svg circle
    public String toSvgCode() {
		String result = "<circle ";
		result += "cx=\""+getX()+"\" cy=\""+getY()+"\" ";
		result += "r=\""+getR()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
        result += "fill =\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>";
		return result;
	}
    
}
