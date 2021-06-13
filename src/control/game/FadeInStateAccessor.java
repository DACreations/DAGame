package control.game;

import aurelienribon.tweenengine.TweenAccessor;

public class FadeInStateAccessor implements TweenAccessor<FadeInState> {

    public static final int R = 1;
    public static final int G = 2;
    public static final int B = 3;
    public static final int RG = 4;
    public static final int RB = 5;
    public static final int GB = 6;
    public static final int RGB = 7;

    @Override
    public int getValues(FadeInState fadeInState, int i, float[] floats) {
        switch (i) {
            case 1 -> {
                floats[0] = fadeInState.getR();
                return 1;
            }
            case 2 -> {
                floats[0] = fadeInState.getG();
                return 1;
            }
            case 3 -> {
                floats[0] = fadeInState.getB();
                return 1;
            }
            case 4 -> {
                floats[0] = fadeInState.getR();
                floats[1] = fadeInState.getG();
                return 2;
            }
            case 5 -> {
                floats[0] = fadeInState.getR();
                floats[1] = fadeInState.getB();
                return 2;
            }
            case 6 -> {
                floats[0] = fadeInState.getG();
                floats[1] = fadeInState.getB();
                return 2;
            }
            case 7 -> {
                floats[0] = fadeInState.getR();
                floats[1] = fadeInState.getG();
                floats[2] = fadeInState.getB();
                return 3;
            }
            default -> {
                assert false;
                return -1;
            }
        }
    }

    @Override
    public void setValues(FadeInState fadeInState, int i, float[] floats) {
        switch (i) {
            case 1:
                fadeInState.setR(floats[0]);
                break;
            case 2:
                fadeInState.setG(floats[0]);
                break;
            case 3:
                fadeInState.setB(floats[0]);
                break;
            case 4:
                fadeInState.setR(floats[0]);
                fadeInState.setG(floats[1]);
                break;
            case 5:
                fadeInState.setR(floats[0]);
                fadeInState.setB(floats[1]);
                break;
            case 6:
                fadeInState.setG(floats[0]);
                fadeInState.setB(floats[1]);
                break;
            case 7:
                fadeInState.setR(floats[0]);
                fadeInState.setG(floats[1]);
                fadeInState.setB(floats[2]);
                break;
            default:
                assert false; break;
        }
    }
}
