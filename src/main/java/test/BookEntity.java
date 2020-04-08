package test;

import javax.persistence.*;

@Entity
@Table(name = "book", schema = "hu")
public class BookEntity {
    private int id;
    private String mingzi;
    private String price;
    private String shuliang;
    private String zuozhe;


    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", mingzi='" + mingzi + '\'' +
                ", price='" + price + '\'' +
                ", shuliang='" + shuliang + '\'' +
                ", zuozhe='" + zuozhe + '\'' +
                '}';
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mingzi")
    public String getMingzi() {
        return mingzi;
    }

    public void setMingzi(String mingzi) {
        this.mingzi = mingzi;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "shuliang")
    public String getShuliang() {
        return shuliang;
    }

    public void setShuliang(String shuliang) {
        this.shuliang = shuliang;
    }

    @Basic
    @Column(name = "zuozhe")
    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        if (id != that.id) return false;
        if (mingzi != null ? !mingzi.equals(that.mingzi) : that.mingzi != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (shuliang != null ? !shuliang.equals(that.shuliang) : that.shuliang != null) return false;
        if (zuozhe != null ? !zuozhe.equals(that.zuozhe) : that.zuozhe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mingzi != null ? mingzi.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (shuliang != null ? shuliang.hashCode() : 0);
        result = 31 * result + (zuozhe != null ? zuozhe.hashCode() : 0);
        return result;
    }
}
