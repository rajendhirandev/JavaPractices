package Relationship;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Rajendhiran Easu
 * @date 27, October-2019
 */
public class Composition {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive("c", "1");
        hardDrive.storeData("Notepad");
        hardDrive.viewDriveDetails();
    }
}

class Data {
    private String dataSerialId, dataIndex;
    private List<String> dataName = new ArrayList<>();

    public void createData(String dataName) {
        this.dataSerialId = String.valueOf(System.currentTimeMillis());
        this.dataName.add(dataName);
        this.dataIndex = String.valueOf(new Random().nextInt());
    }

    public void displayData() {
        System.out.println("Serial Id: " + dataSerialId + " | Index: " + dataIndex);
        dataName.forEach(System.out::println);
    }
}

class HardDrive {
    String driveName, driveId;
    private final Data softData;

    public HardDrive(String driveName, String driveId) {
        this.driveName = driveName;
        this.driveId = driveId;
        softData = new Data();
    }

    public void storeData(String dataName) {
        softData.createData(dataName);
    }

    public void viewDriveDetails() {
        System.out.println("Drive Name: " + driveName + " | Drive Id: " + driveId);
        softData.displayData();
    }
}
