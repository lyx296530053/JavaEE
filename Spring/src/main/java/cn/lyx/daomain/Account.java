package cn.lyx.daomain;

import com.sun.jdi.IntegerType;
import org.springframework.stereotype.Component;

import java.io.Serializable;
public class Account implements Serializable {
    Integer id;
    String name;
    float money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
