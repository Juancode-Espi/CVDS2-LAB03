package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	private ArrayList<Integer> Id = new ArrayList<Integer>();
	private boolean flag = false;
    public RegisterResult registerVoter(Person p) {
	
		if (Id.contains(p.getId())){
			return RegisterResult.DUPLICATED;
		}else {
			Id.add(p.getId());
			if (!p.isAlive()) {
				return RegisterResult.DEAD;
			}else {
				if (0>p.getAge() || 130<p.getAge()) {
					return RegisterResult.INVALID_AGE;
				}else {
					if(0<=p.getAge() && p.getAge()<18) {
						return RegisterResult.UNDERAGE;
					}else {
						return RegisterResult.VALID;
					}
				}
			}
		}    	
	}
}