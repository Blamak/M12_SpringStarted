package springBootExercise12.services;

import springBootExercise12.dto.KlingonResponseDTO;

public interface IKlingonService {
	
	KlingonResponseDTO getKlingon(String uuid);

	String defaultGreeting();

	String parameterGreeting(String name);

	String hello(String name);
}
