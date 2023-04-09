public class Laptop {
    private String os;
    private Integer model;
    private Integer speed;
    private Integer ram;
    private Integer hd;
    private Integer price;
    private String color;

    public Laptop (String os, Integer model, Integer speed, Integer ram, Integer hd, Integer price, String color) {
        this.os = os;
        this.model = model;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.price = price;
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public Integer getModel() {
        return model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getHd() {
        return hd;
    }

    public Integer getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((speed == null) ? 0 : speed.hashCode());
        result = prime * result + ((ram == null) ? 0 : ram.hashCode());
        result = prime * result + ((hd == null) ? 0 : hd.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (speed == null) {
            if (other.speed != null)
                return false;
        } else if (!speed.equals(other.speed))
            return false;
        if (ram == null) {
            if (other.ram != null)
                return false;
        } else if (!ram.equals(other.ram))
            return false;
        if (hd == null) {
            if (other.hd != null)
                return false;
        } else if (!hd.equals(other.hd))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [os=" + os + ", model=" + model + ", speed=" + speed + ", ram=" + ram + ", hd=" + hd + ", price="
                + price + ", color=" + color + "]";
    }
}
