package fwOO2.ejercicio1FW;


import java.util.Collection;

import java.util.List;

public interface DatabaseAccess {
    Collection<String> getSearchResults(String queryString);

    int insertNewRow(List<String> rowData);
}