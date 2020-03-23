package com.example.adapter;

public class Fruets {

    String apple ;
    String orange;

    public void setApple(String apple) {
        this.apple = apple;
    }

    public void setOrange(String orange) {
        this.orange = orange;
    }

    public String getApple() { return apple;
    }

    public String getOrange() {
        return orange;
    }

    public Fruets(String apple, String orange) {
        this.apple = apple;
        this.orange = orange;
    }
}
