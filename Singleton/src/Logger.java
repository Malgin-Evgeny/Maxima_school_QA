public class Logger {
    private static  Logger logger;
    private static String logFile = "Это лог файл. \n\n";

    private Logger(){
    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void addLog(String logs){
       logFile +=  logs + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
