package fakemon;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class TestResolution {

    public static int [] display() {
        GLFW.glfwInit();
        // Get the number of the screen device
        long monitor = GLFW.glfwGetPrimaryMonitor();
        // Get the resolution object
        GLFWVidMode.Buffer modes = GLFW.glfwGetVideoModes(monitor);
        // Traverse loop resolution
//        while (modes.hasRemaining()) {
//            GLFWVidMode mode = modes.get();
//            System.out.printf("%sx%s, %sHz red %s, green %s, blue %s %n", mode.width(), mode.height(), mode.refreshRate(), mode.redBits(), mode.greenBits(), mode.blueBits());
//        }
        // Get the current resolution
        GLFWVidMode mode = GLFW.glfwGetVideoMode(monitor);
        System.out.printf("%sx%s, %sHz red %s, green %s, blue %s %n", mode.width(), mode.height(), mode.refreshRate(), mode.redBits(), mode.greenBits(), mode.blueBits());
        return new int []{mode.width(), mode.height(), mode.refreshRate(), mode.redBits(), mode.greenBits(), mode.blueBits()};
    }
}
