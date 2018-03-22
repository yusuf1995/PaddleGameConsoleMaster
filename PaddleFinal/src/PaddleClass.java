//ONUR SABIT SALMAN - 150114501
//YUSUF YALCIN - 150113060

public class PaddleClass {
	
	int x,y;
	public PaddleClass(int[][] map){
		for(int i = 0 ; i < 60 ; i++)
			for(int j = 0 ; j < 120 ; j++)
				if(map[i][j] == 1){
					x = i;
					y = j; }
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}
