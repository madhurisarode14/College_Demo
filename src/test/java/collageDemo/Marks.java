package collageDemo;

public class Marks {
    private int physic;
    private  int maths;
    private  int chemistry;

    @Override
    public String toString() {
        return "Marks{" +
                "physic=" + physic +
                ", maths=" + maths +
                ", chemistry=" + chemistry +
                '}';
    }

    public int getPhysic() {
        return physic;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public Marks(int physic, int maths, int chemistry) {
        this.physic = physic;
        this.maths = maths;
        this.chemistry = chemistry;
    }
}
