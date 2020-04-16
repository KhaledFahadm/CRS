package com.example.crs.model.desktop;

import com.example.crs.model.generic.Ports;
import com.example.crs.model.item.Item;
import com.example.crs.model.item.ItemType;

import java.util.ArrayList;




     class MotherBoards {
         public enum motherboard {
             MICRO_ATX("Micro ATX"),
             ATX("ATX"),
             MINI_ITX("Mini-ITX");

             String name;

             motherboard(String name) {
                 this.name = name;
             }
         }

         private class MotherBoard {
             motherboard motherboard;

             private MotherBoard(motherboard motherboard) {
                 this.motherboard = motherboard;
             }

             public String toString() {
                 return "Motherboard Compatibility " + motherboard.name;
             }


         }

         private ArrayList<MotherBoard> motherBoards;
         public MotherBoards() {
             motherBoards = new ArrayList<>();
         }

         public void addMB(motherboard motherboard) {
             motherBoards. add(new MotherBoard(motherboard));
         }

         @Override
         public String toString() {
             StringBuilder stringBuilder = new StringBuilder();
             for (MotherBoard motherBoard : motherBoards) {
                 stringBuilder.append(motherBoard).append("\ ");
             }
             return stringBuilder.toString();
         }
     }



    class Fan{
        public enum Side{
            FRONT("Front"),
            REAR("Rear"),
            TOP("Top");
            String name;
            Side(String name){
                this.name = name;
            }
        }

        private class FanOption {
            int count;
            float size;
            Side side;


            private FanOption(int count, float size, Side side) {
                this.count = count;
                this.size = size;
                this.side = side;

            }

            @Override
            public String toString() {
                return side + ": " + count + " x " + size;

            }
        }

            private ArrayList<FanOption> fan;

            public Fan() {
                fan = new ArrayList<>();
            }

        public void addFan(int count, float size, Side side) {
            fan. add(new FanOption(count, size, side));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (FanOption port : fan) {
                stringBuilder.append(port).append("\n");
            }
            return stringBuilder.toString();
        }
    }







  class Expansion{
    public enum Expansionss{

        INTERNAL_5_25_Drive_Bays("Internal 5.25 Drive Bays"),
        INTERNAL_3_5_Drive_Bays("Internal 3.5 Drive Bays"),
        INTERNAL_2_5_Drive_Bays("Internal 2.5 Drive Bays"),
        EXPANSION_SLOTS("Expansion slots");


        String name;
        Expansionss(String name) {
            this.name = name;
        }

    }



private class Expansions {
    int count;
    Expansionss expansionss;

    private Expansions(int count, Expansionss expansionss) {
        this.count = count;
        this.expansionss = expansionss;
    }


    @Override
    public String toString() {
        return count + " x " + expansionss.name;
    }
}

    private ArrayList<Expansions> expansion;

    public Expansion() {
        expansion = new ArrayList<>();
    }

    public void addExpansions(Expansionss expansionss, int count) {
        expansion. add(new Expansions(count, expansionss));
    }

    @NotNull
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Expansions expansions : expansion) {
            stringBuilder.append(expansions).append("\n");
        }
        return stringBuilder.toString();
    }
}



public final class Case extends Item {
    private Ports ports;
    private String color;
    private boolean power_supply;
    private float height;
    private float width;
    private float depth;
    private float weight;
    private Expansion Expansions;
    private float GPU_Length;
    private float CPU_Cooler_Height;
    private Fan fan;
    private MotherBoards MotherBoards;

    public Ports getPorts() {
        return ports;
    }

    public void setPorts(Ports ports) {
        this.ports = ports;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPower_supply() {
        return power_supply;
    }

    public void setPower_supply(boolean power_supply) {
        this.power_supply = power_supply;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Expansion getExpansions() {
        return Expansions;
    }

    public void setExpansions(Expansion expansions) {
        Expansions = expansions;
    }

    public float getGPU_Length() {
        return GPU_Length;
    }

    public void setGPU_Length(float GPU_Length) {
        this.GPU_Length = GPU_Length;
    }

    public float getCPU_Cooler_Height() {
        return CPU_Cooler_Height;
    }

    public void setCPU_Cooler_Height(float CPU_Cooler_Height) {
        this.CPU_Cooler_Height = CPU_Cooler_Height;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public com.example.crs.model.desktop.MotherBoards getMotherBoards() {
        return MotherBoards;
    }

    public void setMotherBoards(com.example.crs.model.desktop.MotherBoards motherBoards) {
        MotherBoards = motherBoards;
    }

    private enum Size{
    FULL_TOWER("Full tower"),
    MID_TOWER("mid-tower"),
    MINI_ITX("Mini-ITX"),
    SMALL_FROM_FACTOR("Small-from-factor ,SSF"),
    DESKTOP("Desktop"),
    SLIM_LINE_CASE("Slim Line Case");


        String name;
        Size(String name) {
            this.name = name;
        }
    }




    public Case(String name, String model, String url, float price, ItemType itemType, String imageLink) {
        super(name, model, url, price, itemType, imageLink);
    }




}