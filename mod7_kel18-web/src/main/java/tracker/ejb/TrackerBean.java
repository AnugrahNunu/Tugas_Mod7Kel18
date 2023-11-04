/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package tracker.ejb;

import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anugrah
 */
@Stateful
public class TrackerBean implements TrackerBeanLocal {

    private double total = 0;
    private int count = 0;
    private List<Double> inputHistory = new ArrayList<>();


    
    @Override
    public double add(double value) {
        total += value;
        count += 1;
        inputHistory.add(value);
        return total;

    }

    @Override
    public double average() {
        return total / count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public double getTotal() {
        return total;
    }
    
    @Override
    public List<Double> getInputHistory() {
        return inputHistory;
    }


}
