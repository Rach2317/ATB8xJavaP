package oct.ex11102024.SuperKeywordConcept.ex2ofSuper;

public class BaseClass {

    private String browser;
    BaseClass()
    {
        System.out.println("DC of BaseClass");
    }

    BaseClass(String b)
    {
        System.out.println("CC of BaseClass");
    }

    public String getBrowser() {
        return browser;
    }



    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth)
        {
            this.browser = browser;
        }else
        {
            System.out.println("Not Allowed!!");
        }

    }



    void openBrowser()
    {
        System.out.println("Open Browser!!");
    }

    void openBrowser(String browserName)
    {
        System.out.println("Open Browser!!"+browserName);
    }

    void closeBrowser()
    {
        System.out.println("Close Browser");
    }


}
