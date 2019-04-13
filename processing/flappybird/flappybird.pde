int gravity = 1;
int birdYVelocity = 20;
int birdY = 250;
int birdX = 100;

void setup()
{
  size(500, 500);
}


void draw()
{
  
  background(#5D83A7);
  fill(#5EEA24);
  stroke(#5EEA24);
  ellipse(birdX, birdY, 20, 20);

  birdY += gravity;
  if(mousePressed == true)
  {
    birdY -= birdYVelocity;
  }

}