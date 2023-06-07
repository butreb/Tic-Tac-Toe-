package application;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;


public class Controller {

	@FXML
	private ImageView zero_zero;
	@FXML
	private ImageView zero_one;
	@FXML
	private ImageView zero_two;
	
	@FXML
	private ImageView one_zero;
	@FXML
	private ImageView one_one;
	@FXML
	private ImageView one_two;
	
	@FXML
	private ImageView two_zero;
	@FXML
	private ImageView two_one;
	@FXML
	private ImageView two_two;
	
	int turn = 0;
	
	private Image imageX = new Image("X.png");
	
	private Image imageO = new Image("O.png");
	
	private Boolean imageclickedZero_Zero = false;
	private Boolean imageclickedZero_One = false;
	private Boolean imageclickedZero_Two = false;
	private Boolean imageclickedOne_Zero = false;
	private Boolean imageclickedOne_One = false;
	private Boolean imageclickedOne_Two = false;
	private Boolean imageclickedTwo_Zero = false;
	private Boolean imageclickedTwo_One = false;
	private Boolean imageclickedTwo_Two = false;
	
	@FXML
	private ImageView zeroHorizontalLine;
	@FXML
	private ImageView oneHorizontalLine;
	@FXML
	private ImageView twoHorizontalLine;
	
	@FXML
	private ImageView zeroVerticalLine;
	@FXML
	private ImageView oneVerticalLine;
	@FXML
	private ImageView twoVerticalLine;
	
	@FXML
	private ImageView leftToRightCross;
	@FXML
	private ImageView rightToLeftCross;
	
	
	@FXML
	private GridPane myGridPane;
	
	@FXML
	private Label myLabel;
	
	int counter = 0;
	
	public void click() {
		
		zero_zero.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedZero_Zero) {
					zero_zero.setImage(imageX);
					turn++;
					imageclickedZero_Zero = true;
					xWins();
					counter++;
				}
				else if(turn ==1 && !imageclickedZero_Zero) {
					zero_zero.setImage(imageO);
					turn--;
					imageclickedZero_Zero = true;
					oWins();
					counter++;
				}
			
