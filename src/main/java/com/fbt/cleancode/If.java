package com.fbt.cleancode;

public class If {

	public static String assignationAlwaysRepeat(int numberRepeat) {
		String valeurAAssigner = "Valeur à assigner";
		String valeurAssignee = "";
		for (int repeatCurrent = 0; repeatCurrent <= numberRepeat; repeatCurrent++) {
			valeurAssignee = valeurAAssigner;
		}
		return valeurAssignee;
	}

	public static String ifBeforeAffectationRepeat(int numberRepeat) {
		String valeurAAssigner = "Valeur à assigner";
		String valeurAssignee = "";
		for (int repeatCurrent = 0; repeatCurrent <= numberRepeat; repeatCurrent++) {
			if (!valeurAAssigner.equals(valeurAssignee)) {
				valeurAssignee = valeurAAssigner;
			}
		}
		return valeurAssignee;
	}

}
