package com.example.crs.model.generic;

import com.example.crs.model.item.Item;
import com.example.crs.model.item.ItemType;

public final class RAM extends Item {
    private int capacity;
    private int speed;
    private int CASLatency;

    public RAM(String name, String model, String url, float price, ItemType itemType, String imageLink) {
        super(name, model, url, price, itemType, imageLink);

        if (!itemType.equals(ItemType.RAM)) {
            throw new IllegalArgumentException("Wrong Item type. Must be RAM");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCASLatency() {
        return CASLatency;
    }

    public void setCASLatency(int CASLatency) {
        this.CASLatency = CASLatency;
    }

    @Override
    public void setItemType(ItemType itemType) {
        if (!itemType.equals(ItemType.RAM)) {
            throw new IllegalArgumentException("Wrong Item type. Must be RAM");
        }

        super.setItemType(itemType);
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", speed=" + speed +
                ", CASLatency=" + CASLatency +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", model='" + getModel() + '\'' +
                ", url='" + getUrl() + '\'' +
                ", price=" + getPrice() +
                ", itemType=" + getItemType() +
                ", imageLink='" + getImageLink() + '\'' +
                '}';
    }
}