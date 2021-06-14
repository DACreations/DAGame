package control.game;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.TweenCallback;
import control.State;
import engine.KeyListener;
import engine.Window;

import java.awt.*;

import static org.lwjgl.opengl.GL11.*;

import static org.lwjgl.glfw.GLFW.*;

public class StartState implements State {

    public StartState(){
        System.out.println("Starting...");
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
        if (KeyListener.isKeyPressed(GLFW_KEY_ENTER)){
            Window.get().gStateStack.pop();
            Window.get().gStateStack.push(new FadeInState(0.73f, 0.73f, 0.73f, 1, 1f,
                    (i, baseTween) -> {
                        Window.get().gStateStack.pop();
                        Window.get().gStateStack.push(new PlayState());
                        Window.get().gStateStack.push(new DialogState("Welcome to the world of 50Mon! To start fighting monsters with your own randomly assigned " +
                                        "monster, just walk in the tall grass! If you need to heal, just press 'P' in the field! " +
                                "Good luck! (Press Enter to dismiss dialogues)"));
                        Window.get().gStateStack.push(new FadeOutState(0.73f, 0.73f, 0.73f, 1, 1f, (i1, baseTween1) -> {
                            Window.get().gStateStack.pop();
                        }));
                    }
            ));
        }
    }

    @Override
    public void processAI() {
        return;
    }

    @Override
    public void render() {
        glClearColor(0.73f, 0.73f, 0.73f, 1);
    }
}