package chessgui.pieces;
import chessgui.Board;
// import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class King extends Piece {
	
	String direction = "";

    public King(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
    	Piece possiblePiece = board.getPiece(destination_x, destination_y);
    	if (possiblePiece != null)
    	{
    		if ((destination_x - this.getX()) > 1)
    		{
        		// 1 block radius
        		return (false);
    		}
        	
        	if ((this.getX() - destination_x) > 1)
    		{
        		// 1 block radius
            	return (false);
    		}

        	if ((destination_y - this.getY()) > 1)
    		{
        		// 1 block radius
            	return (false);
    		}
        	
        	if ((this.getY() - destination_y) > 1)
    		{
        		// 1 block radius
            	return (false);
    		}
        	
        	if (destination_y > this.getY())
        	{
        		direction = "south";
        	}
        	
        	if (destination_y < this.getY())
        	{
        		direction = "north";
        	}
        	
        	if (destination_x > this.getX())
        	{
        		direction = "east";
        	}
        	
        	if (destination_x < this.getX())
        	{
        		direction = "west";
        	}
    		
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
    	
    	if (direction.equals("south")) // check if there is a piece in south
    	{
    		int move_piece = Math.abs(destination_y - this.getY());
    		for (int i = 1; i < move_piece; i++)
    		{
    			Piece p = board.getPiece(this.getX(), this.getY() + i);
    			if (p != null)
    			{
    				return (false);
    			}
    		}
    	}
    	
    	if (direction.equals("north")) // check if there is a piece in north
    	{
    		int move_piece = Math.abs(destination_y - this.getY());
    		for (int i = 1; i < move_piece; i++)
    		{
    			Piece p = board.getPiece(this.getX(), this.getY() - i);
    			if (p != null)
    			{
    				return (false);
    			}
    		}
    	}
    	
    	if (direction.equals("east")) // check if there is a piece in east
    	{
    		int move_piece = Math.abs(destination_x - this.getX());
    		for (int i = 1; i < move_piece; i++)
    		{
    			Piece p = board.getPiece(this.getX() + i, this.getY());
    			if (p != null)
    			{
    				return (false);
    			}
    		}
    	}
    	
    	if (direction.equals("west")) // check if there is a piece in west
    	{
    			int move_piece = Math.abs(destination_x - this.getX());
    			for (int i = 1; i < move_piece; i++)
        		{
        			Piece p = board.getPiece(this.getX() - i, this.getY());
        			if (p != null)
        			{
        				return (false);
        			}
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
						    "You Have Won!.",
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
    	
        return true;
    }
}