				turn();
			}
		});
		
		zero_one.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedZero_One) {
					zero_one.setImage(imageX);
					turn++;
					imageclickedZero_One = true;
					xWins();
					counter++;
				}
				else if(turn ==1&& !imageclickedZero_One)  {
					zero_one.setImage(imageO);
					turn--;
					imageclickedZero_One = true;
					oWins();
					counter++;
				}
				turn();
			}
			
		});
		
		
		zero_two.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedZero_Two) {
					zero_two.setImage(imageX);
					turn++;
					imageclickedZero_Two = true;
					xWins();
					counter++;
				}
				else if(turn ==1 && !imageclickedZero_Two)  {
					zero_two.setImage(imageO);
					turn--;
					imageclickedZero_Two =true;
					oWins();
					counter++;
				}
				turn();
			}
		});
		
		one_zero.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedOne_Zero) {
					one_zero.setImage(imageX);
					turn++;
					imageclickedOne_Zero= true;
					xWins();
					counter++;
				}
				else if(turn ==1&& !imageclickedOne_Zero)  {
					one_zero.setImage(imageO);
					turn--;
					imageclickedOne_Zero= true;
					oWins();
					counter++;
				}
				turn();
			}
		});
		
		one_one.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedOne_One) {
					one_one.setImage(imageX);
					turn++;
					imageclickedOne_One = true;
					xWins();
					counter++;
				}
				else if(turn ==1&& !imageclickedOne_One)  {
					one_one.setImage(imageO);
					turn--;
					imageclickedOne_One = true;
					oWins();
					counter++;
				}
				turn();
				
			}
		});
		
		one_two.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedOne_Two) {
					one_two.setImage(imageX);
					turn++;
					imageclickedOne_Two = true;
					xWins();
					counter++;
				}
				else if(turn ==1 && !imageclickedOne_Two)  {
					one_two.setImage(imageO);
					turn--;
					imageclickedOne_Two = true;
					oWins();
					counter++;
				}
				turn();
			}
		});
		
		two_zero.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedTwo_Zero) {
					two_zero.setImage(imageX);
					turn++;
					imageclickedTwo_Zero = true;
					xWins();
					counter++;
				}
				else if(turn ==1 && !imageclickedTwo_Zero)  {
					two_zero.setImage(imageO);
					turn--;
					imageclickedTwo_Zero = true;
					oWins();
					counter++;
				}
				turn();
			}
		});
		
		two_one.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedTwo_One) {
					two_one.setImage(imageX);
					turn++;
					imageclickedTwo_One = true;
					xWins();
					counter++;
				}
				else if(turn ==1 && !imageclickedTwo_One)  {
					two_one.setImage(imageO);
					turn--;
					imageclickedTwo_One = true;
					oWins();
					counter++;
				}
				turn();
			}
		});
		
		
		two_two.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				if (turn ==0 && !imageclickedTwo_Two) {
					two_two.setImage(imageX);
					turn++;
					imageclickedTwo_Two = true;
					xWins();
					counter++;
				}
				else if(turn ==1 && !imageclickedTwo_Two)  {
					two_two.setImage(imageO);
					turn--;
					imageclickedTwo_Two = true;
					oWins();
					counter++;
				}
				turn();
			}
		});
		
		
	}
	
	void oWins() {
		
		if (zero_zero.getImage() == imageO && zero_one.getImage() == imageO && zero_two.getImage() == imageO) {
			
			zeroHorizontalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}else if (one_zero.getImage() == imageO && one_one.getImage() == imageO && one_two.getImage() == imageO) {
			
			oneHorizontalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}else if (two_zero.getImage() == imageO && two_one.getImage() == imageO && two_two.getImage() == imageO) {
			
			twoHorizontalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}
		
		
		else if (zero_zero.getImage() == imageO && one_zero.getImage() == imageO && two_zero.getImage() == imageO) {
			
			zeroVerticalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}else if (zero_one.getImage() == imageO && one_one.getImage() == imageO && two_one.getImage() == imageO) {
			
			oneVerticalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}else if (zero_two.getImage() == imageO && one_two.getImage() == imageO && two_two.getImage() == imageO) {
			
			twoVerticalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}
		
		
		else if (zero_zero.getImage() == imageO && one_one.getImage() == imageO && two_two.getImage() == imageO) {
			
			leftToRightCross.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}else if (zero_two.getImage() == imageO && one_one.getImage() == imageO && two_zero.getImage() == imageO) {
			
			rightToLeftCross.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 3;
		}
		else if ((zero_zero.getImage() == imageX || zero_zero.getImage()== imageO) && 
				(zero_one.getImage() == imageX || zero_one.getImage()== imageO) && 
				(zero_two.getImage() == imageX || zero_two.getImage()== imageO) && 
				(one_zero.getImage() == imageX || one_zero.getImage()== imageO) && 
				(one_one.getImage() == imageX || one_one.getImage()== imageO) && 
				(one_two.getImage() == imageX || one_two.getImage()== imageO) && 
				(two_zero.getImage() == imageX || two_zero.getImage()== imageO) && 
				(two_one.getImage() == imageX || two_one.getImage()== imageO) && 
				(two_two.getImage() == imageX || two_two.getImage()== imageO) ) {
			turn = 4;
		}
	}
	
