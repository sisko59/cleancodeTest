package com.fbt.cleancode;

import org.junit.Test;


/**
 * Impacte tellement minime, qu'il n'est pas mesurable
 * @author hp
 *
 */
public class MultipleSubMethodsTest {


	private static final int NUMBER_REPEATS = 100000000;

	@Test
	public void cleanCode_MultipleSubMethod_samePerformance() {
		//given
		
		//when
		for (int i = 0; i < NUMBER_REPEATS; i++) {
			MultipleSubMethods.multipleSubMethod();
		}
		
		//then
	}
	
	@Test
	public void cleanCode_MultipleSubMethods_samePerformance() {
		//given
		
		//when
		for (int i = 0; i < NUMBER_REPEATS; i++) {
			MultipleSubMethods.multipleSubMethods();
		}
		
		//then
	}
	
	@Test
	public void badCode_oneSubMethods_samePerformance() {
		//given
		
		//when
		for (int i = 0; i < NUMBER_REPEATS; i++) {
			MultipleSubMethods.oneSubMethod();
		}
		
		//then
	}
	
	/**
	 * On constate que c'est la "boucle for" qui impacte la performance...
	 */
	@Test
	public void checkCode_justFor_samePerformance() {
		//given
		
		//when
		for (int i = 0; i < NUMBER_REPEATS; i++) {
		}
		
		//then
	}
	
	/**
	 * Non vérifiable avec une méthode récursive...
	 * Juste avec 10000 sous appels...
	 */
	@Test(expected=StackOverflowError.class)
	public void checkCode_recursive_stackOverflow() {
		//given
		
		//when
		MultipleSubMethods.recursiveMethod(NUMBER_REPEATS);
		
		//then
	}
}
