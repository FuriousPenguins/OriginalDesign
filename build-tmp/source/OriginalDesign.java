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

int red = 127;
int blue = 127;
int green = 127;

public void setup() {
  size(800, 400, P3D);
  background(0);
  camera(0,0,200,0,0,0, 0.0f, 1.0f, 0.0f);
  noStroke();
}

public void draw() {
  lights();
  red += random(-5,6);
  blue += random(-5,6);
  green += random(-5,6);
  pointLight(red,green,blue,0,0,0);
  pushMatrix();
  translate(-60, 0, 0);
  sphere(30);
  popMatrix();

  pushMatrix();
  translate(60, 0, 0);
  sphere(30);
  popMatrix();

  pushMatrix();
  translate(60,-60,-60);
  sphere(30);
  popMatrix();

  pushMatrix();
  translate(-60,-60,-60);
  sphere(30);
  popMatrix();

  pushMatrix();
  translate(60,60,-60);
  sphere(30);
  popMatrix();

  pushMatrix();
  translate(-60,60,-60);
  sphere(30);
  popMatrix();

  pushMatrix();
  translate(0,-60,0);
  sphere(30);
  popMatrix();

  pushMatrix();
  translate(0,60,0);
  sphere(30);
  popMatrix();

  textSize(16);
  text("The balls will slowly change color", -130,-100,0);
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
