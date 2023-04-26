package ZLAGODA_project.DataBase;

import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataHolder {

    public DataHolder(){
        _columnNames = new LinkedList<>();
        _data = new LinkedList<>();
    }

    public LinkedList<String> _columnNames;
    public LinkedList<LinkedList<Object>> _data;

    public TWO<String[], String[][]> ConvertToSwingTableData(){
        String[] names = _columnNames.toArray(String[]::new);
        String[][] table = new String[_data.size()][_columnNames.size()];

        int y = 0;
        for (LinkedList<Object> datum : _data) {
            int x = 0;
            for (Object o : datum) {
                if(o != null){
                    table[y][x] = o.toString();
                }
                else{
                    table[y][x] = "NULL";
                }
                x++;
            }
            y++;
        }
        return new TWO<String[], String[][]>(names, table);
    }

}
