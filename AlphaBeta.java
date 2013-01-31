package Abalone;

class AlpheBeta{
    public int eval(int[][] board){
      return 1;
    }
    public int minfork(int[][] board, int depth, int alpha, int beta){
        if(depth = 0){
          return eval(board);
        }
        else{
          int[][][] moves = board.getMoves();
          int[] values = new int[board];
          for(int i = 0; i < moves.length;i++){
            values[i]=fork(board.apply(moves[i]), depth-1);
          }
          return min(values);
        }
    }
    public int maxfork(int[][] board, int depth, int alpha, int beta){
        if(depth = 0){
          return eval(board);
        }
        else{
          int[][][] moves = board.getMoves();
          int[] values = new int[board];
          for(int i = 0; i < moves.length;i++){
            values[i]=fork(board.apply(moves[i]), depth-1, alpha, beta);

          }
          return min(values);
        }
    }
}
