package br.org.serratec.backend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.security.jwt.JwtUtils;
import br.org.serratec.backend.service.RepresentanteService;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	RepresentanteService userService;

	
	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@RequestBody Map<String, Object> payload) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(payload.get("username"), payload.get("password")));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
//		RepresentanteSecurity userDetails = (RepresentanteSecurity) authentication.getPrincipal();		
//		List<String> roles = userDetails.getAuthorities().stream()
//				.map(item -> item.getAuthority())
//				.collect(Collectors.toList());

		return ResponseEntity.ok(jwt);
	}
		
}