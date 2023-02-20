public class Main {
    public static void main(String[] args) {
      Logger.getLogger().addLog("Первый лог ");
      Logger.getLogger().addLog("Второй лог ");
      Logger.getLogger().addLog("Третий лог ");
      Logger.getLogger().addLog("Четвертый лог ");
      Logger.getLogger().addLog("Пятый лог ");

      Logger.getLogger().showLogFile();
    }
}