package PaSkCode;

public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
	double px;
	double py;
	double velX;
	double velY;
	int radius;
	
	static ArrayList <String> pList
	
    PSysModel() {
		ArrayList<String> pList = new ArrayList<String>();
	// instantiate list of particles
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {
	    if (i==1) {
		radius = rad;
		px = x;
		py = y;
		velX = vx;
		velY = vy;
	    }
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
