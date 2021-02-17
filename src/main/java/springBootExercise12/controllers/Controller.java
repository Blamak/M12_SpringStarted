package springBootExercise12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBootExercise12.dto.KlingonResponseDTO;
import springBootExercise12.services.IKlingonService;

@RestController
public class Controller {

	private final IKlingonService klingonService;

	@Autowired
	public Controller(IKlingonService klingonService) {
		this.klingonService = klingonService;

	}

	@GetMapping("/")
	public String defaultGreeting() {
		return klingonService.defaultGreeting();
	}

	@GetMapping("/{name}")
	public String parameterGreeting(@PathVariable(name = "name") String name) {
		return klingonService.parameterGreeting(name);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return klingonService.hello(name);
	}

	@GetMapping("/klingon/{uuid}")
	public ResponseEntity<KlingonResponseDTO> updatePrescription(@PathVariable(name = "uuid") String klingon)
			throws Exception {
		KlingonResponseDTO klingonResponseDto = klingonService.getKlingon("ppterter");

		return new ResponseEntity<>(klingonResponseDto, HttpStatus.OK);
	}
}
