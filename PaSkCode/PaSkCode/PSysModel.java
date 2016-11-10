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
    int[] pxArray = new int[5];
    int[] pyArray = new int[5];
    int[] velXArray = new int[5];
    int[] velYArray = new int[5];
    int[] radiusArray = new int[5];
    PSysModel pSystem;
    
	static protected ArrayList <String> pList;
	protected ArrayList <Particle> particleList;
	
    PSysModel() {
    	particleList = new ArrayList<Particle>();
    	pList = ParticleSkeleton.pList;
    	for(int i=1; i< pList.size(); i++){
    		String [] tokens = pList.get(i).split(" ");
    	    int rad = (int) (Double.parseDouble(tokens[0]) * bdWidth);
    	    int npx = (int) (Double.parseDouble(tokens[1]) * bdWidth);
    	    int npy = (int) (Double.parseDouble(tokens[2]) * bdHeight);
    	    int nvx = (int) (Double.parseDouble(tokens[3]) * bdWidth);
    	    int nvy = (int) (Double.parseDouble(tokens[4]) * bdHeight);
    	    Particle element = new Particle(rad, npx, npy, nvx, nvy);
    	    particleList.add(element);
    	}
//	 instantiate list of particles
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {
	    Particle element = new Particle(rad, x, y, vx, vy);
	    particleList.add(element);
	    System.out.println("Added: " + rad + " " + px + " " + py);
    }


    // update state of each particle in list
    void update(int bw, int bh) {
    	for(int i=0;i < particleList.size() ; i++){
	    	particleList.get(i).px += particleList.get(i).velX;
	    	particleList.get(i).py += particleList.get(i).velY;
	
	    	if (particleList.get(i).px >= bw-particleList.get(i).radius && particleList.get(i).velX > 0) {
	    		particleList.get(i).velX = -particleList.get(i).velX;
	    	}
	    	else if (particleList.get(i).px < particleList.get(i).radius && particleList.get(i).velX < 0) {
	    		particleList.get(i).velX = -particleList.get(i).velX;
	    	}
	
	    	if (particleList.get(i).py >= bh-particleList.get(i).radius && particleList.get(i).velY > 0) {
	    		particleList.get(i).velY = -particleList.get(i).velY;
	    	}
	    	else if (particleList.get(i).py < particleList.get(i).radius && particleList.get(i).velY < 0) {
	    		particleList.get(i).velY = -particleList.get(i).velY;
	    	}
    	}
    }
}
