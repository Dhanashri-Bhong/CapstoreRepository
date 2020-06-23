package com.capgemini.correctedremaining;

public class ReportTool extends Tool implements Exportable{

	
	public void export() {
		System.out.println("RTool");
	}
	
	public static void main(String[] args) {
		Tool bTool = new Tool();
		Tool aTool = new ReportTool();
		callExport(aTool);
		callExport(bTool);

	}

	public static void callExport(Exportable ex) {

		ex.export();
		
	}
}
