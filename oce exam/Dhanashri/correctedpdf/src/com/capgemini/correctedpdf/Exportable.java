package com.capgemini.correctedpdf;

public interface Exportable {
void export(); 
}
class Tool implements Exportable{

	protected void export() {
		System.out.println("sdfghjkl");
		
	}
	class ReportTool extends Tool implements Exportable{
		 public void export() {
			System.out.println("dfghjkl");
		}
		 
		 
		 public static void main(String[] args) {
			Tool m=new ReportTool();
			Tool b=new Tool();
			callExport(m);
			callExport(b);
		}
		 public static void callExport(Exportable ex) {
			 ex.export();
		 }
	}
	
}
