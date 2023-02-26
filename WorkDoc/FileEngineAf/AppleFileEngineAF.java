package FileEngineAf;

import AVMsg.*;
import Doc.*;
import Email.*;
import Msg.*;
import Table.Complex.AppleComplexTable;
import Table.Hierarchical.AppleHierarchicalTable;
import Table.ITable;
import Table.Simple.AppleTable;

import java.util.Random;

public class AppleFileEngineAF implements IFileEngineAF {
    @Override
    public IDoc createDoc() {
        return new AppleDoc();
    }

    @Override
    public ITable createTable() {
        switch (randomNumber(3)) {
            case 0:
                return new AppleTable();
            case 1:
                return new AppleComplexTable();
            case 2:
                return new AppleHierarchicalTable();
        }
        return null;
    }

    @Override
    public IEmail createEmail() {
        return new AppleEmail();
    }

    @Override
    public IMsg createMsg() {
        return new AppleMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new AppleAVMsg();
    }

    static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
