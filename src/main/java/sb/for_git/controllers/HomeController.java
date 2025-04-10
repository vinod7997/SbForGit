package sb.for_git.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/")
	public ResponseEntity<String>welcome(){
		return ResponseEntity.ok("welcome to git ");
	}

	
}
