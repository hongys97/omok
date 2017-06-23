import objectdraw.*;

public class Gameboard{

  private Line[] lineArray;

  // we create the visual board within the constructor
  //createBoard(size, size);



  // the method that sets up the visual board
  public void createBoard(int length, int height){

    // start creating the vertical lines
    for (int x = 0; x <= length; x++){
      Line vert = new Line(x, 0, x, height);
      //lineArray[x] = vert;
    }

    for (int y = 0; y <= height; y++){
      Line horiz = new Line(0, y, length, y);
      //lineArray
    }
  }
}
