/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicwarfare;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author yigitpolat
 */
public class All2ClickEvent implements Event
{
    boolean inputDetected;
    
    public All2ClickEvent()
    {
        inputDetected = false;
    }
    
    @Override
    public boolean eventOccured(ArrayList<GameObject> list, InputManager input) {
        return inputDetected;
    }

    @Override
    public void processEvent(ArrayList<GameObject> list) {
        
        for( GameObject o : list)
        {
            
        }
        
        inputDetected = false;
    }
    
    
}
