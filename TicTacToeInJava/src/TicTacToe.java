import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * This program is that lets two users play the tic-tac-toe game using GUI.
 * Users alternately place their marks, which are X and O, in one of the nine blocks in the grid.
 * They can mark their owns' by clicking on a block on their turn.
 * Even if users click on the blocks that has already been marked, it doesn't affect the game.
 * A user placing three of their marks on a horizontal, vertical, or diagonal line first will be the winner.
 * If all nine blocks are marked without a winner, the game will end in a draw.
 * @author Eunji Elly Lee
 * @version 2022-02-28
 */

public class TicTacToe extends Application {
	// Declare and initialize the variables	
	private Button[][] button =  new Button[3][3];
	private Label notice = new Label("X's turn to play");
	private String player = "X";
	
	@Override
	public void start(Stage primaryStage) {	
		// Create the game board	
		BorderPane pane = setBoard();
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 350, 380);
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	
	// Create the game board
	public BorderPane setBoard() {
		GridPane board = new GridPane();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board.add(button[i][j] = new Button(), j, i);
				
				Button cell = button[i][j];	
				cell.prefWidthProperty().bind(board.widthProperty().divide(3));	
				cell.prefHeightProperty().bind(board.heightProperty().divide(3));	
				cell.setStyle("-fx-font-size: 50; -fx-font-weight: bolder");						
				cell.setOnAction(e -> playGame(cell));
			}
		}
		
		BorderPane pane = new BorderPane();
		pane.setCenter(board);
		pane.setBottom(notice); 
		notice.setPrefHeight(45);
		notice.setStyle("-fx-font-size: 20; -fx-font-weight: bolder");
		BorderPane.setAlignment(notice, Pos.CENTER);
		
		return pane;
	}
	
	// Determine the status of the game
	public void playGame(Button cell) {
		if(cell.getText().equals("") && !player.equals("")) {
			cell.setText(player);
			
			if(isWon(player)) {
				notice.setText(player + " won! The game is over");
				player = "";
			}
			else if(isFull()) {
				notice.setText("Draw! The game is over");
				player = "";
			}
			else {
				player = (player == "X") ? "O" : "X";
				notice.setText(player + "'s turn to play");
			}			
		}	
	}
	
	// Determine the status of the game (win)
	public boolean isWon(String player) {
		if(button[1][1].getText().equals(player) &&
				((button[0][0].getText().equals(player) && button[2][2].getText().equals(player)) ||
				(button[0][2].getText().equals(player) && button[2][0].getText().equals(player)))) {
			return true;
		}
		else {
			for(int i = 0; i < 3; i++) {
				if((button[i][0].getText().equals(player) &&
						button[i][1].getText().equals(player) && button[i][2].getText().equals(player)) ||
						(button[0][i].getText().equals(player) && button[1][i].getText().equals(player) &&
						button[2][i].getText().equals(player))) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	// Determine the status of the game (draw)
	public boolean isFull() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(button[i][j].getText().equals("")) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}