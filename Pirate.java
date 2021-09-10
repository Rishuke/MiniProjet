public class Pirate{
	private int x;
	private int y;
	
	public double distance(int x, int y){
		return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
	}
	
	public void seDeplacer(int xnew,int ynew){
		this.x = xnew;
		this.y = ynew;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
}
