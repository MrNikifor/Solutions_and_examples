package oop.exemple;

public class ObjectOrientedPiracy {
    private final double draft;
    private final int crew;

    public ObjectOrientedPiracy(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }
    public Boolean isWorthIt(){
        if((draft - crew * 1.5) > 20){
            return true;
        }else {
            return false;
        }
    }
}
