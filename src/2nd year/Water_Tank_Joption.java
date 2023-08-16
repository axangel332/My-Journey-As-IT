package test2;

import javax.swing.*;

abstract class WaterTank {
    public abstract void watertank();

    public abstract void addWater(float gallons);

    public abstract void removeWater(float gallons);

    public abstract float currentLevel();

    public abstract boolean isFull();

    public abstract boolean isEmpty();
}

public class bb extends WaterTank {
    float level = (float) 0.00;

    /**
     * @wbp.parser.entryPoint
     */
    public void watertank() {
        level = 10000;
    }

    public void addWater(float gallons) {
        level = level + gallons;
    }

    public void removeWater(float gallons) {
        level = level - gallons;
    }

    public float currentLevel() {
        return level;
    }

    public boolean isFull() {
        return level == 10000;
    }

    public boolean isEmpty() {
        return level == 0.00;
    }

    public static void main(String[] args) {
        WaterTank tank = new bb();
        int choice;
        char ans;
        float gallons;
        do {
            String menu = "Water Tank Maximum Capacity: 10,000 gallons of Water\n"
                    + "Water Tank Current Level: " + tank.currentLevel() + " gallons of water\n"
                    + "Water Tank Empty: " + tank.isEmpty() + "\n"
                    + "Water Tank Full: " + tank.isFull() + "\n\n"
                    + "MENU OPTIONS\n"
                    + "[1] ADD WATER\n"
                    + "[2] REMOVE WATER\n"
                    + "[3] Exit\n"
                    + "Select <1,2,3>: ";

            choice = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (choice) {
                case 1:
                    String addInput = JOptionPane.showInputDialog("How many gallons of water will you add?");
                    gallons = Float.parseFloat(addInput);
                    if (gallons + tank.currentLevel() > 10000) {
                        JOptionPane.showMessageDialog(null, "Water tank will overflow. You exceed the limit.");
                    } else {
                        tank.addWater(gallons);
                    }
                    break;
                case 2:
                    String removeInput = JOptionPane.showInputDialog("How many gallons of water will you remove?");
                    gallons = Float.parseFloat(removeInput);
                    if (tank.currentLevel() - gallons < 0) {
                        JOptionPane.showMessageDialog(null, "No more water in the tank.");
                    } else {
                        tank.removeWater(gallons);
                    }
                    break;
                case 3:
                    System.exit(0);
            }
            ans = JOptionPane.showInputDialog("Try again? Press Y or y:").charAt(0);
        } while (ans == 'y' || ans == 'Y');
    }
}
