PImage face;
void setup() {
size (800,500);
face = loadImage("face.jpg");
face.resize(width,height);
}

void draw() {
background(face);
println(mouseX + "," + mouseY);
fill(#F7F7F5);
ellipse(352, 240, 50,70);
ellipse (440, 243, 50,70);

if(mouseX < 330){
  mouseX = 330;
}
else if(mouseX > 375){
  mouseX = 375;
}
if(mouseY < 215){
  mouseY = 215;
}
else if(mouseY > 264){
  mouseY = 264;
}




fill (0, 0, 0);
ellipse (mouseX+85, mouseY, 20,20);
ellipse (mouseX, mouseY, 20,20);
}
