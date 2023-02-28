package DesignPatterns.Behavioral.Memento;

import java.util.Stack;

public class Caretaker {
    private GameOriginator _game = new GameOriginator();
    private Stack<GameMemento> _quickSaves = new Stack();

    public void ShootThatDumbAss() {
        _game.Play();
    }

    public void F5() {
        _quickSaves.push(_game.GameSave());
    }

    public void F9() {
        _game.LoadGame(_quickSaves.pop());
    }

}
