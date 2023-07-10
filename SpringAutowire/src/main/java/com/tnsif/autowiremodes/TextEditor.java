package com.tnsif.autowiremodes;

public class TextEditor {
	//DI in the form of objects
			private SpellChecker checker;
			
			//DI using constructor
			public TextEditor(SpellChecker checker) {
				super();
				this.checker = checker;
				System.out.println("DI using constructor");
			}

			//setters and getters method
			public SpellChecker getChecker() {
				return checker;
			}

			public void setChecker(SpellChecker checker) {
				this.checker = checker;
			}


			public void display()
			{
				checker.checkSpelling();
			}
			

}
