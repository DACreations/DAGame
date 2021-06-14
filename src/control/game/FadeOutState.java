package control.game;

import aurelienribon.tweenengine.Tween;

import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenManager;
import control.State;

import static org.lwjgl.opengl.GL11.glClearColor;

public class FadeOutState implements State {

    private TweenManager manager = new TweenManager();
    private Float a, r, g, b;
    private float time;
    private TweenCallback callback;

    public FadeOutState(float r, float g, float b, float a, float time, TweenCallback callback) {
        System.out.println("Fading in");
        this.a = a;
        this.r = 1f;
        this.g = 1f;
        this.b = 1f;
        this.time = time;
        this.callback = callback;
        Tween.registerAccessor(FadeOutState.class, new FadeOutStateAccessor());
        Tween.to(this, FadeOutStateAccessor.RGB, time).target(r, g, b).start(manager);
    }

    public Float getB() {
        return b;
    }

    public Float getG() {
        return g;
    }

    public Float getR() {
        return r;
    }

    public void setB(Float b) {
        this.b = b;
    }

    public void setG(Float g) {
        this.g = g;
    }

    public void setR(Float r) {
        this.r = r;
    }

    @Override
    public void enter() {
        return;
    }

    @Override
    public void exit() {
        return;
    }

    @Override
    public void update(float dt) {
        manager.update(dt);
    }

    @Override
    public void processAI() {
        return;
    }

    @Override
    public void render() {
        glClearColor(r, g, b, a);
    }
}
