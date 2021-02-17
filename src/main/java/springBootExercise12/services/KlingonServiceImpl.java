package springBootExercise12.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootExercise12.dto.KlingonResponseDTO;
import springBootExercise12.repository.KlingonRepository;

@Service
public class KlingonServiceImpl implements IKlingonService {

	private final KlingonRepository klingonRepository;

	@Autowired
	public KlingonServiceImpl(KlingonRepository klingonRepository) {
		this.klingonRepository = klingonRepository;
	}
	
	@Override
	public KlingonResponseDTO getKlingon(String uuid) {
		return klingonRepository.getKlingon(uuid);
	}

	@Override
	public String defaultGreeting() {
		return "Hello World!";
	}

	@Override
	public String parameterGreeting(String name) {
		return "Hello " + name + "!";
	}

	@Override
	public String hello(String name) {
		return String.format("Hello %s!", name);
	}

}
