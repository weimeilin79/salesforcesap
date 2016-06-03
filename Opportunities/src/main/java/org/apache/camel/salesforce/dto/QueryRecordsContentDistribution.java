/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 31 11:45:50 CST 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type ContentDistribution
 */
public class QueryRecordsContentDistribution extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<ContentDistribution> records;

    public List<ContentDistribution> getRecords() {
        return records;
    }

    public void setRecords(List<ContentDistribution> records) {
        this.records = records;
    }
}