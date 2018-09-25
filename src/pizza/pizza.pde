 void draw(){
   if(mousePressed){
   PImage goblin = loadImage("goblin.ppm.gif");
   goblin.resize(50,50);
   image(goblin, mouseX+5,mouseY+90);
 PImage eyeball = loadImage("eyeball.ppm.gif");
 eyeball.resize(50,50);
 image(eyeball,mouseX+15,mouseY+50);
 PImage curly = loadImage("curly.ppm.gif");
 curly.resize(50,50);
 image(curly,mouseX+60,mouseY+30);
 PImage firecracker = loadImage("firecracker.ppm.gif");
 firecracker.resize(50,50);
 image(firecracker,mouseX+70,mouseY+100);
                     }
 }

void setup() {
size(500,500);
fill(134,103,103);
ellipse(250,250,300,300);
fill(200,0,0);
ellipse(250,250,270,270);
fill(225,230,3);
ellipse(250,250,250,250);
}