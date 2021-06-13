package control;

public interface State {

//    void init();

    void enter();

    void exit();

    void update(float dt);

    void processAI();

    void render();
}
