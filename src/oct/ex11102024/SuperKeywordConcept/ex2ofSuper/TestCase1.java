package oct.ex11102024.SuperKeywordConcept.ex2ofSuper;

public class TestCase1 extends BaseClass{

    TestCase1()
    {
        super();   //will call dc of parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
