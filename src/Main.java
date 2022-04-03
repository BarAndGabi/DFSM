import java.util.Arrays;
import java.util.List;

import ac.il.afeka.Submission.Submission;

public class Main implements Submission, Assignment1 {

	@Override
	public List<String> submittingStudentIds() {
		return Arrays.asList("0123", "4567");
	}

	@Override
	public boolean compute(String dfsmEncoding, String input) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
