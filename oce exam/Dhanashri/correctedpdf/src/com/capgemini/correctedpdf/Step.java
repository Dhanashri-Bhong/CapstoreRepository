package com.capgemini.correctedpdf;

interface Downloadable{
	public void download();
}
interface Readablee extends Downloadable{
	public void readBook();
}
abstract class Boook implements Readablee{
	public void readBook() {
		System.out.println("fghjkl");
	}
}
 class Eboook extends Boook{

	public void readBook() {
		
	}

	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}

}
