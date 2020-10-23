package hw4;

public class Dice {
	
	/* throwDice
	 * 랜덤으로 주사위를 굴림
	 * @return - 랜덤 주사위 수 */
	public int throwDice() {
		int dice_number = (int) Math.floor(Math.random()*6)+1;
		return dice_number;
	}
	
	/* p1Win
	 * player1이 승리
	 * @param - 각 플레이어 이름, 플레이어 별 주사위 수
	 * @return - 플레이어별 주사위 수, 승자정보 (player1) */
	public String p1Win(String player1, int p1_first, int p1_second, String player2, int p2_first, int p2_second) {
		String result = player1+"님의 주사위 : "+p1_first+", "+p1_second+"\n"+
				player2+"님의 주사위 : "+p2_first+", "+p2_second+"\n"+
				"* Winner : "+player1;
		return result;
	}
	
	/* p2Win
	 * player2가 승리
	 * @param - 각 플레이어 이름, 플레이어 별 주사위 수
	 * @return - 플레이어별 주사위 수, 승자정보 (player2) */
	public String p2Win(String player1, int p1_first, int p1_second, String player2, int p2_first, int p2_second) {
		String result = player1+"님의 주사위 : "+p1_first+", "+p1_second+"\n"+
				player2+"님의 주사위 : "+p2_first+", "+p2_second+"\n"+
				"* Winner : "+player2;
		return result;
	}
	
	/* draw
	 * 비김
	 * @param - 각 플레이어 이름, 플레이어 별 주사위 수
	 * @return - 플레이어별 주사위 수, draw */
	public String draw(String player1, int p1_first, int p1_second, String player2, int p2_first, int p2_second) {
		String result = player1+"님의 주사위 : "+p1_first+", "+p1_second+"\n"+
						player2+"님의 주사위 : "+p2_first+", "+p2_second+"\n"+
						"* draw";
		return result;
	}
	
	
	/* battle
	 * 랜덤 주사위를 통해 대결
	 * @param player1 - 플레이어1
	 * @param player2 - 플레이어2
	 * @return - 게임 정보와 승리 이유 출력*/
	public String battle(String player1, String player2) {
		int p1_first = throwDice();
		int p1_second = throwDice();		
		int p2_first = throwDice();
		int p2_second = throwDice();
				
		if (p1_first==p1_second && p2_first==p2_second) {
			if(p1_first>p2_first) {
				return p1Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 더 큰 같은 수";
			} else if (p1_first<p2_first) {
				return p2Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 더 큰 같은 수";
			} else {
				return draw(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 모두 같은 수";
			}
		} else if (p1_first == p1_second) {
			return p1Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 같은 수";
		} else if (p2_first == p2_second) {
			return p2Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 같은 수";
		} else {
			if(p1_first+p1_second>p2_first+p2_second) {
				return p1Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 더 큰 합";
			} else if (p1_first+p1_second<p2_first+p2_second) {
				return p2Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 더 큰 합";
			} else {
				if(Math.abs(p1_first - p1_second) > Math.abs(p2_first - p2_second)) {
					return p2Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 같은 합, 더 작은 차이 ";
				} else if (Math.abs(p1_first - p1_second) < Math.abs(p2_first - p2_second)) {
					return p1Win(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 같은 합, 더 작은 차이";
				} else {
					return draw(player1, p1_first, p1_second, player2, p2_first, p2_second)+"\n* 같은 합, 같은 차이";
				}
			}
		}
	}
}
