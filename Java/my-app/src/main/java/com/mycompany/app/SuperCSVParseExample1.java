package com.mycompany.app;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

 class SuperCSVParserExample1 {

	public static void main(String[] args) throws IOException {

		List<Employee> emps = new ArrayList<Employee>();
		ICsvBeanReader beanReader = new CsvBeanReader(new FileReader("D:\\Vjj\\Java\\my-app\\src\\main\\java\\com\\mycompany\\app\\Emp.csv"), CsvPreference.STANDARD_PREFERENCE);
		
		// the name mapping provide the basis for bean setters
		final String[] nameMapping = new String[] { "id", "age", "name", "country" };
		
		//to read and skip header row
		final String[] header = beanReader.getHeader(true);
		System.out.println(""+header);
		final CellProcessor[] processors = getProcessors();
        System.out.println(""+processors);
		Employee emp;
		while ((emp = beanReader.read(Employee.class, nameMapping, processors)) != null) {
			emps.add(emp);
		}
		System.out.println(emps);
		beanReader.close();

	}

	private static CellProcessor[] getProcessors() {
		final CellProcessor[] processors = new CellProcessor[] { 
				new UniqueHashCode(), // ID
				new NotNull(), // Name
				new Optional(), // Age
				new NotNull() // Country
		};
		return processors;
	}

}