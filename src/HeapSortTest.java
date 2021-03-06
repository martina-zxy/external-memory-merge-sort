import java.io.IOException;

public class HeapSortTest {
	private String inputfilePath;
	private String inputfileName;
	private String outputfilePath;
	private boolean debug;
	
	private int B;
	private int nn;
	
	public HeapSortTest(String inputFilePath, String outputFilePath, String fileName, boolean debug,   int B, int nn) {
		inputfilePath = inputFilePath;
		inputfileName = fileName;
		outputfilePath = outputFilePath;
		this.debug = debug;
		this.B = B;
		this.nn = nn > 0 ? nn : 1; 
	}
	
	public long[] run() throws IOException{
		
		long average[] = new long[2];
		average[0] = 0;
		average[1] = 0;		
		
		for (int i = 0; i < nn; i++) {
			IOStream4_Input input = new IOStream4_Input(inputfilePath + "\\" + inputfileName, B);
			HeapSort heapSort = new HeapSort(input, outputfilePath, B, debug);
			heapSort.sort();

			long[] elapsedSystemTimeUserTime = heapSort.getElapsedTime();
			
			average[0] += elapsedSystemTimeUserTime[0];
			average[1] += elapsedSystemTimeUserTime[1];
		}
		
		average[0] /= nn;
		average[1] /= nn;
		
		return average;
		
	}
}
