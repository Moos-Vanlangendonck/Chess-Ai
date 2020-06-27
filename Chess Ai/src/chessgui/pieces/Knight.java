package chessgui.pieces;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import chessgui.Board;

public class Knight extends Piece {

	String direction = "";
	boolean isTrue;
	
    public Knight(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
    	Piece possiblePiece = board.getPiece(destination_x, destination_y);
    	if (possiblePiece != null)
    	{
    		if (possiblePiece.isWhite() && this.isWhite())
    		{
    			// can't kill teammate
    			return (false);
    		}
    		if (possiblePiece.isBlack() && this.isBlack())
    		{
    			// can't kill teammate
    			return (false);
    		}
    	}
    	
    	if (possiblePiece != null)
    	{
	    	if (possiblePiece.isBlack() && this.isWhite())
			{
				// Taking pieces
				if (board.Black_Pieces.get(0) == possiblePiece)
				{
					System.out.println("The Black King has been taken!");
					JFrame frame = new JFrame("JOptionPane showMessageDialog example");
					JOptionPane.showMessageDialog(frame,
						    "You Have Won!",
						    "End Game!",
						    JOptionPane.PLAIN_MESSAGE);
					System.exit(1);
				}
				else if (board.Black_Pieces.get(1) == possiblePiece)
				{
					System.out.println("The Black Queen has been taken!");
				}
				else if (board.Black_Pieces.get(2) == possiblePiece)
				{
					System.out.println("The Black Bishop has been taken!");
				}
				else if (board.Black_Pieces.get(3) == possiblePiece)
				{
					System.out.println("The Black Bishop has been taken!");
				}
				else if (board.Black_Pieces.get(4) == possiblePiece)
				{
					System.out.println("The Black Knight has been taken!");
				}
				else if (board.Black_Pieces.get(5) == possiblePiece)
				{
					System.out.println("The Black Knight has been taken!");
				}
				else if (board.Black_Pieces.get(6) == possiblePiece)
				{
					System.out.println("The Black Rook has been taken!");
				}
				else if (board.Black_Pieces.get(7) == possiblePiece)
				{
					System.out.println("The Black Rook has been taken!");
				}
				else if (board.Black_Pieces.get(8) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
				else if (board.Black_Pieces.get(9) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
				else if (board.Black_Pieces.get(10) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
				else if (board.Black_Pieces.get(11) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
				else if (board.Black_Pieces.get(12) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
				else if (board.Black_Pieces.get(13) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
				else if (board.Black_Pieces.get(14) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
				else if (board.Black_Pieces.get(15) == possiblePiece)
				{
					System.out.println("The Black Pawn has been taken!");
				}
			}
			if (possiblePiece.isWhite() && this.isBlack())
			{    			
				// taking pieces
				if (board.White_Pieces.get(0) == possiblePiece)
				{
					System.out.println("The White King has been taken!");
					JFrame frame = new JFrame("JOptionPane showMessageDialog example");
					JOptionPane.showMessageDialog(frame,
						    "You Have Lost!",
						    "End Game!",
						    JOptionPane.PLAIN_MESSAGE);
					System.exit(1);
				}
				else if (board.White_Pieces.get(1) == possiblePiece)
				{
					System.out.println("The White Queen has been taken!");
				}
				else if (board.White_Pieces.get(2) == possiblePiece)
				{
					System.out.println("The White Bishop has been taken!");
				}
				else if (board.White_Pieces.get(3) == possiblePiece)
				{
					System.out.println("The White Bishop has been taken!");
				}
				else if (board.White_Pieces.get(4) == possiblePiece)
				{
					System.out.println("The White Knight has been taken!");
				}
				else if (board.White_Pieces.get(5) == possiblePiece)
				{
					System.out.println("The White Knight has been taken!");
				}
				else if (board.White_Pieces.get(6) == possiblePiece)
				{
					System.out.println("The White Rook has been taken!");
				}
				else if (board.White_Pieces.get(7) == possiblePiece)
				{
					System.out.println("The White Rook has been taken!");
				}
				else if (board.White_Pieces.get(8) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				else if (board.White_Pieces.get(9) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				else if (board.White_Pieces.get(10) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				else if (board.White_Pieces.get(11) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				else if (board.White_Pieces.get(12) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				else if (board.White_Pieces.get(13) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				else if (board.White_Pieces.get(14) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				else if (board.White_Pieces.get(15) == possiblePiece)
				{
					System.out.println("The White Pawn has been taken!");
				}
				
			}
			
    	}
    	
    	// movement (8 possible)
    	if (possiblePiece == null || possiblePiece != null)
    	{
    		if ((this.getX() - destination_x == -2) && (this.getY()  - destination_y == -1))
    		{
        		isTrue = true;
          	}
    		else if ((this.getX() - destination_x == -1) && (this.getY() - destination_y == -2))
    		{
    			isTrue = true;        		
    		}
    		else if ((destination_x - this.getX() == -1) && (destination_y - this.getY() == -2))
			{
				isTrue = true;   
			}
    		else if ((destination_x - this.getX() == -2) && (destination_y - this.getY() == -1))
			{
				isTrue = true;   
			}
    		else if ((this.getX() - destination_x == 2) && (this.getY()  - destination_y == -1))
    		{
        		isTrue = true;   
          	}
    		else if ((this.getX() - destination_x == -2) && (this.getY()  - destination_y == 1))
    		{
        		isTrue = true;   
          	}
    		else if ((destination_x - this.getX() == -1) && (destination_y - this.getY() == 2))
    		{
        		isTrue = true;   
          	}
    		else if ((destination_x - this.getX() == 1) && (destination_y - this.getY() == -2))
			{
				isTrue = true;   
			}
        	else 
        	{
        		isTrue = false;   
        	}
    	}	
    	
        return isTrue;
    }
}
