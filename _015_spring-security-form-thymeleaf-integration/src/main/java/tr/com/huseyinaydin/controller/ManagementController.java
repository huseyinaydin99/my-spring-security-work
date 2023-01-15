package tr.com.huseyinaydin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot Security
 * 
 */

@RequestMapping("management")
@Controller
public class ManagementController {

	@GetMapping("index")
	public String index() {
		return "management/index";
	}
}