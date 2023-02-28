package DesignPatterns.Behavioral.Memento;

public class GameMemento {
    private GameState _state;
    public GameMemento(GameState state)
    {
        _state = state;
    }
    public GameState GetState()
    {
        return _state;
    }

}
