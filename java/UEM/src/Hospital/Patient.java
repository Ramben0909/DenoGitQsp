package Hospital;

public class Patient {
    private String name;
    private int patientno;
    private static int gennumber = 23781;
    private int accountno;
    private String email;

    public Patient(String name, int accountno, String email) {
        this.name = name;
        this.patientno = gennumber;
        gennumber++;
        this.accountno = accountno;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

	public int getPatientNo() {
		
		return patientno;
	}
}