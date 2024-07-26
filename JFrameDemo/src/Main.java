import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            // the first
           // AlgoFrame frame = new AlgoFrame("Welcome", 800, 600);
            // the second
            AlgoFrame frame = new AlgoFrame("Welcome");
        });
    }
}