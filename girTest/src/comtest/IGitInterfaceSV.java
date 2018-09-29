package comtest;

public class IGitInterfaceSV implements IGitInterface{

	@Override
	public JustTestGit getJustTestGit(String billId) throws Exception {
		billId="12345566667";
		JustTestGit testGit= new JustTestGit();
		testGit.setBillId(billId);
		
		return testGit;
	}

	@Override
	public void getTestGit(String billId) throws Exception {
		String[] billIdArr = billId.split("*");
		
	}
	public void getTestGit1(String billId) throws Exception {
		String[] billIdArr = billId.split("*");
		
	}

}
