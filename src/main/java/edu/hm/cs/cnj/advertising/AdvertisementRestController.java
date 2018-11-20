package edu.hm.cs.cnj.advertising;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ads")
public class AdvertisementRestController {

	@GetMapping
	String findAd() {
		return "Kommen Sie nach Mogmog. Es ist schön hier.";
	}
}
