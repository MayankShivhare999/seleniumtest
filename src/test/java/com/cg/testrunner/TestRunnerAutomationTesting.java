package com.cg.testrunner;

import com.cg.demo.RegisterAutomation;

public class TestRunnerAutomationTesting {

	public static void main(String[] args) {
		
		RegisterAutomation ra = new RegisterAutomation();
		ra.loadURL();
		ra.setUpperFields();
		ra.selectGender();
		ra.selectHobies();
		ra.selectLanguage();
		ra.selectSkill();
		ra.selectCountry();
		ra.selectCCountry();
		ra.setDOB();
		ra.setPassword();
		ra.chooseFile();
	}
}
