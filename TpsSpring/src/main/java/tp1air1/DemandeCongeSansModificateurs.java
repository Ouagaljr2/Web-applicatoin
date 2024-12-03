package tp1air1;

public class DemandeCongeSansModificateurs {
    private Collaborateur collaborateur;
    private Periode periode;

    public DemandeCongeSansModificateurs(Collaborateur collaborateur, Periode periode) {
        this.collaborateur = collaborateur;
        this.periode = periode;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang.builder.ToStringBuilder(this)
            .append("collaborateur", collaborateur)
            .append("periode", periode)
            .toString();
    }
}
