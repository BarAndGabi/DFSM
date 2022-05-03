import static org.junit.Assert.*;

import org.junit.Test;

import ac.il.afeka.fsm.DFSM;
import ac.il.afeka.fsm.NDFSM;

public class TestConvert {

	@Test
	public void test() throws Exception {

		String encodingN = "0 1 2 3/a b/2,a,0; 0,,1;1,a,1;1,a,2;1,b,2;2,a,2;2,b,3;3,b,1/0/0";
		String encoding = "0 1 2 3 4 5 6 7 8/a b/0,a,1;0,b,2;1,a,3;1,b,7;2,a,3;2,b,4;3,a,3;3,b,7;4,a,5;4,b,6;5,a,5;5,b,5;6,a,1;6,b,2;7,a,3;7,b,8;8,a,1;8,b,1/0/0 3";
		NDFSM aNDFSM = new NDFSM(encodingN);
		DFSM aDFSM = new DFSM(encoding);
		assertTrue(aDFSM.encode().equals(aNDFSM.toDFSM().toCanonicForm().encode()));
	}

}
