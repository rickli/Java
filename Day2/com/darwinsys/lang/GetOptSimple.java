package com.darwinsys.lang;

public class GetOptSimple {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GetOpt go = new GetOpt("h");
		char c;
		while ((c = go.getopt(args)) != 0) {
			switch(c) { 
				case 'h':
		                    helpAndExit(0);
		                    break; 
		        default:
		                    System.err.println("Unknown option in " +
		                        args[go.getOptInd()-1]);
		                    helpAndExit(1);
		    }
		}
		System.out.println("Hello World~");
	}
	
	/** Stub for providing help on usage
     * You can write a longer help than this, certainly.
     */
	static void helpAndExit(int returnValue) {
		System.err.println("This would tell you how to use this program");
		System.exit(returnValue);
	}

}
