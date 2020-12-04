import javax.swing.JOptionPane;
 int creepX=40;
int creepY=400;
 PImage creeper;
void setup() {
 size (500,500);
 PImage jungle = loadImage ("jungle.jpg");
 jungle.resize(500,500);
 background(jungle);
creeper = loadImage("creeper.jpg");
creeper.resize(10,10);

}
void draw() {
  image (creeper, creepX, creepY);
if (mousePressed){
fill(252, 0, 0);
ellipse (mouseX, mouseY, 10, 10);
} 
if ((isNear(mouseX, creepX)==true) && (isNear(mouseY, creepY) ==true)) {
  JOptionPane.showMessageDialog(null, "you found the creeper!");
}

}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
