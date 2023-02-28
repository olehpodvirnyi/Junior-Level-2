package DesignPatterns.Behavioral.Memento;

public class GameState {
    public int Health;
    public int KilledMonsters;

    public GameState(int Health, int KilledMonsters) {
        this.Health = Health;
        this.KilledMonsters = KilledMonsters;
    }

    @Override
    public String toString() {
        return "Health: " + Health + ",killed = " + KilledMonsters + "\n";
    }
}
