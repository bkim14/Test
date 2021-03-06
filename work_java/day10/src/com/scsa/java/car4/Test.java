package com.scsa.java.car4;


public class Test {

	public static void main(String[] args) throws AlreadyExistingException {
		ICarMgr mgr=new CarManager2();
		Car c=new Bus("44오8372",6000,"타요버스",45);
		try {
			mgr.add(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mgr.add(new Car("11소4827", 17000, "제네시스"));
		mgr.add(new Bus("44소4827", 7000, "이층버스", 60));
		
		System.out.println("대수 : "+ mgr.size());
		Car[] cc=mgr.search();
		for (Car c1:cc) {
			System.out.println(c1);
		}
		Car result;
		try {
			result = mgr.search("11소4827");
			System.out.println("검색 : "+result);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mgr.update("11소4827", 7000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("검색 : " +mgr.search("11소4827"));
		System.out.println(mgr.getTotalPrice());
		System.out.println(mgr.getTotalSeat());
	}

}
