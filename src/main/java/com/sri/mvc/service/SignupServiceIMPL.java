package com.sri.mvc.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.mvc.DAO.SignupDAO;
import com.sri.mvc.DTO.SignupDTO;
import com.sri.mvc.Entity.SignuEntity;
@Service
public class SignupServiceIMPL implements SignUPServic{
	@Autowired
	private SignupDAO signupDAO;
	
	public SignupServiceIMPL() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	public boolean validateandsave(SignupDTO dtoservice) {
		boolean valid=false;
		try {
			System.out.println("invoked validate & save  "+dtoservice);
			
			
			 if(Objects.nonNull(dtoservice)) {
				 System.out.println("its true saving");
				 System.out.println("started service with validation");
					String email = dtoservice.getEmail();
					if (email != null && !email.isEmpty() && email.length() >= 5 && email.contains(".com")) {
						System.out.println("name is valid");
						valid = true;
					} else {
						System.out.println("name is invalid");
						if (email == null) {
							System.out.println("name is null");
						}
						if (email != null && email.length() >= 5) {
							System.out.println("length is less than 5");
						}
						valid = false;
						if (email != null && email.contains(".com")) {
							System.out.println("not valid mail id");
						}
						valid = false;
					}
					String password = dtoservice.getPwd();
					if (valid && password != null && !password.isEmpty() && password.length() >= 8) {
						System.out.println("password is valid");
						valid = true;
					} else {
						System.out.println("password name is invalid");
						if (password == null) {
							System.out.println("password name is null");
						}
						if (password != null && password.length() >=8) {
							System.out.println("password length is less than 8");
						}
						valid = false;
					}

					

				}

				if(valid) {
					System.out.println("data is valid can continue");
					SignuEntity signuEntity = new SignuEntity();
					BeanUtils.copyProperties(dtoservice, signuEntity);
					System.out.println("entity is "+ signuEntity);
					signupDAO.save(signuEntity);
					
				}
			
		}catch(Exception e) {e.printStackTrace();}
		
		return false;
	}

}
