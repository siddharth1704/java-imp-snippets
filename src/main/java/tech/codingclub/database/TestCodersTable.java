package tech.codingclub.database;

import tech.codingclub.entity.Coders;

public class TestCodersTable {

    public static void main(String[] args) {

        Coders code = new Coders("SPAMMER", 19L );

        //Insert this object into DB !

//           < ENTITY CLASS>
        //Insert
        new GenericDB<Coders>().addRow(tech.codingclub.tables.Coders.CODERS,code);
    }
}
