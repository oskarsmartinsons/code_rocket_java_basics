package Lesson7.TemperatureConverter;


public class ActionShowHistory implements ActionMenu{
    private final TemperatureHistoryService temperatureHistoryService;
    public ActionShowHistory(TemperatureHistoryService temperatureHistoryService) {
        this.temperatureHistoryService = temperatureHistoryService;
    }
    @Override
    public String getAction() {
        return "Show conversion history";
    }

    @Override
    public void executeAction() {
        System.out.println("\nHistory of conversion results:");
        temperatureHistoryService.showHistory();
    }
}
