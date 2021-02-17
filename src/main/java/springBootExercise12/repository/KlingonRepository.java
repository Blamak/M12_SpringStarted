package springBootExercise12.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootExercise12.dto.KlingonResponseDTO;

@Repository
public class KlingonRepository implements IRepository {
	
	@Autowired
	private KlingonResponseDTO klingonResponseDTO;

	@Override
	public KlingonResponseDTO getKlingon(String uuid) {
		klingonResponseDTO.setName("Worf");
		klingonResponseDTO.setRank("Lieutenant Commander");
		return klingonResponseDTO;
	}

}
