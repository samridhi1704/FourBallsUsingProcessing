import processing.core.PApplet;

public class FourBallsUsingProcessing extends PApplet {

    private static final int WIDTH = 1200 , HEIGHT = 700 ,DIAMETER = 30 ,NO_OF_BALLS = 4;
    private static final int[] heightForBalls = {(HEIGHT * 1) / 5, (HEIGHT * 2) / 5, (HEIGHT * 3) / 5, (HEIGHT * 4) / 5};
    private static final float[] speeds = {1,2,3,4};
    private int[] ball_X = new int[NO_OF_BALLS];

    public static void main(String[] args) {
        PApplet.main("FourBallsUsingProcessing",args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        // Initialize the X-coordinate of each ball
        for (int i = 0; i < NO_OF_BALLS; i++)
        {
            ball_X[i] = 0; // Start each ball from the left edge of the window
        }

    }

    @Override
    public void draw() {
       // super.draw();
      for (int i = 0; i < NO_OF_BALLS; i++) {
            ball_X[i] += speeds[i];
            ellipse(ball_X[i], heightForBalls[i], DIAMETER, DIAMETER);
        }

    }
}