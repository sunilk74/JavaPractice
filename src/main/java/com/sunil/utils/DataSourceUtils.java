package com.sunil.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataSourceUtils {

  protected Object[][] testCaseFile(String str) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(str)));
    int numRows = getRowCount(str);
    int numCols = getColCount(str);
    
    Object[][] testData = new Object[numRows][numCols];

    String line;

    int count = 0;
    while((line = br.readLine()) != null)
    {
      String[] strArr = line.split(",");
      if(count<numRows)
      {
        for(int i=count;i<=count;i++)
        {
          for(int j=0;j<numCols;j++)
          {
            testData[i][j] = strArr[j];
          }
        }
        count++;
      }
    }

    br.close();
    return testData;
  }

  protected int getRowCount(String str) throws IOException
  {
    int rowCount=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(str)));
    //System.out.println("getRowCount 111");
    while (br.readLine() != null)
    {
      rowCount++;
    }
    br.close();
    return rowCount;
  }

  protected int getColCount(String str) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(str)));
    //System.out.println("getColCount 111");
    int colCount = br.readLine().split(",").length;
    br.close();
    
    return colCount;
  }
  
  protected String zuluDate(String time) throws ParseException
  {
    String formattedTime = null;
    if(time.equals(" "))
    {
      formattedTime = "";
    }
    else if(time.equals("wrongformat"))
    {
      formattedTime = "11-22-2017T11:10:30.125Z";
    }
    else if(time.equals("invalidDate"))
    {
      formattedTime = "2017-abc-22T11:10:30.125Z";
    }
    else if(time.equals("current-8"))
    {
      /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      //Date d = sdf.parse(time);
      Date d = new Date();
      SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
      formattedTime = output.format(d);*/
      
      Calendar cal = Calendar.getInstance();
      cal.add(Calendar.HOUR, -8);

      //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
      SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
      formattedTime = output.format(cal.getTime());
      System.out.println("formattedTime :" +formattedTime);
            
    }
    
    return formattedTime;
  } 
  
  public String readFile(String fileName) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));
    try {
          StringBuilder sb = new StringBuilder();
          String line = br.readLine();
  
          while (line != null) {
              sb.append(line);
              sb.append("\n");
              line = br.readLine();
          }
          return sb.toString();
      } finally {
        br.close();
      }
  }

}
