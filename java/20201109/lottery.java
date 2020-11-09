public class Lottery{
	public static void main(String[] args){
		int sum=0;
		for(int i=0;i<3;i++){
			System.out.println((i+1)+"回目の抽選です! ");
			int lot = new java.util.Random().nextInt(99)+1;
			System.out.println(lot);
			if(lot == 1){
				System.out.println("1000万円!!");
				sum = sum + 10000000;
			}else if(lot < 4){
				System.out.println("100万円!!");
				sum = sum + 1000000;
			}else if(lot < 7){
				System.out.println("10万円!!");
				sum = sum + 100000;
			}else if(lot < 11){
				System.out.println("1万円!!");
				sum = sum + 10000;
			}else if(lot < 20){
				System.out.println("1000円!!");
				sum = sum + 1000;
			}else if(lot < 40){
				System.out.println("100円!!");
				sum = sum + 100;
			}else{
				System.out.println("はずれ…");
				sum = sum + 0;
			}
			System.out.println();
		}
		System.out.printf("獲得賞金は%,d円でした!!%n",sum);
	}
}
