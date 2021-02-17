package springBootExercise12.repository;

import springBootExercise12.dto.ResponseDTO;

public interface IRepository {

	public ResponseDTO getKlingon(String uuid);
}
