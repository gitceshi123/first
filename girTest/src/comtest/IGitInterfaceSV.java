package comtest;

public class IGitInterfaceSV implements IGitInterface{

	@Override
	public JustTestGit getJustTestGit(String billId) throws Exception {
		billId="12345566667";
		JustTestGit testGit= new JustTestGit();
		testGit.setBillId(billId);
		testGit.setName("wwww");
		return testGit;
	}

}
