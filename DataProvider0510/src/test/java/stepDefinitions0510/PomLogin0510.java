package stepDefinitions0510;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browserFactory.BaseClass0510;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Login0510;
import util.DataProvider0510;

public class PomLogin0510 extends BaseClass0510 {




	@Given ("^User is on the login page$")
	public void usrLoginPg() throws InterruptedException {

		BaseClass0510.setUp();
	}
	

	@Test(dataProvider="LoginDataFromExcel")
	
	
	@When ("^User gets logged in post entering the credentials$")
	public void userLogin(String Username, String Password) {

		Login0510 login = new Login0510();
		login.LoginPgActions(Username, Password);

		
		
		
		
	}

	@DataProvider(name="LoginDataFromExcel")
	public String [][] getData() throws IOException{


		String Path= "./src/test/resources/DataFile/BDD Data.xlsx";

		DataProvider0510 dataProvider = new DataProvider0510(Path);

		int totalRows=dataProvider.getRowCount("testData");
		int totalCols= dataProvider.getCellCount("testData", 1);

		String loginData[][]= new String[totalRows][totalCols];

		for (int i=1; i<totalRows; i++) {

			for (int j=0; j<totalCols; j++) {
				loginData[i-1][j]= dataProvider.getCellData("testData", i, j);
			}
		}



		return loginData;

	}



}