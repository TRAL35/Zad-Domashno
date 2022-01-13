package edu.school.models;

import java.awt.Color;

public class SvgPolygon extends SVGObject{
    private int points[];

    private void setPoints(int points[]){

        if(points.length % 2 == 1){
            throw new IllegalArgumentException("The number must be even");
        }
        this.points = points;
    }
    public SvgPolygon(Color strokeColor, Color fill, int strokeWidth, int... point){
        super(strokeColor, strokeWidth, fill);
        setPoints(points); 
    }
    public String toSvgCode(){
        String pointsStr = "";

        for(int i = 0; i < points.length; i ++){
            pointsStr += points[i] + " ";

        }

		String result = "<polygon ";
		result += "points=\"" + pointsStr + "\" ";
        result += "stroke=\"" + toRGB(getColor())+ "\" ";
        result += " fill=\"" + toRGB(getFill()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
		
        return result;
	}
}
