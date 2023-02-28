package DesignPatterns.Structural.Proxy;

public class RobotBombDefuserProxy extends RobotBombDefuser {
    private RobotBombDefuser _robotBombDefuser;
    private int _communicationWaveLength;
    private int _connectionAttempts = 3;

    public RobotBombDefuserProxy(int communicationWaveLength) {
        _robotBombDefuser = new RobotBombDefuser();
        _communicationWaveLength = communicationWaveLength;
    }

    @Override
    public void WalkStraightForward(int steps) throws BadConnectionException {
        EnsureConnectedWithRobot();
        _robotBombDefuser.WalkStraightForward(steps);
    }

    @Override
    public void TurnRight() throws BadConnectionException {
        EnsureConnectedWithRobot();
        _robotBombDefuser.TurnRight();
    }

    @Override
    public void TurnLeft() throws BadConnectionException {
        EnsureConnectedWithRobot();
        _robotBombDefuser.TurnLeft();
    }

    @Override
    public void DefuseBomb() throws BadConnectionException {
        EnsureConnectedWithRobot();
        _robotBombDefuser.DefuseBomb();
    }

    private void EnsureConnectedWithRobot() throws BadConnectionException {
        if (_robotBombDefuser == null) {
            _robotBombDefuser = new RobotBombDefuser();
            _robotBombDefuser.ConnectWireless(_communicationWaveLength);
        }
        for (int i = 0; i < _connectionAttempts; i++) {
            if (_robotBombDefuser.IsConnected() != true) {
                _robotBombDefuser.ConnectWireless(_communicationWaveLength);
            } else {
                break;
            }
        }
        if (_robotBombDefuser.IsConnected() != true) {
            throw new BadConnectionException("No connection with remote bomb diffuser robot could be made after few attempts.");
        }
    }
}