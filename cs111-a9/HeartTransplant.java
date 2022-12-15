/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {

        this.patients=null;
        this.survivabilityByAge=null;
        this.survivabilityByCause=null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {
        return patients;
        // WRITE YOUR CODE HERE
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        return survivabilityByAge;
        // WRITE YOUR CODE HERE
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        return survivabilityByCause;
        // WRITE YOUR CODE HERE
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        int i;
        patients = new Patient[numberOfLines];
        for (i=0; i < numberOfLines && StdIn.hasNextLine(); i++) {
            int id, ethnicity, gender, age, cause, urgency, stateOfHealth;
            id = StdIn.readInt();
            ethnicity = StdIn.readInt();
            gender = StdIn.readInt();
            age = StdIn.readInt();
            cause = StdIn.readInt();
            urgency = StdIn.readInt();
            stateOfHealth = StdIn.readInt();
            patients[i] = new Patient(id, ethnicity, gender, age, cause, urgency,stateOfHealth);
        }
        // WRITE YOUR CODE HERE
    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        survivabilityByAge = new SurvivabilityByAge();
        int i;
        for (i = 0; i < numberOfLines && StdIn.hasNextLine(); i++) {
            int age, years;double rates;
            age = StdIn.readInt();
            years = StdIn.readInt();
            rates = StdIn.readDouble();
            survivabilityByAge.addData(age, years, rates);
            
        }
        // WRITE YOUR CODE HERE
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        survivabilityByCause = new SurvivabilityByCause();
        for (int i = 0; i < numberOfLines && StdIn.hasNextLine(); i++) {
            int cause, years;
            double rates;
            cause = StdIn.readInt();
            years = StdIn.readInt();
            rates = StdIn.readDouble();
            survivabilityByCause.addData(cause, years, rates);
            
        }
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        int cnt = 0;
        for (int i = 0; i<patients.length; i++) {
            if (patients[i].getAge()>age)
            {cnt++;}
        }
            Patient[] p = new Patient[cnt];
        for (int i=0, j=0; i<patients.length && j<cnt; i++) {
            if (patients[i].getAge()>age) {
                p[j] = patients[i];}
                j++;
            }
            if(cnt > 0){
                return p;
            }
            return null;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {

        int cnt = 0;
        for (int i=0; i<patients.length; i++) {
            if (patients[i].getCause()==cause){
                cnt++;
            }
            }
            Patient[] pc = new Patient[cnt];
            for (int i =0, j=0; i<patients.length && j<cnt; i++) {
                if (patients[i].getCause()==cause){
                    pc[j] = patients[i];
                    j++;
                }
                }
            if(cnt > 0){
                return pc;}
            return null;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {

        int cnt = 0;
        for (int i = 0; i<patients.length; i++) {
            if (patients[i].getUrgency()==urgency) {cnt++;
            }
        }
        Patient[] pv = new Patient[cnt];
        for (int i=0, j=0; i<patients.length && j<cnt; i++) {
            if (patients[i].getUrgency()==urgency) {
                pv[j] = patients[i];
                j++;
            }} 
                return pv;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {

        int cnt = 0;
        for (int i = 0; i<patients.length; i++) {
            if (patients[i].getUrgency()==1) {cnt++;
            }
        }
        Patient[] c = new Patient[cnt];
        for (int i=0, j=0; i<patients.length && j<cnt; i++) {
            if (patients[i].getUrgency()==1) {
                c[j] = patients[i];}} 
                return c[cnt];
    }
}
