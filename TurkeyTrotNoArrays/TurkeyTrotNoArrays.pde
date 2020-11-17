PImage farmyard;
PImage grass;

int laneWidth;

boolean gameOver = false;

// Set the numberOfTurkeys variable to how many turkeys will race (2-8)
int numberOfTurkeys = 5;

// Declare a Turkey variable for each of the turkeys who will race. 
// For example:     Turkey gobbler;

Turkey fast_turkey;
Turkey slow_turkey;
Turkey tasty_turkey;
Turkey cooked_turkey;
Turkey winning_turkey;

void setup() {
  // This sets the size of the text used for the lane labels.
  textSize(20);
  
 // Set the size of the race course (make the width bigger for a longer race).
 
 size(500, 400);
 
 // Load a picture into the farmyard to be used as the race background (grass.jpg has been provided for you),
 
farmyard = loadImage("grass.jpg");

 // Resize the farmyard so it will fill the sketch
 
 farmyard.resize(width, height);

 // Set the width of each racing lane in the laneWidth variable. All turkeys use the same lane width.
 // (NOTE: you need to know how many turkeys are racing to calculate this) 
 
int laneWidth;
laneWidth=80;

 // Create the turkeys here. You will need to create a new turkey for each race participant.
 // Example:     gobbler = new Turkey(0, y-value);
 // NOTE: Each turkey will need a unique y value to place it in a different racing lane
 
fast_turkey = new Turkey (0, 0);
slow_turkey= new Turkey (0, 80);
tasty_turkey=new Turkey (0, 160);
cooked_turkey=new Turkey (0, 240);
winning_turkey=new Turkey (0, 320);
     
}


void draw() {
  
 if (!gameOver) {
    // Draw the background (farmyard)
    background(farmyard);
   
    drawLaneMarkers();   // This method draws the lines between each racing lane
    drawTurkeys();       // This method draws each turkey
    moveTurkeys();       // This method moves the turkeys during the race 
    checkForWinner();    // This method checks to see if any of the turkeys have crossed the finishing line

    // See if you can figure out how to change the speed of the turkeys by changing the Turkey class. 
    
    // Option: Draw the turkeys so they fill the racing lanes (fewer turkeys mean bigger size)
    

 }


// This code only runs when the game is over
// You do not have to change this code unless you want to
 if (gameOver) {
   fill(0);
   textSize(50);
     text ("RACE OVER", width/4, height/2);
 }
}

void drawTurkeys() {
  
    //  Put code in here to tell each turkey to draw itself
    
fast_turkey.draw();
slow_turkey.draw();
tasty_turkey.draw();
cooked_turkey.draw();
winning_turkey.draw();

    
}
void moveTurkeys() {
  
    //  Put code in here to tell each turkey to move itself
    
fast_turkey.move();
slow_turkey.move();
tasty_turkey.move();
cooked_turkey.move();
winning_turkey.move();
    
}

void checkForWinner() {
  
    //  Put code in here to check each turkey's x location to see if it crossed the finish line
    //  If a turkey has crossed the line, set     gameOver = true; 
    //  Also write the text "WINNER" in the winning turkey's race lane, so you can see who won.
    //  NOTE: There might be a tie!
    
if (fast_turkey.x >= width){
  gameOver = true;
}

if (slow_turkey.x >= width){
  gameOver = true;}
if (tasty_turkey.x >= width){
  gameOver = true;}
if (cooked_turkey.x >= width){
  gameOver = true;}
if (winning_turkey.x >= width){
  gameOver = true;}

}
void drawLaneMarkers() {
     // The following code draws the lanes and lane numbers
     // You do not have to change this code unless you want to
    fill(0);
    for (int i=1; i<=numberOfTurkeys; i++ ) {
       rect(0,laneWidth*i,width,2);
       textSize(30);
       text(""+i, width-50, laneWidth*i - 30);
  } 
}  
  
