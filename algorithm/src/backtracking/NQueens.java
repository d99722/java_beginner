package backtracking;

public class NQueens {
	
    private int N;      //N*N할때의 N;
    private int cols[]; //i행에 들어갈 퀸의 좌표.
	     
    public NQueens(int N){
        this.N=N;
        cols = new int[N];
    }
	     	
	public void back_tracking(int level){
        if(level == N){
            for(int i=0;i<N;i++){
                System.out.print(cols[i]+1);
            }
            System.out.println("");
        }
        else{
            for(int i=0;i<N;i++){//퀸을 0번부터 N-1번까지 놓는 경우를 전부 따져본다.
                cols[level]=i; //퀸을 i에 놓는다.
                if(isPossible(level)){//퀸을 i에 놓은것이 가능한가?
                    back_tracking(level+1); //그렇다면 퀸을 그 자리에 넣고 다음 행으로 진입
                     
                }
            }
        }
         
    }
	
	public boolean isPossible(int level){
	    for(int i=0;i<level;i++){	         
	        if(cols[i]==cols[level] || Math.abs(level-i)== Math.abs(cols[level]-cols[i])){
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		NQueens n = new NQueens(4);
		n.back_tracking(0);
	}




}
