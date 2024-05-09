import processing.core.PApplet;

public class FourBallsUsingOops extends PApplet {

    private static final int WIDTH = 1200, HEIGHT = 700, DIAMETER = 30, NO_OF_BALLS = 4;
    private Ball[] balls = new Ball[NO_OF_BALLS];

    public static void main(String[] args) {
        PApplet.main("FourBallsUsingOops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        for (int i = 0; i < NO_OF_BALLS; i++) {
            balls[i] = new Ball(0, (HEIGHT * (i + 1)) / 5, i + 1);
        }
    }

    @Override
    public void draw(){
        for (Ball x : balls) {
            x.move();
            x.display();
        }
    }

    class Ball {
        private float x;
        private float y;
        private float speed;

        public Ball(float x, float y, float speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }

        public void move() {
            x += speed;

        }

        public void display() {
            ellipse(x, y, DIAMETER, DIAMETER);
        }
    }
}
