
public class TestSort3 {

	public static void main(String args[]) throws IOException  
	{  
	//obtaining input bytes from a file  
	FileInputStream fis=new FileInputStream(new File("C:\\demo\\student.xls"));  
	//creating workbook instance that refers to .xls file  
	HSSFWorkbook wb=new HSSFWorkbook(fis);   
	//creating a Sheet object to retrieve the object  
	HSSFSheet sheet=wb.getSheetAt(0);  
	//evaluating cell type   
	FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
	for(Row row: sheet)     //iteration over row using for each loop  
	{  
	for(Cell cell: row)    //iteration over cell using for each loop  
	{  
	
		
	}
}
