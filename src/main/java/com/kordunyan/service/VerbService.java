package com.kordunyan.service;

import com.kordunyan.domain.Verb;

import java.util.List;

public interface VerbService {
	List<Verb> getAllRandomVerbs();

	List<Verb> getAllOrderedVerbs();

	Verb saveVerb(Verb verb);
}
