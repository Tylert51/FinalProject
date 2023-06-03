import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Tile {

    private ArrayList<String> availableMoves;
    private BufferedImage image;
    private ArrayList<Rectangle> collisionArea;
    private boolean colliding;


    public Tile(String fileName) {

        try {
            image = ImageIO.read(getClass().getResourceAsStream(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        collisionArea = new ArrayList<>();

    }

    public ArrayList<String> getAvailableMoves() {
        return availableMoves;
    }

    public BufferedImage getImage() {

        return image;

    }

    public void addAvailableMoves(Rectangle ... hitBoxes) {

        collisionArea.addAll(Arrays.asList(hitBoxes));

    }

    public ArrayList<Rectangle> getCollisionArea() {
        return collisionArea;
    }


}
