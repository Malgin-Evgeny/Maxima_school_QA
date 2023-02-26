import AVMsg.IAVMsg;
import Doc.IDoc;
import Email.IEmail;
import FileEngineAf.IFileEngineAF;
import Msg.IMsg;
import Table.ITable;

public class Main {
    public static void main(String[] args){

        IDoc docForNewEmployee          = FileEngine.getInstance().createDoc();
        ITable tableForNewEmployee      = FileEngine.getInstance().createTable();
        IEmail emailForNewEmployee      = FileEngine.getInstance().createEmail();
        IMsg msgForNewEmployee          = FileEngine.getInstance().createMsg();
        IAVMsg avmsgForNewEmployee      = FileEngine.getInstance().createAVMsg();

        System.out.println(docForNewEmployee);
        System.out.println(tableForNewEmployee);
        System.out.println(emailForNewEmployee);
        System.out.println(msgForNewEmployee);
        System.out.println(avmsgForNewEmployee);

        IFileEngineAF fileEngineAF = ConfigurationEngine.getInstance().createFileEngineAF();

        IDoc docForNewEmployeeConsystent          = fileEngineAF.createDoc();
        ITable tableForNewEmployeeConsystent      = fileEngineAF.createTable();
        IEmail emailForNewEmployeeConsystent      = fileEngineAF.createEmail();
        IMsg msgForNewEmployeeConsystent          = fileEngineAF.createMsg();
        IAVMsg avmsgForNewEmployeeConsystent      = fileEngineAF.createAVMsg();

        System.out.println(docForNewEmployeeConsystent);
        System.out.println(tableForNewEmployeeConsystent);
        System.out.println(emailForNewEmployeeConsystent);
        System.out.println(msgForNewEmployeeConsystent);
        System.out.println(avmsgForNewEmployeeConsystent);
    }
}
