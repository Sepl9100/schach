package chess.core;

import java.util.ArrayList;

public class ChessRules
{

    private ChessPiece[][] chessBoard; // the chess board
    private ChessPiece[] deadPieces;
    private int turn; // the current turn
    private int player; // the current player







    public ChessRules(ChessPiece[][] chessBoard)
    {
        this.chessBoard = chessBoard;
        StartPosition();
    }

    public ArrayList<ChessMove> CheckMoves(ChessPiece Piece)
    {

        switch (Piece.getChessPieceId())
        {
            case PAWN   -> {return RulesPawn(Piece);}
            case TOWER  -> {return RulesTower(Piece);}
            case BISHOP -> {return RulesBishop(Piece);}
            case HORSE  -> {return RulesHorse(Piece);}
            case KING   -> {return RulesKing(Piece);}
            case QUEEN  -> {return RulesQueen(Piece);}
        }
        return null;
    }

    public ArrayList<ChessMove> RulesPawn(ChessPiece Piece)
    {
        ArrayList<ChessMove> possibleMoves = new ArrayList<>();
        for(int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if(Piece.isBlack())
                {

                }
            }
        }
        return possibleMoves;
    }
    public ArrayList<ChessMove> RulesTower(ChessPiece Piece)
    {
        ArrayList<ChessMove> possibleMoves = new ArrayList<>();
        possibleMoves.add(new ChessMove(1,1,1,1,true));
        return possibleMoves;
    }

    public ArrayList<ChessMove> RulesBishop(ChessPiece Piece)
    {
        ArrayList<ChessMove> possibleMoves = new ArrayList<>();

        return possibleMoves;
    }

    public ArrayList<ChessMove> RulesHorse(ChessPiece Piece)
    {
        ArrayList<ChessMove> possibleMoves = new ArrayList<>();

        return possibleMoves;
    }
    public ArrayList<ChessMove> RulesQueen(ChessPiece Piece)
    {
        ArrayList<ChessMove> possibleMoves = new ArrayList<>();

        return possibleMoves;
    }
    public ArrayList<ChessMove> RulesKing(ChessPiece Piece)
    {
        ArrayList<ChessMove> possibleMoves = new ArrayList<>();

        return possibleMoves;
    }
    public void StartPosition()
    {
        for(int i = 0; i<8; i++)
        {
            for (int j = 0; j <= 7; j++)
            {
                if(i==1 || i == 6)
                {
                    chessBoard[i][j] = new ChessPiece(ChessPieceId.PAWN,i < 2,i);
                }

                else if(i == 0 || i == 7)
                {
                    switch (j) {
                        case 0 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.TOWER,i < 2,i);
                        case 1 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.HORSE,i < 2,i);
                        case 2 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.BISHOP,i < 2,i);
                        case 3 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.QUEEN,i < 2,i);
                        case 4 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.KING,i < 2 ,i);
                        case 5 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.BISHOP,i < 2 ,i);
                        case 6 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.HORSE,i < 2 ,i);
                        case 7 -> chessBoard[i][j] = new ChessPiece(ChessPieceId.TOWER,i < 2 ,i);
                    }

                }
            }



        }

    }
    public boolean setMove(ChessMove setMove)
    {
        return true;
    }
    public ChessPiece[][] getPossibleMoves(int x, int y)
    {
        return chessBoard;
    }
}

