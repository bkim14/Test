package com.scsa.java.car;

public class Test {

	public static void main(String[] args) {
		
		Car c1=new Car("11��1243", 8000, "������");
		Car c2=new Car("77��8623", 6500, "�ҳ�Ÿ");
		Car c3=new Car("71��1234", 9000,"���׽ý�");
		Car[] cars=new Car[4];
		cars[0]=c1;
		cars[1]=c2;
		cars[2]=c3;
		cars[3]=new Car("66��8765", 4000,"���");
		for (Car c:cars) {
			System.out.println(c);
		}
		
		Bus[] bs=new Bus[3];
		bs[0]=new Bus("23��7899", 13000, "�������", 45);
		bs[1]=new Bus("73��1234", 15000, "Ÿ�����", 60);
		bs[2]=new Bus("86��7777", 20000, "��������", 30);
		int seats=0;
		for (Bus b:bs) {
			seats=seats+b.getSeat();
		}
		System.out.println("�� �¼����� :"+seats);
	}

}