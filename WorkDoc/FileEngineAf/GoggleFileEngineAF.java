package FileEngineAf;

import AVMsg.*;
import Doc.*;
import Email.*;
import Msg.*;
import Table.Complex.GoogleComplexTable;
import Table.Hierarchical.GoogleHierarchicalTable;
import Table.ITable;
import Table.Simple.GoogleTable;

import java.util.Random;

public class GoggleFileEngineAF implements IFileEngineAF {
    @Override
    public IDoc createDoc() {
        return new GoogleDoc();
    }

    @Override
    public ITable createTable() {
        switch (randomNumber(3)) {
            case 0:
                return new GoogleTable();
            case 1:
                return new GoogleComplexTable();
            case 2:
                return new GoogleHierarchicalTable();
        }
        return null;
    }

    @Override
    public IEmail createEmail() {
        return new GoogleEmail();
    }

    @Override
    public IMsg createMsg() {
        return new GoogleMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new GoggleAVMsg();
    }

    static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
