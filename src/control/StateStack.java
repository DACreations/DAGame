package control;
import java.util.Iterator;
import java.util.Stack;
import control.State;

public class StateStack {

    private Stack<State> stack;

    public StateStack(){
        stack = new Stack<>();
    }

    public void update(float dt){
        stack.peek().update(dt);
    }

    public void processAI(String [] params, String dt) {
        stack.peek().processAI();
    }

    public void render(){
        for (State state : stack) {
            state.render();
        }
    }

    public void clear() {
        stack.clear();
    }

    public void push(State state) {
        stack.push(state);
        stack.peek().enter();
    }

    public void pop() {
        stack.pop().exit();
    }
}