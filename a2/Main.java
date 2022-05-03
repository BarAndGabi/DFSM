import java.util.Arrays;
import java.util.List;

import ac.il.afeka.Submission.Submission;
import ac.il.afeka.fsm.DFSM;
import ac.il.afeka.fsm.NDFSM;

public class Main implements Submission, Assignment3 {

	@Override
	public List<String> submittingStudentIds() {
		return Arrays.asList("206215311", "206921777z");
	}

	@Override
	public String convert(String ndfsm) throws Exception {

		NDFSM n = new NDFSM(ndfsm);
		DFSM d = n.toDFSM();
		return (d.encode());
	}

	public static String convert1(String ndfsm) throws Exception {

		NDFSM n = new NDFSM(ndfsm);
		DFSM d = n.toDFSM();
		return (d.encode());
	}

	public static void main(String args[]) throws Exception {
		String encodingN = " 1 2 3 4 5 6 7 8/a b c/1,b,1;1,,2;2,b,3;2,b,5;2,,7;3,a,4; 3,c,4;4,c,2;4,c,7;5,a,6;5,b,6;6,c,2; 6,c,7;6,,2;7,b,8/1/8";
		DFSM d = new DFSM("1 2 3 4 5 6 7 8 9 10/ a b c/1,a,10;1,c,10;1,b,2;2,a,5;2,b,3;2 ,c,4;3,a,5;3,b,3;3,c,9;4,a,10;4,b,1 0;4,c,7;5,a,10;5,b,6;5,c,7;6,a,5;6, b,8;6,c,4;7,a,10;7,b,6;7,c,10;8,a,1 0;8,b,6;8,c,7;9,a,10;9,b,6;9,c,7;10 ,a,10;10,b,10;10,c,10/1/3 5 7");
		NDFSM n = new NDFSM(encodingN);
		n.toDFSM().toCanonicForm().prettyPrint(System.out);
	}
}
