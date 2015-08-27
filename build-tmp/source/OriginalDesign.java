import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

// int a=100;
int e1x;
int e1y;

int ex1;
int ey1;

int red;
int green;
int blue;

public void setup() {
	size(200,200);
	background(255);
	frameRate(30);
}

public void draw() {
	noFill();
	randomStroke();
	stroke(red,green,blue);
	drawEllipse1();
	if (e1x == 200) {
		draw4Ellipse();
	}
}

public void drawEllipse1() {
	ellipse(100,100,e1x,e1y);
	e1y += 1;
	if(e1x < 200) {
		e1x += 2;
		System.out.println(e1x);
	}
}

public void draw4Ellipse() {
	ellipse(0,0,ex1,ey1);
	ellipse(200,200,ex1,ey1);
	ellipse(0,200,ex1,ey1);
	ellipse(200,0,ex1,ey1);
	
	ex1 += 1;
	ey1 += 1;
}

public void randomStroke() {
	red = PApplet.parseInt(random(0,256));
	green = PApplet.parseInt(random(0,256));
	blue = PApplet.parseInt(random(0,256));
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
