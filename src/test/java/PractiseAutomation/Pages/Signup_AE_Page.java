package PractiseAutomation.Pages;

import PractiseAutomation.ElementUtils.ElementUtil;
import org.openqa.selenium.By;

public class Signup_AE_Page {

    //Accnt Info Section
    private By MrRadiobtn = By.id("id_gender1");
    private By NameTxtBox = By.id("name");
    private By EmailTxtBox ;
    private By PasswordTxtBox = By.id("password");
    private By DOBDayDrpDwn = By.id("days");
    private By DOBMonthDrpDwn = By.id("months");
    private By DOBYearDrpDwn = By.id("years");
    private By newsletterChkBx = By.id("newsletter");
    private By spclOffrChkBx = By.id("optin");

    //Address Info Section
    private By FirstNameTxtBx = By.id("first_name");
    private By LastNameTxtBx = By.id("last_name");
    private By Addrs1TxtBx = By.id("address1");
    private By CntryDrpDwn = By.id("country");
    private By StateTxtBx = By.id("state");
    private By CtyTxtBx = By.id("city");
    private By ZipTxtBx = By.id("zipcode");
    private By MobnumTxtBx = By.id("mobile_number");
    private By createAcntBtn = By.xpath("//button[normalize-space()='Create Account']");

    private ElementUtil elementUtil=new ElementUtil();

    public void selectTitle(){
        elementUtil.selectRadioBtnChkBx(MrRadiobtn);
    }
    public Signup_AE_Page enterName(String name){
        System.out.println("Name = "+name);
        elementUtil.enterTextBox(NameTxtBox,name);
        return this;
    }
    public Signup_AE_Page enterEmail(String email){
        elementUtil.enterTextBox(EmailTxtBox,email);
        return this;
    }
    public Signup_AE_Page enterPassword(String pswd){
        System.out.println("Password = "+pswd);
        elementUtil.enterTextBox(PasswordTxtBox,pswd);
        return this;
    }
    public Signup_AE_Page selectDOBDate(String date){
        elementUtil.selectDropdown(DOBDayDrpDwn,date);
        return this;
    }
    public Signup_AE_Page selectDOBMonth(String mnth){
        elementUtil.selectDropdown(DOBMonthDrpDwn,mnth);
        return this;
    }
    public Signup_AE_Page selectDOBYear(String yr){
        elementUtil.selectDropdown(DOBYearDrpDwn,yr);
        return this;
    }
    public Signup_AE_Page newsletterSignupChkBx(){
        elementUtil.selectRadioBtnChkBx(newsletterChkBx);
        return this;
    }
    public Signup_AE_Page receiveOfferChkBx(){
        elementUtil.selectRadioBtnChkBx(spclOffrChkBx);
        return this;
    }
    public Signup_AE_Page enterFirstName(String firstName){
        elementUtil.enterTextBox(FirstNameTxtBx,firstName);
        return this;
    }
    public Signup_AE_Page enterLastName(String lastName){
        elementUtil.enterTextBox(LastNameTxtBx,lastName);
        return this;
    }
    public Signup_AE_Page address(String addr){
        elementUtil.enterTextBox(Addrs1TxtBx,addr);
        return this;
    }
    public Signup_AE_Page selectCountry(String cuntry){
        elementUtil.selectDropdown(CntryDrpDwn,cuntry);
        return this;
    }
    public Signup_AE_Page enterState(String state){
        elementUtil.enterTextBox(StateTxtBx,state);
        return this;
    }
    public Signup_AE_Page enterCity(String city){
        elementUtil.enterTextBox(CtyTxtBx,city);
        return this;
    }
    public Signup_AE_Page enterZipCd(String zip){
        elementUtil.enterTextBox(ZipTxtBx,zip);
        return this;
    }
    public Signup_AE_Page enterMobilenum(String mobNum){
        elementUtil.enterTextBox(MobnumTxtBx,mobNum);
        return this;
    }

    public Signup_AE_Page setCustomerDetails(String name,String firstname, String lastname,
                                             String email, String password, String address,
                                             String state, String city, String zipcode, String mobileNumber){//Customer customer
        /*return    enterName(customer.getFirstname()+" "+customer.getLastname()).
        //signupAEPage.enterEmail(accntInfo.get("Email"));
        enterPassword(customer.getPassword()).
        selectDOBDate("29")
        .selectDOBMonth("August")
        .selectDOBYear("2021")
        .newsletterSignupChkBx()
        .receiveOfferChkBx().
        enterFirstName(customer.getFirstname()).
        enterLastName(customer.getLastname()).
        address(customer.getAddress()).
        enterState(customer.getState()).
        enterCity(customer.getCity()).
        enterZipCd(customer.getZipcode()).
        enterMobilenum(customer.getMobileNumber());*/
        return enterName(name).
                //signupAEPage.enterEmail(accntInfo.get("Email"));
                        enterPassword(password).
                selectDOBDate("29")
                .selectDOBMonth("August")
                .selectDOBYear("2021")
                .newsletterSignupChkBx()
                .receiveOfferChkBx().
                enterFirstName(firstname).
                enterLastName(lastname).
                address(address).
                enterState(state).
                enterCity(city).
                enterZipCd(zipcode).
                enterMobilenum(mobileNumber);
    }
    public void clickCreateAcntBtn(){
        elementUtil.getBaseDriver().findElement(createAcntBtn).click();
    }
}
