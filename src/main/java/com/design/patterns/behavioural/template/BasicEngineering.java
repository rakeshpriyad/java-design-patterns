package com.design.patterns.behavioural.template;

public abstract class BasicEngineering {
	// 	Papers() in the template method
	public void papers() {
		//	Common Papers:
		math();
		softSkills();
		//	Specialized Paper:
		specialPaper();
	}

	//Non-Abstract method Math(), SoftSkills() are //already implemented by Template class
	private void math() {
		System.out.println("Mathematics");
	}

	private void softSkills() {
		System.out.println("SoftSkills");
	}

	//Abstract method SpecialPaper() must be implemented in derived classes
	public abstract void specialPaper();
}