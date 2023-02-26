package FileEngineAf;

import AVMsg.*;
import Doc.*;
import Email.*;
import Msg.*;
import Table.Complex.IBMComplexTable;
import Table.Hierarchical.IBMHierarchicalTable;
import Table.ITable;
import Table.Simple.IBMTable;

import java.util.Random;

public class IBMFileEngineAF implements IFileEngineAF {
    @Override
    public IDoc createDoc() {
        return new IBMDoc();
    }

    @Override
    public ITable createTable() {
        switch (randomNumber(3)) {
            case 0:
                return new IBMTable();
            case 1:
                return new IBMComplexTable();
            case 2:
                return new IBMHierarchicalTable();
        }
        return null;
    }

    @Override
    public IEmail createEmail() {
        return new IBMEmail();
    }

    @Override
    public IMsg createMsg() {
        return new IBMMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new IBMAVMsg();
    }

    static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
