package D6Collection;

public class Array 
{
	public static void main(String[] args) 
	{
		Friends party = new Friends();
		
		party.add("Mahendra");
		party.add("Hello");
		party.add("Sham");
		party.add("abc");
		party.add("Naik");

		
		party.showPartyList();
		
		party.remove("abc");
		
		party.showPartyList();
		
		party.sort();
		
		party.showPartyList();
		
		System.out.println(party.search("Mahendra"));
		System.out.println(party.search(""));
	}

}
