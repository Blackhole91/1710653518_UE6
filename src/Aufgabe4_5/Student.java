package Aufgabe4_5;

public class Student {
    private  String name;
    private int matrikelNummer;
    private int jahrgang;

    public Student(String name, int matrikelNummer, int jahrgang) {
        this.setName(name);
        this.setMatrikelNummer(matrikelNummer);
        this.setJahrgang(jahrgang);
    }

    @Override
    public String toString(){
        return this.getMatrikelNummer()+" ; "+this.getJahrgang()+" ; "+this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(int matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }
}
