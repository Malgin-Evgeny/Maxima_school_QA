package FileEngineAf;

import AVMsg.*;
import Doc.*;
import Email.*;
import Msg.*;
import Table.Complex.OracleComplexTable;
import Table.Hierarchical.OracleHierarchicalTable;
import Table.ITable;
import Table.Simple.OracleTable;

import java.util.Random;

public class OracleFileEngineAF implements IFileEngineAF {
    @Override
    public IDoc createDoc() {
        return new OracleDoc();
    }

    @Override
    public ITable createTable() {
        switch (randomNumber(3)) {
            case 0:
                return new OracleTable();
            case 1:
                return new OracleComplexTable();
            case 2:
                return new OracleHierarchicalTable();
        }
        return null;
    }

    @Override
    public IEmail createEmail() {
        return new OracleEmail();
    }

    @Override
    public IMsg createMsg() {
        return new OracleMsg();
    }

    @Override
    public IAVMsg createAVMsg() {
        return new OracleAVMsg();
    }

    static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
