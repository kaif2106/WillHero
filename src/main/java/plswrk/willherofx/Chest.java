package plswrk.willherofx;

import javafx.animation.SequentialTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Chest{
    private boolean isOpen;
    private double curr_pos_x;
    private double curr_pos_y;
    private List<Image> imageList;
    private ImageView image;
    Chest(List<Image> imageList, double start_pos_x, double start_pos_y) {
        image = new ImageView();
        this.imageList = imageList;
        curr_pos_x = start_pos_x;
        curr_pos_y = start_pos_y;
        isOpen = false;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public ImageView getImage() {
        return image;
    }

    public void open() throws URISyntaxException {
        isOpen = true;
            for (Image value : imageList) {
            image.setImage(value);
        }
//        Image transition_image1 = new Image("file:src/main/resources/images/wep_0001 #18659.png");
//        Image transition_image2 = new Image("file:src/main/resources/images/wep_0002 #18442.png");
//        Image transition_image3 = new Image("file:src/main/resources/images/wep_0003.png");
//        Image transition_image4 = new Image("file:src/main/resources/images/wep_0004 #36957.png");
//        Image transition_image5 = new Image("file:src/main/resources/images/wep_0005 #37946.png");
//        Image transition_image6 = new Image("file:src/main/resources/images/wep_0006 #42713.png");
//        Image transition_image7 = new Image("file:src/main/resources/images/wep_0007 #45764.png");
//        Image transition_image8 = new Image("file:src/main/resources/images/wep_0008 #32756.png");
//        Image transition_image9 = new Image("file:src/main/resources/images/wep_0009 #50124.png");
//        Image transition_image10 = new Image("file:src/main/resources/images/wep_0010 #21871.png");
//        SequentialTransition sequentialTransition = new SequentialTransition(this.getImage(),transition_image1);
    }
    public boolean getIsOpen(){
        return isOpen;
    }

    public double getCurr_pos_x() {
        return curr_pos_x;
    }

    public void setCurr_pos_x(double curr_pos_x) {
        this.curr_pos_x = curr_pos_x;
    }

    public abstract void on_collision();
}
