/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package mybean;

import javax.ejb.Stateless;

/**
 *
 * @author SeenamZaSodaSingha
 */
@Stateless
public class StatelessFToC implements StatelessFToCRemote {

    @Override
    public float fToC(float f) {
        return (5/9) * (f-32);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
