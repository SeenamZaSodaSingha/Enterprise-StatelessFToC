/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statelessftocclient;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mybean.StatelessFToCRemote;

/**
 *
 * @author SeenamZaSodaSingha
 */
public class FToC {

//    private float f = 0;
    
    StatelessFToCRemote remote = lookupStatelessFToCRemote();

    public FToC(float f) {
        System.out.printf("%.2f Fahrenheit = %.2f Celsius", f, remote.fToC(f));
    }

    private StatelessFToCRemote lookupStatelessFToCRemote() {
        try {
            Context c = new InitialContext();
            return (StatelessFToCRemote) c.lookup("java:comp/env/StatelessFToC");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
