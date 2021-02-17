package springBootExercise12.dto;

import org.springframework.stereotype.Component;

@Component
public class KlingonResponseDTO extends ResponseDTO {

	private String name;
	private String rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}
