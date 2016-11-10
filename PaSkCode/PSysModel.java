package PaSkCode;
import java.util.ArrayList;
public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
    protected int bdWidth = 400;
    protected int bdHeight = 300;
    protected int radius = 10;
    protected int px = bdWidth/2;
    protected int py = bdHeight/2;;
    protected int velX;
    protected int velY;
    
    PSysModel pSystem;
    
	static protected ArrayList <String> pList;
	protected ArrayList <PSysModel> particleList;
	
    PSysModel() {
    	pList = new ArrayList <String>();
    	for(int i=1; i<=pList.size(); i++){
    		String [] tokens = pList.get(i).split(" ");
    	    int rad = (int) (Double.parseDouble(tokens[0]) * bdWidth);
    	    int npx = (int) (Double.parseDouble(tokens[1]) * bdWidth);
    	    int npy = (int) (Double.parseDouble(tokens[2]) * bdHeight);
    	    int nvx = (int) (Double.parseDouble(tokens[3]) * bdWidth);
    	    int nvy = (int) (Double.parseDouble(tokens[4]) * bdHeight);
    	    PSysModel element = new PSysModel();
    	    element.radius = rad;
    	    element.px = npx;
    	    element.py = npy;
    	    element.velX = nvx;
    	    element.velY = nvy;
    	    pSystem.add(rad, npx, npy, nvx, nvy);
    	    particleList.add(element);
    	}
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
