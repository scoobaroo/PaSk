package PaSkCode;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.ArrayList;

public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
    private int bdWidth = 400;
    private int bdHeight = 300;
    private int radius = 10;
    private int px;
    private int py;
    private int velX;
    private int velY;
	static ArrayList <String> pList;
	
    PSysModel() {
		ArrayList<String> pList = new ArrayList<String>();
		
		px = bdWidth/2;
		py = bdHeight/2;
	// instantiate list of particles
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {

    	for (int i=1; i<pList.size(); i++) {
		    if (i==1) {
			radius = rad;
			px = x;
			py = y;
			velX = vx;
			velY = vy;
		    }
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
