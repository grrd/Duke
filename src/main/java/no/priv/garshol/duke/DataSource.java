
package no.priv.garshol.duke;

import java.util.Iterator;

public interface DataSource {

  public Iterator<Record> getRecords();
  
}