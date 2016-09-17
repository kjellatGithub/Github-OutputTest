package textfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;

public class CalcFaculty {
	public BigInteger bigint;
	public ArrayList<BigInteger> bigintlist;
	public long value;
	public String filename;

	CalcFaculty(long value, String filename) {

		bigintlist = new ArrayList<BigInteger>();
		this.value = value;
		this.filename = filename;
	}

	public void fillBigIntList() throws FileNotFoundException {
		int index = 1;

		if(filename == "") {
			filename = "default.txt";
		}

		for (long i = 1; i <= value; i++) {
			bigintlist.add(calcFaculty(i));
		}

		File file = new File(filename);
		PrintWriter output = new PrintWriter(file);

		for (BigInteger temp : bigintlist) {
			output.println("Faculty(" + index + ") = " + temp);
			index++;
		}
		output.close();

	}

	public BigInteger calcFaculty(long value) {
		BigInteger b1, result;
		long value1 = value;

		// Har avbryts rekursiviteten
		if (value == 1) {
			return BigInteger.ONE;
		}

		// Här genereras rekursiviteten
		value = value - 1;
		b1 = BigInteger.valueOf(value1);
		result = b1.multiply(calcFaculty(value));
		return result;

	}

}
