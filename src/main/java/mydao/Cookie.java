package mydao;

public class Cookie {
    private long id;
    private String flavor;
    private boolean crunch;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isCrunch() {
        return crunch;
    }

    public void setCrunch(boolean crunch) {
        this.crunch = crunch;
    }

    public Cookie() {
    }

    public Cookie(long id, String flavor, boolean crunch) {
        this.id = id;
        this.flavor = flavor;
        this.crunch = crunch;
    }
}
