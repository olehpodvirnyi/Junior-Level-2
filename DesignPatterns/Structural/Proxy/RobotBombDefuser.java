package DesignPatterns.Structural.Proxy;

import java.util.Random;

public class RobotBombDefuser {
    private Random _random = new Random();
    private int _robotConfiguredWavelength = 41;
    private boolean _isConnected = false;

    public void ConnectWireless(int communicationWaveLength) {
        if (communicationWaveLength == _robotConfiguredWavelength) {
            _isConnected = IsConnectedImmitatingConnectivitiyIssues();
        }
    }

    public boolean IsConnected() {
        _isConnected = IsConnectedImmitatingConnectivitiyIssues();
        return _isConnected;
    }

    private boolean IsConnectedImmitatingConnectivitiyIssues() {
        // Імітуємо погане з’єднання (працює в 4 із 10 спробах)
        return _random.nextInt(0, 10) < 7;
    }

    public void WalkStraightForward(int steps) throws BadConnectionException {
        System.out.println("Did " + steps + " steps forward...");
    }

    public void TurnRight() throws BadConnectionException {
        System.out.println("Turned right...");
    }

    public void TurnLeft() throws BadConnectionException {
        System.out.println("Turned left...");
    }

    public void DefuseBomb() throws BadConnectionException {
        System.out.println("Cut red or green or blue wire...");
    }

}
