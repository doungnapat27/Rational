class Rational { 
    long numerator,denominator; 

    class Illegal extends Exception {
        String reason; 
        Illegal (String reason) { 
            this.reason = reason; 
        } 
    } 

    Rational() {
        // to be completed
        numerator = 0;
        denominator = 1;
    }

    Rational(long numerator, long denominator) throws Illegal { 
        // to be completed
        if (denominator == 0) {
            throw new Illegal("Denominator cannot be zero.");
        }

        // Store the numerator and denominator
        this.numerator = numerator;
        this.denominator = denominator;
    } 

    // find the reduce form 
    private void simplestForm() { 
        long computeGCD; 
        computeGCD = GCD(Math.abs(numerator), denominator); 
        numerator /= computeGCD; 
        denominator /= computeGCD; 
    } 

    // find the greatest common denominator 
    private long GCD(long a, long b) { 
        if (a%b ==0) return b; 
        else return GCD(b,a%b); 
    }

    /***
     * Compute an addition of the current rational number to another given rational number
     * @param x the rational number to be added to the current rational number
     */
    public void add(Rational x) { 
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = (denominator * x.denominator); 
        simplestForm(); 
    }

    /***
     * Compute a subtraction of the current rational number to another given rational number
     * @param x the rational number to be subtracted from the current rational number
     */
    public void subtract(Rational x) {
        // to be completed
        numerator = (numerator * x.denominator) - (x.numerator * denominator);
        denominator = (denominator * x.denominator);
        simplestForm();
    }

    /***
     * Compute a multiplication of the current rational number to another given rational number
     * @param x the rational number to be multiplied to the current rational number
     */
    public void multiply(Rational x) {
        // to be completed
        numerator = numerator * x.numerator;
        denominator = denominator * x.denominator;
        simplestForm();
    }

    /***
     * Compute a division of the current rational number to another given rational number
     * @param x the rational number to be divided by the current rational number
     */
    public void divide(Rational x) {
        // to be completed
        numerator = numerator * x.denominator;
        denominator = denominator * x.numerator;
        simplestForm();
    }

    /***
     * Check if the given rational number equals to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return true if the given rational number equals to the current, false otherwise
     */
    public boolean equals(Object x) {
        // to be completed
        // TODO: This needs to be modified.
        if (this == x) {
            return true;
        }
        if (x == null || getClass() != x.getClass()) {
            return false;
        }
        Rational rational = (Rational) x;
        return numerator == rational.numerator && denominator == rational.denominator;
    }

    /***
     * Compare the current rational number to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return -1 if the current rational number is less than the given number, 0 if they're equal, 1 if the current
     * rational number is larger than the given number
     */
    public long compareTo(Object x) {
        // to be completed
        // TODO: this needs to be modified.
        if (!(x instanceof Rational)) {
            throw new IllegalArgumentException("Cannot compare a Rational to a non-Rational object.");
        }

        Rational other = (Rational) x;
        long otherNumerator = other.numerator * this.denominator;
        long thisNumerator = this.numerator * other.denominator;

        if (thisNumerator < otherNumerator) {
            return -1;
        } else if (thisNumerator > otherNumerator) {
            return 1;
        } else {
            return 0;
        }
    }

    /***
     * Give the formatted string of the rational number
     * @return the string representation of the rational number. For example, "1/2", "3/4".
     */
    public String toString() { 
        // to be completed
        // TODO: This needs to be modified.
        if(this.denominator == 0){
            return "Invalid Rational";
        }
        simplestForm();
        if(this.numerator%this.denominator == 0){
            return String.valueOf(this.numerator/this.denominator);
        }
        else if(this.denominator < 0 && this.numerator < 0){
            return (-this.numerator)+"/"+(-this.denominator);
        }
        return this.numerator+"/"+this.denominator;
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");
    }
}