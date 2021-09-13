package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;



/**
 * SILVA.java <BR>
 *
 * equipo 4;
 *
 *
 */
public class SILVA implements GLEventListener {
    static GL gl;
    static GLU glu;
static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new SILVA());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
               
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        glu=new GLU();
        gl=drawable.getGL();
        gl.glClearColor(0, 0, 0, 1);
        gl.glMatrixMode(gl.GL_PROJECTION);
        glu.gluOrtho2D(-500, 500, -250, 500);
    }
    public void display(GLAutoDrawable drawable) {   
        gl.glPointSize(2);
        gl.glColor3d(0, 255,0);
        gl.glPushMatrix();
        gl.glTranslated(-500, -231, 0);
        gl.glBegin(gl.GL_POINTS);
        for(int i=0;i<frame.getWidth();i++){
            for(int j=0;j<frame.getHeight()/30;j++)
        
            gl.glVertex2d(i, j*30);
        }
        for(int i=0;i<frame.getWidth()/30;i++){
            for(int j=0;j<frame.getHeight();j++)
        
            gl.glVertex2d(i*30, j);
        }
        gl.glEnd();
        gl.glPopMatrix();
      
        gl.glFlush();
    }    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }
}