//ONUR SABIT SALMAN - 150114501
//YUSUF YALCIN - 150113060

public class ShapeClass {
	
	public ShapeClass(int[][] map){
		
		for(int i = 0 ; i < 60 ; i++){
			for(int j = 0 ; j < 120 ; j++){
				
				//space
				if(map[i][j] == 0){
					System.out.print(" ");
				}
				//paddle
				else if(map[i][j]==1){
					char c=0x256C;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//ball
				else if(map[i][j]==2){
					System.out.print("O");
				}
				//left edge
				else if(map[i][j] == 3){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//top edge
				else if(map[i][j] == 4){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//bottom edge
				else if(map[i][j] == 5){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//right edge
				else if(map[i][j] == 6){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				
				int blue = map[i][j] % 10;
				int red = map[i][j] % 10;
				
				//blue brick
				if(blue == 7){
					String c = "B";
					System.out.print(c);
				}
				
				//red brick	
				else if(red == 8){
					String c = "R";
					System.out.print(c);
				}
				
				//brackets
				else if(map[i][j]>6){
					char c=0x2592;
					String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}	
			}
			
			System.out.println();
		}
	}
	public void shapep(int[][] map){
		
		for(int i = 0 ; i < 60 ; i++){
			for(int j = 0 ; j < 120 ; j++){
				//space
				if(map[i][j] == 0){
					System.out.print(" ");
				}
				//paddle
				else if(map[i][j]==1){
					char c=0x256C;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//ball
				else if(map[i][j]==2){
				    System.out.print("O");
				}
				//left edge
				else if(map[i][j] == 3){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//top edge
				else if(map[i][j] == 4){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//bottom edge
				else if(map[i][j] == 5){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				//right edge
				else if(map[i][j] == 6){
					char c=0x2588;
				    String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}
				
				int blue = map[i][j] % 10;
				int red = map[i][j] % 10;
				
				//blue brick
				if(blue == 7){
					String c = "B";
					System.out.print(c);
				}
				
				//red brick	
				else if(red == 8){
					String c = "R";
					System.out.print(c);
				}
				
				//brackets
				else if(map[i][j]>6){
					char c=0x2592;
					String temp =new String(Character.toChars(c));
				    System.out.print(temp);
				}	
			}
			
			System.out.println();
		}
	}
}
