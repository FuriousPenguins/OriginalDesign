int red = 127;
int blue = 127;
int green = 127;

void setup() {
  size(800, 400, P3D);
  background(0);
  // camera(0,0,200,0,0,0, 0.0, 1.0, 0.0);
  noStroke();
}

void draw() {
  lights();
  red += random(-5,6);
  blue += random(-5,6);
  green += random(-5,6);
  pointLight(red,green,blue,400,200,150);
  translate(400,200,150);
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