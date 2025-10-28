import applications.UI;
import chess.ChessMatch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChessMatch chessmat = new ChessMatch();
        UI.printBoard(chessmat.getPieces());
    }
}