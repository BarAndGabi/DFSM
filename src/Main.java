import java.util.Arrays;
import java.util.List;

import ac.il.afeka.Submission.Submission;
import ac.il.afeka.fsm.DFSM;

public class Main implements Submission, Assignment1 {

	
	@Override
	public List<String> submittingStudentIds() {
		return Arrays.asList("206921777", "206215311");
	}

	@Override
	public boolean compute(String dfsmEncoding, String input) throws Exception {
		DFSM d = new DFSM(dfsmEncoding);
		return d.compute(input);
	}

}
