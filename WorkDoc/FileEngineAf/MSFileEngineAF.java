package FileEngineAf;

import AVMsg.*;
import Doc.*;
import Email.*;
import Msg.*;
import Table.Complex.MSComplexTable;
import Table.Hierarchical.MSHierarchicalTable;
import Table.ITable;
import Table.Simple.MSTable;

import java.util.Random;

public class MSFileEngineAF implements IFileEngineAF {
    public IDoc createDoc() {
        return new MSDoc();
    }

    public ITable createTable() {
        // Homework: Add rand method to get rand number from 0 to 2 and create corresponding Entity
        switch (randomNumber(3)) {
            case 0:
                return new MSTable();
            case 1:
                return new MSComplexTable();
            case 2:
                return new MSHierarchicalTable();
        }
        return null;
    }

    public IEmail createEmail() {
        return new MSEmail();
    }

    public IMsg createMsg() {
        return new MSMsg();
    }

    public IAVMsg createAVMsg() {
        return new MSAVMsg();
    }

    static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}

