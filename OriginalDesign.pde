
int e1x;
int e1y;

int ex1;
int ey1;

int red;
int green;
int blue;

void setup() {
	size(200,200);
	background(255);
	frameRate(30);
}

void draw() {
	noFill();
	randomStroke();
	stroke(red,green,blue);
	drawEllipse1();
	if (e1x == 200) {
		draw4Ellipse();
	}
}

void drawEllipse1() {
	ellipse(100,100,e1x,e1y);
	e1y += 1;
	if(e1x < 200) {
		e1x += 2;
		System.out.println(e1x);
	}
}

void draw4Ellipse() {
	ellipse(0,0,ex1,ey1);
	ellipse(200,200,ex1,ey1);
	ellipse(0,200,ex1,ey1);
	ellipse(200,0,ex1,ey1);
	
	ex1 += 1;
	ey1 += 1;
}

void randomStroke() {
	red = int(random(0,256));
	green = int(random(0,256));
	blue = int(random(0,256));
}