public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }
    public float[] getSpeed() {
        return new float[] {this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+") speed = " +"("+getxSpeed()+","+getySpeed()+")";
    }
    public Point2D move() {
        setX(super.getX()+getxSpeed());
        setY(super.getY()+getySpeed());
        return this;
    }
}
