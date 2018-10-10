void setup() {
  size(235,235);
PImage face = loadImage("face.jpg");
image(face, 0, 0);



} 

void draw() {
  
  fill(255,mouseX,mouseY);
  ellipse(75,85,20,20);
  fill(255,mouseX,mouseY);
  ellipse(150,85,20,20);
  
  fill(0,0,0);
  ellipse(mouseX,mouseY,7,7);
  fill(0,0,0);
  ellipse(mouseX+300,mouseY,7,7);
  
  
  
  
  
  

} 