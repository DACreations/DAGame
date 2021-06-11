package control;

public interface State {

    void init();

    void enter();

    void exit();

    void update(Param param);

    void render();
}
