package my_json;

public class CurrencyRate {
    private Double r030;
    private String txt;
    private Double rate;
    private String cc;

    public CurrencyRate(Double r030, String txt, Double rate, String cc) {
        this.r030 = r030;
        this.txt = txt;
        this.rate = rate;
        this.cc = cc;
    }

    public Double getR030() {
        return r030;
    }

    public void setR030(Double r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "r030=" + r030 +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                '}';
    }
}





