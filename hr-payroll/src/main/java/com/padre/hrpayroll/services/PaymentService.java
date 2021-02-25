package com.padre.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.padre.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("luis",200.12,days);
	}
}
