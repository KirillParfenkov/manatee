package by.parf.manatee.core.subject.bean;

import by.parf.manatee.core.subject.Type;

import java.util.Map;

/**
 * Created by parf on 13.6.15.
 */
public class MetaData {

    private long version;
    private Map<String, Type> fields;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MetaData() {
    }

    public MetaData( long version, Map<String, Type> fields) {
        this.fields = fields;
        this.version = version;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Map<String, Type> getFields() {
        return fields;
    }

    public void setFields(Map<String, Type> fieldMap) {
        this.fields = fieldMap;
    }
}
