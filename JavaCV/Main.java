public class Main {
    public static void main(String[] args) {
      int turn = 0;
      String winner = null;
      int[] board = new int[9];
      for(int i = 0; i < board.length; i++){
        board[i] = -1;
      }
System.out.println("Ende");
printBoard(board);
    }
    


    public static void printBoard(int[] meinBoard){
      System.out.println(meinBoard[0] + " | " + meinBoard[1] + " | " + meinBoard[2] );
      System.out.println("—————————————");
      System.out.println(meinBoard[3] + " | " + meinBoard[4] + " | " + meinBoard[5] );
      System.out.println("—————————————");
      System.out.println(meinBoard[6] + " | " + meinBoard[7] + " | " + meinBoard[8] );
    }
  }
  