package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		
		System.out.println("x1:" + x1);
		System.out.println("x2:" + x2);
		System.out.println("x3:" + x3);
		System.out.println("y1:" + y1);
		System.out.println("y2:" + y2);
		System.out.println("y1: "+sdf1.format(y1));
		System.out.println("y2: "+sdf2.format(y2));

	}

}
