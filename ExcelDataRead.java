package Open;

import org.testng.annotations.Test;

import java.io.File;

import org.testng.annotations.DataProvider;

public class ExcelDataRead {
  @Test(dataProvider = "thunder")
  public void f(Integer n, String s) {
  }

  
  @Test
  public void exceloper()
  {
     File f = new File("/Users/mac/Downloads/login.xlsx");
     
  }
  
  
  @DataProvider
  public Object[][] thunder() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] {3,"anubhav"},
    };
    
    
  }
}
