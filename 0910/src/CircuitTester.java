public class CircuitTester {

  	public void testOr() {
		System.out.println("\nTesting OrGate");
		Input in1 = new Input();
		Input in2 = new Input();
		Circuit or = new DoubleInputCircuit(in1, in2, new OrGate());
		for (int i = 0; i < 2; i++) {
			in1.setValue(i == 1);
			for (int j = 0; j < 2; j++) {
				in2.setValue(j == 1);
				System.out
						.printf("Input: %s, %s\t", in1.output(), in2.output());
				boolean o = or.output();
				System.out.printf("Output: %s\t", o);
				boolean success = (o == (in1.output() || in2.output()));
				System.out.printf("Result: %s\n", (success ? "Success"
						: "Failure"));
			}
		}
	}



    /* ********************************************************
     *  All the following tests are to be added by the students
     **********************************************************
     */
	
    public void TestAnd() {
	//ADD CODE HERE
				
    }
	
    public void TestNeg() {
	//ADD CODE HERE
    }
	
    public void TestDblNeg() {
	//ADD CODE HERE
    }

    public void TestXor() {
	//ADD CODE HERE
    }
		
    public static void main(String[] args) {
		
	CircuitTester tester = new CircuitTester();
	
        tester.TestOr();
        tester.TestAnd();
        tester.TestNeg();
        tester.TestDblNeg();
        tester.TestXor();
    }
	
}
