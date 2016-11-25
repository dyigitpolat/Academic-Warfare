/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author yigitpolat
 */
public class Scene extends JPanel implements ActionListener, MouseListener
{
    ArrayList<GameObject> gameObjects;
    ArrayList<Event> events;
    
    public Scene()
    {
        initScene();
        
        Timer t = new Timer(5, this);
        addMouseListener((MouseListener) this);
        t.start();
    }
    
    public ArrayList<GameObject> getObjects()
    {
        return gameObjects;
    }
    
    public ArrayList<Event> getEvents()
    {
        return events;
    }
    
    public void setObjects( ArrayList<GameObject> objs)
    {
        gameObjects = objs;
    }
    
    public void setEvents( ArrayList<Event> evts)
    {
        events = evts;
    }
    
    public void initScene()
    {
        
    }
    
    public void updatePositions()
    {
        for( GameObject o : gameObjects)
        {
            o.getPosition().x += o.getVelocity().x / 200;
            o.getPosition().y += o.getVelocity().y / 200;
        }
    }
    
    @Override
    public void paintComponent( Graphics g)
    {
        super.paintComponent( g);
        for( GameObject o : gameObjects)
        {
            o.drawEntity( g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        updatePositions();
        repaint();
        
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        
    }
}
