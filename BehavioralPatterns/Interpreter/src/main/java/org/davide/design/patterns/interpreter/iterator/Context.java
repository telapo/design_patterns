/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.interpreter.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;
import org.davide.design.patterns.interpreter.models.Row;

/**
 * This is the Context object.
 *
 * Contains global information for the interpreter.
 *
 * @author davide
 */
public class Context {

    // represent the tables that we are going to query
    private static Map<String, List<Row>> tables = new HashMap<>();
    private String table;
    private String column;
    private Predicate<String> whereFilter;

    public Context() {
        // populate the table
        List<Row> list = new ArrayList<>();
        list.add(new Row("John", "Doe"));
        list.add(new Row("Jan", "Kowalski"));
        list.add(new Row("Dominic", "Doom"));

        tables.put("people", list);
    }

    public static Map<String, List<Row>> getTables() {
        return tables;
    }

    public static void setTables(Map<String, List<Row>> aTables) {
        tables = aTables;
    }

    // search operation. Where does not work if select uses "*"
    public List<String> search() {
        List<Row> collected;
        if (whereFilter == null) {
            collected = tables.keySet().stream()
                    .filter(k -> k.equals(table))
                    .flatMap(k -> tables.get(k).stream())
                    .collect(toList());
            if (column.equalsIgnoreCase("name")) {
                return collected.stream()
                        .map(r -> r.getName())
                        .collect(toList());
            } else if (column.equalsIgnoreCase("surname")) {
                return collected.stream()
                        .map(r -> r.getSurname())
                        .collect(toList());
            } else if (column.equalsIgnoreCase("*")) {
                return collected.stream()
                        .map(r -> r.getName() + " - " + r.getSurname())
                        .collect(toList());
            } else {
                return new ArrayList<String>();
            }
        } else {
            collected = tables.keySet().stream()
                    .filter(k -> k.equals(table))
                    .flatMap(k -> tables.get(k).stream())
                    .collect(toList());
            if (column.equalsIgnoreCase("name")) {
                return collected.stream()
                        .map(r -> r.getName())
                        .filter(whereFilter)
                        .collect(toList());
            } else if (column.equalsIgnoreCase("surname")) {
                return collected.stream()
                        .map(r -> r.getSurname())
                        .filter(whereFilter)
                        .collect(toList());
            } else {
                return new ArrayList<String>();
            }
        }
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public Predicate<String> getFilter() {
        return whereFilter;
    }

    public void setFilter(Predicate<String> whereFilter) {
        this.whereFilter = whereFilter;
    }

}
