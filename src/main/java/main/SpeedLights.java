package main;

public class SpeedLights {

    private final int speedLimit;

    public SpeedLights(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public String showLight(int currentSpeed) {
        if (currentSpeed <= speedLimit) {
            return "green";
        } else if ((currentSpeed - speedLimit) <= 20){
            return "yellow";
        } else {
            return "red";
        }
    }
}
