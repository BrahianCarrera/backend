package com.FleetGuard360.backend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.FleetGuard360.backend.repository.AlertRepository;
import com.FleetGuard360.backend.repository.UserRepository;
import com.FleetGuard360.backend.service.AlertService;
import com.FleetGuard360.backend.service.UserService;

@SpringBootTest
class BackendApplicationTests {

	@Mock
    private UserRepository userRepository;

	@Mock
	private AlertRepository alertRepository;


    @InjectMocks
    private UserService userService;
	
	@InjectMocks
	private AlertService alertService; 

	private  BCryptPasswordEncoder passwordEncoder;

	@BeforeEach
	void setup(){

		this.passwordEncoder = new BCryptPasswordEncoder();
		userService = new UserService(passwordEncoder);
		alertService = new AlertService();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void createUser() {
	}

	@Test
	void loginUser() {
	}

	@Test
	void createAlert(){

	}

	@Test
	void deleteAlert(){

	}



}
