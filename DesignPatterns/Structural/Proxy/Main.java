package DesignPatterns.Structural.Proxy;

public class Main {
    public static void main(String[] args) throws BadConnectionException {
        int opNum = 0;
        try {
            var proxy = new RobotBombDefuserProxy(41);
            proxy.WalkStraightForward(100);
            opNum++;
            proxy.TurnRight();
            opNum++;
            proxy.WalkStraightForward(5);
            opNum++;
            proxy.DefuseBomb();
            opNum++;
            System.out.println();
        } catch (BadConnectionException e) {
            System.out.println("Exception has been caught with message: (" + e.getMessage() + ")." +
                    "Decided to have human operate robot there.\n");
            PlanB(opNum);
        }
    }

    private static void PlanB(int nextOperationNum) throws BadConnectionException {
        RobotBombDefuser humanOperatingRobotDirectly = new RobotBombDefuser();
        if (nextOperationNum == 0) {
            humanOperatingRobotDirectly.WalkStraightForward(100);
            nextOperationNum++;
        }
        if (nextOperationNum == 1) {
            humanOperatingRobotDirectly.TurnRight();
            nextOperationNum++;
        }
        if (nextOperationNum == 2) {
            humanOperatingRobotDirectly.WalkStraightForward(5);
            nextOperationNum++;
        }
        if (nextOperationNum == 3) {
            humanOperatingRobotDirectly.DefuseBomb();
        }
    }
}