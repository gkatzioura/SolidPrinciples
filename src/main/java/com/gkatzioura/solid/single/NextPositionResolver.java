package com.gkatzioura.solid.single;

public class NextPositionResolver {

    public Position resolve(Position position,Direction direction) {

        switch (direction) {
            case N:
                return new Position(position.getxAxis(),position.getyAxis()+1);
            case S:
                return new Position(position.getxAxis(),position.getyAxis()-1);
            case W:
                return new Position(position.getxAxis()-1,position.getyAxis());
            case E:
                return new Position(position.getxAxis()+1,position.getyAxis());
            default:
                throw new IllegalArgumentException();
        }
    }

}
