import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.println("Mayın Tarlası oyununa hoşgeldiniz ! ");
		System.out.println("Lütfen oynamak istediğiniz boyutları giriniz: ");
		
		System.out.println("Satır Sayısı: ");
		row = scan.nextInt();
		
		System.out.println("Sütun Sayısı: ");
		column = scan.nextInt();
		
		MineSweeper mine = new MineSweeper(row,column);
		
		mine.run();
		System.out.println();
		

	}

}
