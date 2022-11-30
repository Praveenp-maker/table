class Equhash {
    String name;
    int id;

    public Equhash(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Equhash equ = (Equhash) obj;

        return (equ.name == this.name && equ.id == this.id);
    }

    @Override
    public int hashCode() {

        return this.id;
    }

}

public class Equ {
    public static void main(String[] args) {
        Equhash g1 = new Equhash("ab", 1);
        Equhash g2 = new Equhash("aa", 1);

        // comparing above created Objects.
        if (g1.hashCode() == g2.hashCode()) {

            if (g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");

        } else
            System.out.println("Both Objects are not equal. ");
    }
}
