package chessgui.pieces;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import chessgui.Board;

public class Pawn extends Piece {

	String direction = "";
	int movesMadeWhite = 0;
	int movesMadeBlack = 0;
    private boolean has_moved;
    
    public Pawn(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board);
        has_moved = false;
    }
    
    public void setHasMoved(boolean has_moved)
    {
        this.has_moved = has_moved;
    }
    
    public boolean getHasMoved()
    {
        return has_moved;
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {  	
    	if (this.getX() != destination_x && this.getY() != destination_y)
    	{
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
    	
    	// Movement restrictions for Pawn
    	Piece possiblePiece = board.getPiece(destination_x, destination_y);
    	if (possiblePiece != null)
    	{
    		if (possiblePiece.isWhite() && this.isWhite())
    		{
    			// can't kill same team
    			System.out.println("can't kill white friendly!");
    			return (false);
    		}
    		if (possiblePiece.isBlack() && this.isBlack())
    		{
    			// can't kill same team
    			System.out.println("can't kill black friendly!");
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
	    		System.out.print("2, ");
	    		System.out.print(this.getX() - destination_x + ", ");
	    		System.out.println(this.getY() - destination_y + "!");
	    		
	    		if (((this.getX() - destination_x == 1) && (this.getY() - destination_y == 1)) || ((this.getX() - destination_x == -1) && (this.getY() - destination_y == 1)))
		    	{
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
	    			return (true);
	    		}
		    	else 
		    	{
		    		System.out.println("niet schuin nemen");
		    		return (false);
		    	}
	    	}
	    	if (possiblePiece.isWhite() && this.isBlack())
    		{   
		    	if (((this.getX() - destination_x == 1) && (this.getY() - destination_y == -1)) || ((this.getX() - destination_x == -1) && (this.getY() - destination_y == -1)))
		    	{
		    		System.out.println("het werkt!");
		    		if (board.White_Pieces.get(0) == possiblePiece)
		    		{
		    			System.out.println("The White King has been taken!");
		    			JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		    			JOptionPane.showMessageDialog(frame,
								   "You Have Won!",
								   "End Game!",
								   JOptionPane.PLAIN_MESSAGE);
		   				System.exit(1);
		    		}
	    		
	    			return (true);
	    		}
		    	else 
		    	{
		    		System.out.println("niet schuin nemen");
		    		return (false);
		    	}
	    	}
	    }	
    	
    	if (this.isWhite() && movesMadeWhite < 1)
    	{
    		if (this.getY() - destination_y <= 2 )
    		{
    			if (this.getX() - destination_x == 0)
    			{
    				movesMadeWhite++;
        			return (true);
    			}
    		}
    		else
    		{
    			return (false);
    		}			
    	}
    	if (this.isBlack() && movesMadeBlack < 1)
		{
			if (this.getY() - destination_y >= -2 )
			{
    			if (this.getX() - destination_x == 0)
    			{
    				movesMadeBlack++;
        			return (true);
    			}
			}
			else
    		{
    			return (false);
    		}
		}
    	else
    	{
    		if (this.isBlack())
    		{
	    		if (this.getY() - destination_y == -1)
	    		{
	    			return (true);
	    		}
	    		else
	    		{
	    			return (false);
	    		}
    		}
    		else 
    		{
    			if (this.getY() - destination_y == 1)
	    		{
	    			return (true);
	    		}
	    		else
	    		{
	    			return (false);
	    		}
    		}
    	} 
    	return true;
    }
}
