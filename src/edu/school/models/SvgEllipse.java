package edu.school.models;

import java.awt.Color;

public class SvgEllipse extends SVGObject{

    private int rx;

    public int getRx(){
        return rx;
    }

    public void setRx(int rx){
        this.rx = rx;
    }
    private int ry;

    public int getRy(){
        return ry;
    }

    public void setRy(int ry){
        this.ry = ry;
    }
    // constr ellipse
    public SvgEllipse(int startX, int startY, int width, int hight,
			Color strokeColor, int strokeWidth, Color fill)
	{
		super(startX, startY, strokeColor, fill, strokeWidth);
		setRx(rx);
		setRy(ry);
	}
    //svg ellipse
    public String toSvgCode() {
		String result = "<circle ";
		result += "x=\""+getX()+"\" y=\""+getY()+"\" ";
		result += "rx=\""+getRx()+"\" ry=\""+getRy()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
        result += "fill =\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\"/>";
		return result;
	}
    
}
