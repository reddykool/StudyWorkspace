
public enum PEnum {
	PuRu("Super", 1000000),
	SiRi("Awesome", 2000000),
	Shamanth("Rockstar", 9000000);
	
	private final String desc;
	private final int amount;
	
	PEnum(String dsc, int amnt) {
		System.out.println("PEnum init for: "+dsc+"\t"+amnt);
		desc = dsc;
		amount = amnt;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public int getAmount(){
		return amount;
	}
}

/*
public static void main(String args[]) {

	System.out.println("****   START of program  *****");
	System.out.println(PEnum.PuRu.getDesc());
	System.out.println(PEnum.PuRu.getAmount());
	System.out.println("****   End of program  *****");
	
}
*/