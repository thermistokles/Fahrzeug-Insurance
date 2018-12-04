package com.insurance.controller;

import java.util.Random;

public class TicketGenerator {
public int getTicket() {
	Random rnd = new Random();
	int ticket = 100000 + rnd.nextInt(900000);
	return ticket;
}
}
