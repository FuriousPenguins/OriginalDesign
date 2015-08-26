int a=100;
int b;
int x = 100;
int y = 100;

void setup() {
	size(200,200);
	background(255);
}

void draw() {
	x -= 1;
	b += 1;
	ellipse(100,100,x,y);
	ellipse(100,100,a,b);
}