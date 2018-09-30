package comtest;

public class IGitInterfaceSV implements IGitInterface{

	@Override
	public JustTestGit getJustTestGit(String billId) throws Exception {
		billId="12345566667";
		JustTestGit testGit= new JustTestGit();
		testGit.setBillId(billId);
		testGit.setName("zhangsan");
		testGit.setOfferId("123");
		testGit.setProdId("wulai");
		testGit.setProdName("“Ïµÿ–¥ø®");
		return testGit;
	}

	@Override
	public void getTestGit(String billId) throws Exception {
		String[] billIdArr = billId.split("*");
		
	}
	public void getTestGit1(String billId) throws Exception {
		String[] billIdArr = billId.split("*");
		
	}

	@Override
	public int gitSum(int x, int y) throws Exception {
		
		return x+y;
	}

	

	@Override
	public String getString(String bil) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
