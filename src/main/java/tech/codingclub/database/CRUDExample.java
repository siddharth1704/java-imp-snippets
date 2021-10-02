package tech.codingclub.database;

import tech.codingclub.entity.Coders;

import java.util.Date;
import java.util.List;

public class CRUDExample {
    public static void main(String[] args) {
        System.out.println("This is siddharth");
        System.out.println("Reading rows at "+new Date().toString());
        //One row
        Coders coder= new GenericDB<Coders>().getRow(tech.codingclub.tables.Coders.CODERS,Coders.class,null);
        //All rows
        readTable();
        //Update
        new GenericDB<String>().updateColumn(tech.codingclub.tables.Coders.CODERS.NAME,"Siddharth Singh",tech.codingclub.tables.Coders.CODERS,tech.codingclub.tables.Coders.CODERS.NAME.eq("Siddharth"));
        readTable();
    }

    private static void readTable() {
        List<Coders> rows=(List<Coders>)GenericDB.getRows(tech.codingclub.tables.Coders.CODERS,Coders.class,null,null);

        for(Coders row: rows){
            System.out.println(row.getName()+":"+row.getAge());
        }
    }
}
