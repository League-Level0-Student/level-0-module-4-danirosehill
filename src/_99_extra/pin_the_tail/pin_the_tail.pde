PImage donkey;
PImage tail;
import javax.swing.JOptionPane;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true; 
void setup() {
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");  
size (800, 590);
donkey=loadImage("Donkey.jpg");
tail=loadImage("tail.png");
}
int x;
int y;
void draw() {

  if ((dist(0, 0, mouseX, mouseY) < 30) || (dist(670,120, mouseX, mouseY) < 60)){
  background(donkey);
  } else {
  background (#75E0E3);
  }
  rect(0,0, 30, 30);
  rect(670,120, 40, 40);
   tail.resize(150,150);
   if (mousePressed) {
   x= mouseX;
   y= mouseY;
  image(tail, x-50, y-100);
    }
   if (dist(670,120, mouseX, mouseY) < 40) {
    JOptionPane.showMessageDialog(null, "You won!");
    if (playSound) {
     woohooSound.trigger();
     playSound = false;
   }
   }
 
  
   }
