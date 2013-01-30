package Abalone;

class MiniMax{
    public int eval(int[][] board){
      return 1;
    }

    public int fork(int[][] board, int depth){
        if(depth = 0){
          return eval(board);
        }
        else{
          int[][][] moves = board.getMoves();
          int[] values = new int[board];
          for(int i = 0; i < moves.length;i++){
            values[i]=fork(board.apply(moves[i]), depth-1);
          }
          if(depth%2==0){ return max values;
          }
          else{ return min(values);
          }
        }
    }
}
