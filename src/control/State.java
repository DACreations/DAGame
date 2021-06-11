package control;

public interface State {

    void init();

    void enter();

    void exit();

    void update();

    void processAI();

    void render();
}
