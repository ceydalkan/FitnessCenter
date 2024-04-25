package FitnessCenter;

public class TestMember {
	public static void main(String[] args) {

		SportCenter spCen1 = new SportCenter("gym",500);
		Member mem1 = new Member("ceyda","esko", 1.61,55.0);
		Member mem2 = new Member("senep", "esko", 1.63,50.0);
		spCen1.addMember(mem1);
		spCen1.addMember(mem2);
		System.out.println(mem1.weightStat(mem1));
		System.out.println(mem2.weightStat(mem2));
		System.out.println(spCen1.getMemberCount());
		spCen1.printAllMembers();
	}

}