void xWins() {
		
		if (zero_zero.getImage() == imageX && zero_one.getImage() == imageX && zero_two.getImage() == imageX) {
			
			zeroHorizontalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
			
		}else if (one_zero.getImage() == imageX && one_one.getImage() == imageX && one_two.getImage() == imageX) {
			
			oneHorizontalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
		}else if (two_zero.getImage() == imageX && two_one.getImage() == imageX && two_two.getImage() == imageX) {
			
			twoHorizontalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
		}
		
		
		else if (zero_zero.getImage() == imageX && one_zero.getImage() == imageX && two_zero.getImage() == imageX) {
			
			zeroVerticalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
		}else if (zero_one.getImage() == imageX && one_one.getImage() == imageX && two_one.getImage() == imageX) {
			
			oneVerticalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
		}else if (zero_two.getImage() == imageX && one_two.getImage() == imageX && two_two.getImage() == imageX) {
			
			twoVerticalLine.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
		}
		
		
		else if (zero_zero.getImage() == imageX && one_one.getImage() == imageX && two_two.getImage() == imageX) {
			
			leftToRightCross.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
		}else if (zero_two.getImage() == imageX && one_one.getImage() == imageX && two_zero.getImage() == imageX) {
			
			rightToLeftCross.setOpacity(1);
			myGridPane.setDisable(true);
			turn = 2;
			
		}
		else if ((zero_zero.getImage() == imageX || zero_zero.getImage()== imageO) && 
				(zero_one.getImage() == imageX || zero_one.getImage()== imageO) && 
				(zero_two.getImage() == imageX || zero_two.getImage()== imageO) && 
				(one_zero.getImage() == imageX || one_zero.getImage()== imageO) && 
				(one_one.getImage() == imageX || one_one.getImage()== imageO) && 
				(one_two.getImage() == imageX || one_two.getImage()== imageO) && 
				(two_zero.getImage() == imageX || two_zero.getImage()== imageO) && 
				(two_one.getImage() == imageX || two_one.getImage()== imageO) && 
				(two_two.getImage() == imageX || two_two.getImage()== imageO) ) {
			turn = 4;
		}
		
	}
	
void setOpacityToZero() {
	
	zeroVerticalLine.setOpacity(0);
	oneVerticalLine.setOpacity(0);
	twoVerticalLine.setOpacity(0);
	
	zeroHorizontalLine.setOpacity(0);
	oneHorizontalLine.setOpacity(0);
	twoHorizontalLine.setOpacity(0);
	
	leftToRightCross.setOpacity(0);
	rightToLeftCross.setOpacity(0);
	
	
	zeroVerticalLine.setDisable(true);
	oneVerticalLine.setDisable(true);
	twoVerticalLine.setDisable(true);
	
	zeroHorizontalLine.setDisable(true);
	oneHorizontalLine.setDisable(true);
	twoHorizontalLine.setDisable(true);
	
	leftToRightCross.setDisable(true);
	rightToLeftCross.setDisable(true);
	
	
}

void turn() {
	
	if (turn == 0) {
		myLabel.setText("X's Turn");
	}
	else if (turn == 1) {
		myLabel.setText("O's Turn");
	}else if (turn == 2) {
		myLabel.setText("X Player Won!");	
	}
	else if (turn == 3) {
	myLabel.setText("O Player Won!");	
}
	
	if (turn == 4) {
		myLabel.setText("Tie!");
	}
	
}

public void reset() {
	
	setOpacityToZero();
	turn =0;
	turn();
	
	
	
	zero_zero.setImage(null);
	zero_one.setImage(null);
	zero_two.setImage(null);
	
	one_zero.setImage(null);
	one_one.setImage(null);
	one_two.setImage(null);
	
	two_zero.setImage(null);
	two_one.setImage(null);
	two_two.setImage(null);
	
	 imageclickedZero_Zero = false;
	    imageclickedZero_One = false;
	    imageclickedZero_Two = false;
	    
	    imageclickedOne_Zero = false;
	    imageclickedOne_One = false;
	    imageclickedOne_Two = false;
	    
	    imageclickedTwo_Zero = false;
	    imageclickedTwo_One = false;
	    imageclickedTwo_Two = false;
	myGridPane.setDisable(false);
	
	
}

}
