import AVMsg.*;
import Doc.*;
import Email.*;
import Msg.*;
import Table.Complex.*;
import Table.Hierarchical.*;
import Table.ITable;
import Table.Simple.*;

import java.util.Random;

public class FileEngine {
    private FileEngine() {
        System.out.println("FileEngine constructor without parameters");
    }

    public static FileEngine getInstance() {
        if (instance == null) {
            instance = new FileEngine();
        }
        return instance;
    }

    static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
    // NOTE: Factory method #1
    IDoc createDoc() {

        switch (randomNumber(5)) {
            case 0:
                return new MSDoc();
            case 1:
                return new GoogleDoc();
            case 2:
                return new OracleDoc();
            case 3:
                return new IBMDoc();
            case 4:
                return new AppleDoc();
        }
        return null;
    }

    // NOTE: Factory method #2
    ITable createTable() {
        switch (randomNumber(15)) {
            case 0:
                return new MSTable();
            case 1:
                return new GoogleTable();
            case 2:
                return new OracleTable();
            case 3:
                return new IBMTable();
            case 4:
                return new AppleTable();
            case 5:
                return new MSComplexTable();
            case 6:
                return new GoogleComplexTable();
            case 7:
                return new OracleComplexTable();
            case 8:
                return new IBMComplexTable();
            case 9:
                return new AppleComplexTable();
            case 10:
                return new MSHierarchicalTable();
            case 11:
                return new GoogleHierarchicalTable();
            case 12:
                return new OracleHierarchicalTable();
            case 13:
                return new IBMHierarchicalTable();
            case 14:
                return new AppleHierarchicalTable();
        }
        return null;
    }

    // NOTE: Factory method #3
    IEmail createEmail() {
        switch (randomNumber(5)) {
            case 0:
                return new MSEmail();
            case 1:
                return new GoogleEmail();
            case 2:
                return new OracleEmail();
            case 3:
                return new IBMEmail();
            case 4:
                return new AppleEmail();
        }
        return null;
    }

    // NOTE: Factory method #4
    IMsg createMsg() {
        switch (randomNumber(5)) {
            case 0:
                return new MSMsg();
            case 1:
                return new GoogleMsg();
            case 2:
                return new OracleMsg();
            case 3:
                return new IBMMsg();
            case 4:
                return new AppleMsg();
        }
        return null;
    }

    // NOTE: Factory method #5
    IAVMsg createAVMsg() {
        switch (randomNumber(5)) {
            case 0:
                return new MSAVMsg();
            case 1:
                return new GoggleAVMsg();
            case 2:
                return new OracleAVMsg();
            case 3:
                return new IBMAVMsg();
            case 4:
                return new AppleAVMsg();
        }
        return null;
    }

    private static FileEngine instance;
}
