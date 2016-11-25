/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;


/**
 *
 * @author yigitpolat
 */
public class GameObject 
{
    private Vector2 position;
    private Vector2 size;
    private Vector2 velocity;
    private BufferedImage texture;
    private ImageObserver observer;
    
    public Vector2 getPosition()
    {
        return position;
    }
    
    public void setPosition( Vector2 newpos)
    {
        position = newpos;
    }
    
    public Vector2 getSize()
    {
        return size;
    }
    
    public void setSize( Vector2 newsize)
    {
        size = newsize;
    }
    
    public Vector2 getVelocity()
    {
        return velocity;
    }
    
    public void setVelocity( Vector2 newvelo)
    {
        velocity = newvelo;
    }

    public void setTexture( BufferedImage img)
    {
        texture = img;
    }
    
    public void drawEntity( Graphics g)
    {
        g.fillOval((int) position.x, (int) position.y, (int) size.x, (int) size.y);
        //g.drawImage(texture, (int) position.x, (int) position.y, (int) size.x, (int) size.y, observer);
    }
    
    
}
