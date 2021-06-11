package control;

public interface State {

    void init();

    void enter();

    void exit();

    void update(String param);

    void processAI(String [] param, String dt);

    void render();
}
