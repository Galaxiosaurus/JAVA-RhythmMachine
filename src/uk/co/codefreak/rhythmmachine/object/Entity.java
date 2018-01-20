package uk.co.codefreak.rhythmmachine.object;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Entity {

    private int id;
    private String name;

    private Color entityColour;

    // Type -> 0 = Player, 1 = NPC, 2 = Item
    private int entityType;

    // Physics Type -> 0 = Not Solid (haha), 1 = Solid
    private int physType;

    private int xPos = 0;
    private int yPos = 0;

    public Entity() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Color getEntityColour() {
        return entityColour;
    }

    public int getEntityType() {
        return entityType;
    }

    public int getPhysType() {
        return physType;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEntityColour(Color colour) {
        this.entityColour = colour;
    }

    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }

    public void setPhysType(int physType) {
        this.physType = physType;
    }

    public boolean isSolid() {
        return physType == 1;
    }

    public void setXPos(int pos) {
        xPos = pos;
    }

    public void setYPos(int pos) {
        yPos = pos;
    }

    public void incXPos() {
        xPos++;
    }

    public void incYPos() {
        yPos++;
    }

    public void decXPos() {
        xPos--;
    }

    public void decYPos() {
        yPos--;
    }

    private String randomName() {
        try(BufferedReader br = new BufferedReader(new FileReader("src/resources/textfiles/names.txt"))) {
            return br.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return "John";
    }

    public String toString() {
        return name;
    }

}
