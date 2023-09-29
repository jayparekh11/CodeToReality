/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jaypa
 */
public class VitalHistory 
{   
    private ArrayList<Vitals> vitalhistory;
    
    public VitalHistory()
    {
        this.vitalhistory = new ArrayList<Vitals>();
    }

    public ArrayList<Vitals> getHistory() {
        return vitalhistory;
    }

    public void setHistory(ArrayList<Vitals> history) {
        this.vitalhistory = history;
    }
    
    public Vitals addNewVitals()
    {
        Vitals newVitals = new Vitals();
        vitalhistory.add(newVitals);
        return newVitals;
        
    }

    public void deleteVitals(Vitals vs) 
    {
        vitalhistory.remove(vs);
    }
}
