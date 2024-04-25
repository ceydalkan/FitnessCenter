package FitnessCenter;

public class SportCenter {
	private String centerName;
	private int centerCapacity;
	private static int memberCount=0;
	private Member[] memberList;

	public SportCenter(String name, int capacity) {
		this.centerName = name;
		this.centerCapacity = capacity;
		memberList= new Member[capacity];
	}
	
	public void addMember(Member mem) {
		memberList[memberCount]=mem;
		memberCount++;
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public void search(String name,String surname) {
		int i;
		for(i=0; i<=memberCount; i++) {
			if(memberList[i].getName()==name && memberList[i].getSurname()==surname)
			memberList[i].displayMember();
		} 
		if(i==memberCount+1)
			System.out.println("not found");
	}
	
	public void printAllMembers() {
		for(int i=0;i<memberCount;i++) {
			memberList[i].displayMember();
		}
	}
}