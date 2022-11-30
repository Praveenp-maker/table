public class Equhash {
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
