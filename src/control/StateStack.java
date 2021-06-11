package control;
import java.util.Stack;

public class StateStack {

    private Stack<State> stack;

    public StateStack(){
        stack = new Stack<>();
    }

    void update(String dt){
        stack.peek().update();
    }

    void processAI(String [] params, String dt) {
        stack.peek().processAI();
    }

    void clear() {
        stack.clear();
    }

    void push(State state) {
        stack.push(state);
        stack.peek().enter();
    }

    void pop() {
        stack.pop().exit();
    }
}