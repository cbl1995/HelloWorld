
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class c {

    public static void main(String... args) throws IOException {
        File input = new File("F:/1.png");
        BufferedImage image = ImageIO.read(input);
        BufferedImage resized = resizebyaspect(image, 1655, 2340);
        File output = new File("F:/3.jpg");
        ImageIO.write(resized, "jpg", output);
    }


    private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    private static BufferedImage resizebyaspect(BufferedImage img, int height, int width) {
        int ori_width = img.getWidth();
        int ori_height = img.getHeight();
        float ratio_w = (float) width / ori_width;
        float ratio_h = (float) height / ori_height;
        int new_width = (ratio_w < ratio_h) ? width : (int) (ratio_h * ori_width);
        int new_height = (ratio_h < ratio_w) ? height : (int) (ratio_w * ori_height);
        System.out.println(new_height);
        System.out.println(new_width);
        Image tmp = img.getScaledInstance(new_width, new_height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(new_width, new_height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

}