package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

	private List<Account> accounts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		
		System.out.println("프로그램 종료");
	}
	
	public void start() {
		
		boolean running = true;
		
		while(running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.next());
			
			switch(choice) {
				case 1 -> createAccount();
				case 2 -> listAccounts();
				case 3 -> depositAccount();
				case 4 -> withdrawAccount();
				case 5 -> {
					running = false;
				}
				default -> System.out.println("올바른 번호를 선택하세요.");
			}
		}
	}
	
	public void printMenu() {
		System.out.println("--------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------");
		
	}
	
	// 메서드 구현해서 프로그램 완성하기
	public void createAccount() {
		
		System.out.println("------------------ 계좌생성 ------------------");
	    
	    System.out.print("계좌번호: ");
	    String ano = scanner.next();

	    System.out.print("계좌주: ");
	    String owner = scanner.next();

	    System.out.print("초기입금액: ");
	    int balance = scanner.nextInt();

	    Account acc = new Account(ano, owner, balance);
	   
	    System.out.println("결과: 계좌가 생성되었습니다.");
	    
	    accounts.add(acc);
	   
	}
	
	public void listAccounts() {
		
		System.out.println("------------------ 계좌목록 ------------------");
		
		for(Account acc : accounts) {
			System.out.println(acc.getAno() + " " + acc.getOwner() + " " + acc.getBalance());
		}
	}	
	
	public void depositAccount() {
		
	}
	
	public void withdrawAccount() {}
	
	public Account findAccount(String ano) {
		
		for (Account acc : accounts) {
	        if (acc.getAno().equals(ano)) {
	            return acc;
	        }
	    }
	    return null;
	}
}
