package PaSkCode;

public class Particle {
	protected int bdWidth = 400;
	protected int bdHeight = 300;
	protected int radius = 10;
    protected int px = bdWidth/2;
    protected int py = bdHeight/2;;
    protected int velX;
    protected int velY;
    
    public Particle(int rad, int x, int y, int vx, int vy){
    	this.radius= rad;
    	this.px = x;
    	this.py = y;
    	this.velX = vx;
    	this.velY = vy;
    }
    public int rad(){
    	return this.radius;
    }
    public int px(){
    	return this.px;
    }
    public int py(){
    	return this.py;
    }
    public int velX(){
    	return this.velX;
    }
    public int velY(){
    	return this.velY;
    }   
}
