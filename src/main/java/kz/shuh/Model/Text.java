package kz.shuh.Model;

import javax.persistence.*;

/**
 * @author Shuhratjan Nizamov
 */
//@Entity
//@Table
public class Text {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   // @Column
    private String text;

    public Text(){}

    public Text(Integer id, String text){
        this.id=id;
        this.text=text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
