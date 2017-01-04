import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		String inputFilePath = "C:\\Users\\pandu.wicaksono91\\Documents\\GitHub\\external-memory-merge-sort\\Merge Input\\";
		String outputFilePath = "C:\\Users\\pandu.wicaksono91\\Documents\\GitHub\\external-memory-merge-sort\\Merge Output\\";
		
		boolean isGenerateFile = false; //generate new file or use the existing one
		boolean debug = false; //print normal file with readable int
		List<String> listResult = new ArrayList<String>();
		
		int M = 250000;
		int d = 64;
		int N = 32000000;
		int B = 32768;
		int nn = 10;
		
		int Narray[] = {15625,31250,62500,
				125000,250000,500000,
				1000000,2000000,
				4000000,8000000,16000000,32000000};
		
		if(isGenerateFile) {
			for (int nTest : Narray) {
				FileGenerator generator = new FileGenerator(nTest, inputFilePath, "input" + nTest + ".data");
				generator.generateFile();
			}
		}
		
		// N test B = 32,768
//		M = 250000;
//		d = 2;
//		B = 32768;
//		System.out.println("Increase the number of N using M=" + M + " d=" + d + " b=" + B);
//		
//		for (int ii = 5; ii <= 11; ii++ ){
//			String inputFileName = "input" + Narray[ii] + ".data";
//			MergeSortTest mergeSort = new MergeSortTest(inputFilePath, outputFilePath, inputFileName, debug, M, d, Narray[ii], B, nn);
//			long result[] = mergeSort.run();
//			
//			String str = "Average time for External Multi-way Merge-sort with M=" + M + " d=" + d + " Nelements="
//					+ Narray[ii] + " times=" + nn + "(in SystemTime & UserTime);" 
//					+ result[0] + ";" + result[1] ;
//			System.out.println(str);
//			listResult.add(str);
//		}
		
//		System.out.println("============FINAL RESULT============");
//		for(String s : listResult) {
//			System.out.println(s);
//		}
		
		// N test B = 32,768
//		M = 250000;
//		d = 2;
//		B = 8388608;
//		System.out.println("Increase the number of N using M=" + M + " d=" + d + " b=" + B);
//		
//		for (int ii = 5; ii <= 11; ii++ ){
//			String inputFileName = "input" + Narray[ii] + ".data";
//			MergeSortTest mergeSort = new MergeSortTest(inputFilePath, outputFilePath, inputFileName, debug, M, d, Narray[ii], B, nn);
//			long result[] = mergeSort.run();
//			
//			String str = "Average time for External Multi-way Merge-sort with M=" + M + " d=" + d + " Nelements="
//					+ Narray[ii] + " times=" + nn + "(in SystemTime & UserTime);" 
//					+ result[0] + ";" + result[1] ;
//			System.out.println(str);
//			listResult.add(str);
//		}
//		
//		isGenerateFile = false;
//		
//		// M test B = 32,768
		N = 2000000;
		d = 2;
		B = 32768;
		System.out.println("Increase the number of M using N=" + N + " d=" + d + " b=" + B);
		
		for (int ii = 0; ii <= 6; ii++ ){
			String inputFileName = "input" + N + ".data";
			M = Narray[ii];
			MergeSortTest mergeSort = new MergeSortTest(inputFilePath, outputFilePath, inputFileName, debug, M, d, N, B, nn);
			long result[] = mergeSort.run();
			
			String str = "Average time for External Multi-way Merge-sort with M=" + M + " d=" + d + " Nelements="
					+ N + " times=" + nn + "(in SystemTime & UserTime);" 
					+ result[0] + ";" + result[1] ;
			System.out.println(str);
			listResult.add(str);
		}
		
		// M test B = 8,388,608
		N = 32000000;
		d = 2;
		B = 8388608;
		System.out.println("Increase the number of M using N=" + N + " d=" + d + " b=" + B);
		
		for (int ii = 2; ii <= 9; ii++ ){
			String inputFileName = "input" + N + ".data";
			M = Narray[ii];
			MergeSortTest mergeSort = new MergeSortTest(inputFilePath, outputFilePath, inputFileName, debug, M, d, N, B, nn);
			long result[] = mergeSort.run();
			
			String str = "Average time for External Multi-way Merge-sort with M=" + M + " d=" + d + " Nelements="
					+ N + " times=" + nn + "(in SystemTime & UserTime);" 
					+ result[0] + ";" + result[1] ;
			System.out.println(str);
			listResult.add(str);
		}
		
//		isGenerateFile = false;
		
		// d test B = 32,768
//		N = 2000000;
//		M = 250000;
//		d = 2;
//		B = 32768;
//		System.out.println("Increase the number of d using N=" + N + " M=" + M + " b=" + B);
//		
//		for (int ii = 1; ii <= 3; ii++ ){
//			int currD = (int) Math.pow(d, ii);
//			String inputFileName = "input" + N + ".data";
//			
//			MergeSortTest mergeSort = new MergeSortTest(inputFilePath, outputFilePath, inputFileName, debug, M, currD , N, B, nn);
//			long result[] = mergeSort.run();
//			
//			String str = "Average time for External Multi-way Merge-sort with M=" + M + " d=" + currD + " Nelements="
//					+ N + " times=" + nn + "(in SystemTime & UserTime);" 
//					+ result[0] + ";" + result[1] ;
//			System.out.println(str);
//			listResult.add(str);
//		}
		
		// d test B = 8,388,608
//		N = 32000000;
//		M = 250000;
//		d = 2;
//		B = 8388608;
//		System.out.println("Increase the number of d using N=" + N + " M=" + M + " b=" + B);
//		
//		for (int ii = 1; ii <= 7; ii++ ){
//			int currD = (int) Math.pow(d, ii);
//			String inputFileName = "input" + N + ".data";
//			
//			MergeSortTest mergeSort = new MergeSortTest(inputFilePath, outputFilePath, inputFileName, debug, M, currD, N, B, nn);
//			long result[] = mergeSort.run();
//			
//			String str = "Average time for External Multi-way Merge-sort with M=" + M + " d=" + currD + " Nelements="
//					+ N + " times=" + nn + "(in SystemTime & UserTime);" 
//					+ result[0] + ";" + result[1] ;
//			System.out.println(str);
//			listResult.add(str);
//		}
		
	}
}
