import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
/**
 * Class Heater - Creates a heater who's temperature gauge color will change as the temperature gets hotter or colder.
 *
 * @author (Julia Tran)
 * @version (9/23/2021)
 */
public class Heater
{
    private Canvas heaterCanvas;
    private int temperature;
    /**
     * Create a Drawing object. Creates the Fresh heater with a default temperature of 50 degrees Fahrenheit, and makes it visible. 
     */
    public Heater()
    {
        temperature = 50;
        heaterCanvas = new Canvas("Temperature Gauge", 500, 500);
        heaterCanvas.setVisible(true);
        showHeater();
    }
    public void showHeater() //shows the heater and decor
    {
        //sets black background
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.fillRectangle(0,0,500,500); 
        //this will create the outside of the heater with text title
        heaterCanvas.setForegroundColor(Color.BLUE);
        heaterCanvas.fillRectangle(50,50,400,400);
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString("Temperature Gauge", 200, 80);
        //this will create the decor for the outside of the heater
        heaterCanvas.setForegroundColor(Color.WHITE);
        heaterCanvas.drawString("Author: Julia Tran, 10/7/21", 10, 30);
        //internal part of heater, holds string temperature and heat gauge 
        heaterCanvas.setForegroundColor(Color.GRAY);
        heaterCanvas.fillRectangle(100,100,200,300);
        
        heaterCanvas.setForegroundColor(Color.ORANGE); //default temp, 50
        heaterCanvas.fillRectangle(130,150,80,180);
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString("The temperature is", 320, 230);
        heaterCanvas.drawString("  currently set to:", 330, 250);
        heaterCanvas.drawString(temperature + " degrees Fahrenheit", 320, 270); // create another rectangle, draw over this, then new string
        //this will create the decor for the big canvas in general, all just decor
        heaterCanvas.setForegroundColor(Color.WHITE);
        heaterCanvas.fillCircle(230,150,50);
        heaterCanvas.setForegroundColor(Color.GREEN);
        heaterCanvas.drawString("HOT", 245, 180);
        
        heaterCanvas.setForegroundColor(Color.WHITE);
        heaterCanvas.fillCircle(230,210,50);
        heaterCanvas.setForegroundColor(Color.GREEN);
        heaterCanvas.drawString("DEF", 245, 240); //default temp
        
        heaterCanvas.setForegroundColor(Color.WHITE);
        heaterCanvas.fillCircle(230,270,50);
        heaterCanvas.setForegroundColor(Color.GREEN);
        heaterCanvas.drawString("COLD", 240, 300);
        
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.fillRectangle(130, 360, 150, 10);
    }
    /**
     * increase temperature by ten
     * if temp = 30 or less, then temperature gauge turns yellow
     * if temp = less than 70, but greater than 30, then temperature guage turns orange
     * if temp = greater than or equal to 70, gauge turns read
     */
    public void makeWarmer()
    {
        temperature = temperature + 10; //increase the temperature by then each time
        
        //draw rectangle that would cover previous strings, then these new strings
        heaterCanvas.setForegroundColor(Color.BLUE);
        heaterCanvas.fillRectangle(310, 180, 140, 120);
        
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString("The temperature is", 320, 230);
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString("  currently set to:", 330, 250);
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString(temperature + "degrees Fahrenheit", 320, 270);
        if (temperature >= 100)
        {
            heaterCanvas.setForegroundColor(Color.DARK_GRAY); 
            heaterCanvas.fillRectangle(130,150,80,180);
            heaterCanvas.setForegroundColor(Color.WHITE);
            heaterCanvas.drawString("Error temp",140, 200);
            
            heaterCanvas.setForegroundColor(Color.BLUE);
            heaterCanvas.fillRectangle(310, 180, 140, 120);
        }
        else if (temperature <= 30)
        {
            heaterCanvas.setForegroundColor(Color.YELLOW); 
            heaterCanvas.fillRectangle(130,150,80,180);
        }
        else if (temperature < 70 && temperature > 30)
        {
            heaterCanvas.setForegroundColor(Color.ORANGE);
            heaterCanvas.fillRectangle(130,150,80,180);
        }
        else if (temperature >= 70)
        {
            heaterCanvas.setForegroundColor(Color.RED); 
            heaterCanvas.fillRectangle(130,150,80,180);
        }
        
    }
    /**
     * decrease temperature by ten
     * if temp = 30 or less, then temperature gauge turns yellow
     * if temp = 60 or less, but greater than 30, then temperature guage turns orange
     * if temp = 90 or less, but greater than 60, then temperature guage turns red
     */ 
    public void makeColder()
    {
        temperature = temperature - 10;
        //draw rectangle that would cover previous strings, then these new strings
        heaterCanvas.setForegroundColor(Color.BLUE);
        heaterCanvas.fillRectangle(310, 180, 140, 120);
        
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString("The temperature is", 320, 230);
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString("  currently set to:", 330, 250);
        heaterCanvas.setForegroundColor(Color.BLACK);
        heaterCanvas.drawString(temperature + "degrees Fahrenheit", 320, 270);
        if (temperature <= 0)
        {
            heaterCanvas.setForegroundColor(Color.WHITE); 
            heaterCanvas.fillRectangle(130,150,80,180);
            heaterCanvas.setForegroundColor(Color.BLACK);
            heaterCanvas.drawString("Error temp",140, 200);
        }
        else if (temperature <= 30)
        {
            heaterCanvas.setForegroundColor(Color.YELLOW); 
            heaterCanvas.fillRectangle(130,150,80,180);
        }
        else if (temperature < 70 && temperature > 30)
        {
            heaterCanvas.setForegroundColor(Color.ORANGE);
            heaterCanvas.fillRectangle(130,150,80,180);
        }
        else if (temperature >= 70)
        {
            heaterCanvas.setForegroundColor(Color.RED); 
            heaterCanvas.fillRectangle(130,150,80,180);
        }
        
        
    }
}
