package PaSkCode;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class PSysView {

    PSysView() {
    }

    // draw all particles in psm
    void draw(PSysModel psm, Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHints(new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON));
		g2d.setColor(Color.RED);
		g2d.fillOval(psm.pSystem.px-psm.pSystem.radius, psm.pSystem.py-psm.pSystem.radius, psm.pSystem.radius*2, psm.pSystem.radius*2);
    }

    // dump information on all particles in psm
    void dump(PSysModel psm, int lc) {
	    System.out.println("Frame " + lc);
	    System.out.println(psm.radius + " " + psm.px + " " + psm.py + " " + psm.velX + " " + psm.velY);
    }
}
