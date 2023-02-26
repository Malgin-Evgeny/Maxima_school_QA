package FileEngineAf;

import AVMsg.*;
import Doc.*;
import Email.*;
import Msg.*;
import Table.ITable;

// Homework: Add Interface Impl for MS+, Google, Oracle, IBM and Apple
public interface IFileEngineAF {
    IDoc createDoc();

    ITable createTable();

    IEmail createEmail();

    IMsg createMsg();

    IAVMsg createAVMsg();
}
