/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author yigitpolat
 */
public class GameScene extends Scene
{
    
    @Override
    public void initScene()
    {
        GameObject obj1 = new GameObject();
        GameObject obj2 = new GameObject();
        
        obj1.setSize( new Vector2( 50.0f, 50.0f));
        obj1.setPosition( new Vector2( 20.0f, 300.0f));
        obj1.setVelocity( new Vector2( 50.0f, 0f));
        
        obj2.setSize( new Vector2( 50.0f, 50.0f));
        obj2.setPosition( new Vector2( 780.0f, 300.0f));
        obj2.setVelocity( new Vector2( -50.0f, 0f));
        
        setObjects( new ArrayList<GameObject>());
        getObjects().add(obj1);
        getObjects().add(obj2);
    }
    
}
