import FileEngineAf.*;

import java.util.Random;

public class ConfigurationEngine {
    private ConfigurationEngine() {
        // TODO: Impl me!
        System.out.println("ConfigurationEngine constructor without parameters");
    }

    public static ConfigurationEngine getInstance() {

        System.out.println("ConfigurationEngine getInstance");
        if (instance == null) {
            instance = new ConfigurationEngine();
        }
        return instance;
    }

    static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public IFileEngineAF createFileEngineAF() {
        if (fileEngineAFInstance == null) {
            switch (randomNumber(5)) {
                case 0:
                    return fileEngineAFInstance = new MSFileEngineAF();
                case 1:
                    return fileEngineAFInstance = new GoggleFileEngineAF();
                case 2:
                    return fileEngineAFInstance = new OracleFileEngineAF();
                case 3:
                    return fileEngineAFInstance = new IBMFileEngineAF();
                case 4:
                    return fileEngineAFInstance = new AppleFileEngineAF();
            }
        }
        return fileEngineAFInstance;
    }

    private static ConfigurationEngine instance;
    private static IFileEngineAF fileEngineAFInstance;
}
