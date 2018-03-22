//ONUR SABIT SALMAN - 150114501
//YUSUF YALCIN - 150113060

public class BallClass {
	int x,y;
	int direction ;
	public static int speed = 2;
	
	public BallClass(int[][] map,int direction){
		
		this.direction=direction;
		for(int i = 0 ; i < 60 ; i++)
			for(int j = 0 ; j < 120 ; j++)
				if(map[i][j] == 2){
					x = i;
					y = j; }

		//left-up
		if(direction==1){  
		
			map[x][y] = 2;
			//map[x-speed][y-speed] = 2;
			
		}
		
		//right-up
		else if(direction==2){  
			
			map[x][y] = 2;
			//map[x-speed][y+speed] = 2;
			
		}
		
		//left-down
		else if(direction==3){  
			
			map[x][y] = 0;
			map[x+speed][y-speed] = 2;	
			
		}
		
		//right-down
		else if(direction==4){

			map[x][y] = 0;
			map[x+speed][y+speed] = 0;

		}
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
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getDirection() {
		return direction;
	}
	public void move(int[][] map,int direction){
		
		
		this.direction = direction;
		for(int i = 0 ; i < 60 ; i++)
			for(int j = 0 ; j < 120 ; j++)
				if(map[i][j] == 2){
					x = i;
					y = j; }
		
		//left-up
		if(this.direction==1){  
			
			if((map[x-speed][y-speed] == 3) || (map[x-1][y-1] == 3)){
				if(map[x-speed][y-speed] == 3){
					map[x][y] = 0;
					map[x-1][y-1] = 2;
				}
				this.direction = 2;
				
			}
			else if((map[x-speed][y-speed] == 4) || (map[x-1][y-1] == 4)){
				if(map[x-speed][y-speed] == 4){
					map[x][y] = 0;
					map[x-1][y-1] = 2;
				}
				this.direction = 3;
				
			}
			else if((map[x-speed][y-speed] > 6) || (map[x-1][y-1] > 6)){
				if(map[x-speed][y-speed] > 6 && (map[x-1][y-1] == 0)){
					map[x][y] = 0;
					map[x-1][y-1] = 2;
				}
				this.direction = 3;
				
			}
			
			
			if(this.direction == 1){
				map[x][y] = 0;
				map[x-speed][y-speed] = 2;
			
			}	
		}
		
		//right-up
		else if(this.direction==2){
			
			if((map[x-speed][y+speed] == 6) || (map[x-1][y+1] == 6)){
				if(map[x-speed][y+speed] == 6){
					map[x][y] = 0;
					map[x-1][y+1] = 2;
				}
				this.direction = 1;
			}
			else if((map[x-speed][y+speed] == 4) || (map[x-1][y+1] == 4)){
				if(map[x-speed][y+speed] == 4){
					map[x][y] = 0;
					map[x-1][y+1] = 2;
				}
				this.direction = 4;
			}
			else if((map[x-speed][y+speed] > 6) || (map[x-1][y+1] > 6)){
				if(map[x-speed][y+speed] > 6 && (map[x-1][y-1] == 0)){
					map[x][y] = 0;
					map[x-1][y+1] = 2;
				}
				this.direction = 4;
			}
			
			if(this.direction == 2){
				map[x][y] = 0;
				map[x-speed][y+speed] = 2;
			
			}
		}
		
		//left-down
		else if(this.direction==3){
			
			if((map[x+speed][y-speed] == 3) || (map[x+1][y-1] == 3)){
				if(map[x+speed][y-speed] == 3){
					map[x][y] = 0;
					map[x+1][y-1] = 2;
				}
				this.direction = 4;
			}
			else if((map[x+speed][y-speed] == 5) || (map[x+1][y-1] == 5)){
				if(map[x+speed][y-speed] == 5){
					map[x][y] = 0;
					map[x+1][y-1] = 2;
				}
				this.direction = 0;
			}
			else if((map[x+speed][y-speed] == 1) || (map[x+1][y-1] == 1)){
				if(map[x+speed][y-speed] == 1){
					map[x][y] = 0;
					map[x+1][y-1] = 2;
				}
				this.direction = 1;
			}
			else if((map[x+speed][y-speed] > 6) || (map[x+1][y-1] > 6)){
				if(map[x+speed][y-speed] > 6 && (map[x-1][y-1] == 0)){
					map[x][y] = 0;
					map[x+1][y-1] = 2;
				}
				this.direction = 1;
			}
			
			if(this.direction == 3){
				map[x][y] = 0;
				map[x+speed][y-speed] = 2;

			}
		}
		
		//right-down
		else if(this.direction==4){
			
			if((map[x+speed][y+speed] == 6) || (map[x+1][y+1] == 6)){
				if(map[x+speed][y+speed] == 6){
					map[x][y] = 0;
					map[x+1][y+1] = 2;
				}
				this.direction = 3;
			}
			else if((map[x+speed][y+speed] == 5) || (map[x+1][y+1] == 5)){
				if(map[x+speed][y+speed] == 5){
					map[x][y] = 0;
					map[x+1][y+1] = 2;
				}
				this.direction = 0;
			}
			else if((map[x+speed][y+speed] == 1) || (map[x+1][y+1] == 1)){
				if(map[x+speed][y+speed] == 1){
					map[x][y] = 0;
					map[x+1][y+1] = 2;
				}
				this.direction = 2;
			}
			else if((map[x+speed][y+speed] > 6) || (map[x+1][y+1] > 6)){
				if(map[x+speed][y+speed] > 6 && (map[x-1][y-1] == 0)){
					map[x][y] = 0;
					map[x+1][y+1] = 2;
				}
				this.direction = 2;
			}
			
			if(this.direction == 4){
				map[x][y] = 0;
				map[x+speed][y+speed] = 2;

			}
		}	
	}
}
