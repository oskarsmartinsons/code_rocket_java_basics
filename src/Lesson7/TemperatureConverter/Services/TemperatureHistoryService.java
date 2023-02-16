package Lesson7.TemperatureConverter.Services;

import Lesson7.TemperatureConverter.ActionImplementations.ActionConvert;

public class TemperatureHistoryService {
    public void showHistory() {
         if (ActionConvert.allHistory.size()==0) {
             System.out.println("There are no conversion records in history.\n");
         } else {
             ActionConvert.allHistory.forEach(record -> System.out.println(
                    record.getTempFrom() + "" + record.getUnitFrom() + " -> " + record.getTempTo() + record.getUnitTo() +
                             ",  " + record.getTime()
             ));
             System.out.println();
         }
    }
}
