package control;

public interface StateStack {

    void init();

    void update();

    void processAI();

    void clear();

    void push();

    void pop();
}
