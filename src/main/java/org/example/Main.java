package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.LAVA,true,8);
        Bed bed = new Bed("King-Size",2, 2,2,3);
        Ceiling ceiling = new Ceiling(5,PaintColor.WHITE);
        Wardrobe wardrobe = new Wardrobe(3,4,150);
        Wall wall1 = new Wall("South");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("North");
        Wall[] walls = new Wall[]{wall1, wall2, wall3, wall4};
        Room room1 = new Room(wall1, wall2, wall3, wall4, ceiling, lamp, new Carpet(3, 2,PaintColor.RED));
        Room room2 = new Room(wall1, wall2, wall3, wall4, ceiling, lamp);
        Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, ceiling,lamp,new Carpet(4, 6 ,PaintColor.WHITE),"Parent",bed,wardrobe);

        bedroom.createBedroom();
    }
}