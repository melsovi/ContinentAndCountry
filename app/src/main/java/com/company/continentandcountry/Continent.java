package com.company.continentandcountry;

public class Continent {
    private String name;
    private int image;
    private Integer keyId;

    public Continent(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public Continent(String name, int image, Integer keyId) {
        this.name = name;
        this.image = image;
        this.keyId = keyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }
}
