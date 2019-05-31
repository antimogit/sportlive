package it.contrader.view;

import java.util.List;
import java.util.Scanner;

import it.contrader.controller.Request;
import it.contrader.controller.CareController;
import it.contrader.main.MainDispatcher;
import it.contrader.model.Care;

public class CareView implements View {

	private CareController caresController;
	private Request request;
	private String choice;
	
	public CareView() {
		this.caresController = new CareController();
	}

	@Override
	public void showResults(Request request) {
	}

	@Override
	public void showOptions() {
		
		System.out.println("\n CARE VIEW \n");
		System.out.println("ID\t Patient name\t Patient SSC\t Patient age\t Patology\t Care name\t Quantity\t Notes");
		System.out.print("------------------------------------------------------");
		List<Care> cares = caresController.getAllCare();
		System.out.println();
		cares.forEach(care -> System.out.println(care.toString()));
		System.out.println();
		
		System.out.println("Choose operation");
		System.out.println("[1] Patient care view");
		System.out.println("[2] Insert new care");
		System.out.println("[3] Update existing care");
		System.out.println("[4] Delete existing care");
		System.out.println("[5] Return to login");
		try {
			this.choice = getInput();
		} catch(Exception e) {
			this.choice = "";
		}
		request = new Request();
		request.put("choice", choice);
		request.put("mode", "");
	}

	@Override
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	@Override
	public void submit() {
		    MainDispatcher.getInstance().callAction("Care", "doControl", this.request);
	}

}
