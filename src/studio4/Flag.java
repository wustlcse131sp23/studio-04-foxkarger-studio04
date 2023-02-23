package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.filledRectangle(.5, .5, .5, .375);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.5,.5,.3);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.4,.6,.03);
		StdDraw.filledCircle(.6,.6,.03);
		StdDraw.filledEllipse(.5, .4, .09,.125);
	}
}