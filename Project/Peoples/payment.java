public interface payment {   // interface can only have public(public static final)

    public void setSalary(int salary); // abstractmethod
    public int getSalary();
    public void setRaise(double raise);
    public double getRaise();
    public double afterRaise();
}
