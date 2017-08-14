package game;

public class Coordinate {

    private int x;
    private int y;
    private int timesHit;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
        timesHit = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void Hit(){
        timesHit++;
    }
    public int getTimesHit(){
        return timesHit;
    }
}
