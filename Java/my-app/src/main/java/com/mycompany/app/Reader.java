package com.mycompany.app;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

//import com.journaldev.csv.model.Employee;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
//import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class Reader {

	public static void main(String[] args) throws IOException {
		
		CSVReader reader = new CSVReader(new FileReader("D:\\Vjj\\Java\\my-app\\src\\main\\java\\com\\mycompany\\app\\Emp.csv"), ',');
		
		ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
		beanStrategy.setType(Employee.class);
		beanStrategy.setColumnMapping(new String[] {"id","age","Name"});
		
		CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
		
		List<Employee> emps = csvToBean.parse(beanStrategy, reader);
		
		System.out.println(emps);
		
	}
}