package PaSkCode;
import java.util.ArrayList;

public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
    private int bdWidth = 400;
    private int bdHeight = 300;
    private int radius;
    private int px = bdWidth/2;
    private int py = bdHeight/2;;
    private int velX;
    private int velY;
    
	static ArrayList <String> pList;
	
    PSysModel() {
		pList = new ArrayList <String>();
	// instantiate list of particles
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {
			radius = rad;
			px = x;
			py = y;
			velX = vx;
			velY = vy;
	    System.out.println("Added: " + rad + " " + px + " " + py);
    }


    // update state of each particle in list
    void update(int bw, int bh) {
    	px += velX;
    	py += velY;

    	if (px >= bw-radius && velX > 0) {
    	    velX = -velX;
    	}
    	else if (px < radius && velX < 0) {
    	    velX = -velX;
    	}

    	if (py >= bh-radius && velY > 0) {
    	    velY = -velY;
    	}
    	else if (py < radius && velY < 0) {
    	    velY = -velY;
    	}
    }
}
