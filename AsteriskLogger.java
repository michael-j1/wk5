package wk5;


	public class AsteriskLogger implements Logger{

		@Override
		public void log(String log) {
			// TODO Auto-generated method stub
		System.out.println("***"+ log + "***");	
		}

		@Override
		public void error(String error) {
		System.err.println("******************");
		System.err.println("***" + "Error: " + error + "***");
		System.err.println("******************");
			
		
		
		}}

