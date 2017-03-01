package helper;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.imageio.ImageIO;

import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;

public class ImageHelper {
    
  /**
   * Erste Methode zum konvertieren eines PDF in ein JavaFX-Image
   * @param file
   * @return
   * @throws IOException
   */
  public static java.awt.Image createImage(File file) throws IOException {
    //load a pdf from a byte buffer
    @SuppressWarnings("resource")
    RandomAccessFile raf = new RandomAccessFile(file, "r");
    FileChannel channel = raf.getChannel();
    ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
    PDFFile pdffile = new PDFFile(buf);

    // draw the first page to an image
    PDFPage page = pdffile.getPage(0);
    
    //get the width and height for the doc at the default zoom 
    Rectangle rect = new Rectangle(0,0,
            (int)page.getBBox().getWidth(),
            (int)page.getBBox().getHeight());
    
    //generate the image
    java.awt.Image img = page.getImage(
            rect.width, rect.height, //width & height
            rect, // clip rect
            null, // null for the ImageObserver
            true, // fill background with white
            true  // block until drawing is done
            );
    return img;    
  }
      
    /**
     * Zweite Methode zum konvertieren eines PDF in ein JavaFX-Image.
     * Hier wird ein awt-Image in ein scene Image konvertiert
     * @param file
     * @return
     * @throws IOException
     */
  public static javafx.scene.image.Image convertImage(java.awt.Image awtImage) throws IOException {
    if (!(awtImage instanceof RenderedImage)) {
      BufferedImage bufferedImage = new BufferedImage(awtImage.getWidth(null),
          awtImage.getHeight(null), BufferedImage.TYPE_INT_ARGB);
      Graphics g = bufferedImage.createGraphics();
      g.drawImage(awtImage, 0, 0, null);
      g.dispose();

      awtImage = bufferedImage;
    }    
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ImageIO.write((RenderedImage) awtImage, "png", out);
    out.flush();
    ByteArrayInputStream sceneImage = new ByteArrayInputStream(out.toByteArray());
    return new javafx.scene.image.Image(sceneImage);
  }  
   

}
