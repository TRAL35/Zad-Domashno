package edu.school.tests;

import java.awt.Color;

import edu.school.models.SVGCircle;
import edu.school.models.SVGLine;
import edu.school.models.SVGPicture;
import edu.school.models.SvgEllipse;
import edu.school.models.SvgPolygon;
import edu.school.models.SvgRectangle;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SVGPicture pic = new SVGPicture();
		pic.add(new SVGLine(10, 10, 180, 250, Color.red, 5));
		pic.add(new SVGCircle(100, 75, 20, Color.blue, 5, Color.yellow));
		pic.add(new SvgEllipse(150, 150, 200, 5, Color.green, 5, Color.black));
		pic.add(new SvgRectangle(200, 10, 40, 40, Color.red, 5, Color.black));
		pic.add(new SvgPolygon(Color.green, Color.black, 5, 50, 160, 55, 180, 70, 180, 60, 190, 65, 205, 50, 195, 35, 205, 40, 190, 30, 180, 45, 180));
		pic.saveToFile("C:\\Users\\GRIGS\\Documents\\test.svg");
		//System.out.println(pic);
	}
 

}
