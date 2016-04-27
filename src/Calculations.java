/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author majcz_000
 */
public class Calculations {
    
    double A, a, T;
    double Period, Amp;    
    double stimulation(int stimulation_type, double Value, double Step_Size){
        if(stimulation_type == 0 )                                              //square
        {
            if(Math.sin(2*Math.PI*Value/Period)>0) return Amp;
            else return -Amp;
        }
        else if(stimulation_type == 1){                                         //triangle
            return (Amp*Math.asin(Math.sin(2*Math.PI*(Value/Period))));
        }
        else if(stimulation_type == 2){                                         //sin
            return(Amp*Math.sin(2*Math.PI*(Value/Period)));
        }
    return 0;
    }
}
