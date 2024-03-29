package com.cg.service;

import java.util.Arrays;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
	String nameRule = "[A-Z][a-z]{24}";
	String empIdRule = "[1-9][0-9]{5}";
	@Override
	public boolean validateFirstName(String firstName) {
		return firstName.matches(nameRule);
	}

	@Override
	public boolean validateLastName(String lastName) {
		return lastName.matches(nameRule);
	}

	@Override
	public boolean validateEmpId(String empId) {
		return empId.matches(empIdRule);
	}

	@Override
	public boolean validateGender(String gender) {
		if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))
			return true;
		else {
			System.out.println("Invalid Input. Enter gender again.");
			return false;
		}
	}

	@Override
	public boolean validateMaritalStatus(String maritalStatus) {
		List<String> marital = Arrays.asList("Single", "Married", "Divorced", "Separated", "Widowed");
		int k = 0;
		for(String flag : marital){
			if(flag.equalsIgnoreCase(maritalStatus)){
				maritalStatus = flag;
				k = -1;
				break;
			}
		} 
		if(k!=-1) {
			System.out.println("Invalid Input. Enter Again");
			return false;
		}else
			return true;
	}

}
