package com.fbt.cleancode;

import static org.junit.Assert.*;

import org.junit.Test;

public class IfTest {
	
    private static final int NUMBER_REPEAT = 10000000;

	/**
     * Affecte toujours la même valeur
     */
    @Test
    public void cleanCode_affectationAlways_bestPerformance()
    {
    	//given
    	int numberRepeat = NUMBER_REPEAT;
    	
    	//when
    	If.assignationAlwaysRepeat(numberRepeat);
    	
    	//then
        assertTrue( true );
    }

    /**
     * Vérifie toujours avant d'affecter la valeur
     */
    @Test
    public void badCode_ifBeforeAffectation_bestPerformance()
    {
    	//given
    	int numberRepeat = NUMBER_REPEAT;
    	
    	//when
    	If.ifBeforeAffectationRepeat(numberRepeat);
    	
    	//then
    	assertTrue( true );
    }
	
}
