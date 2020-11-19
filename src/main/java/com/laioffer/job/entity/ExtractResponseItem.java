package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
// list of extractions (# of extractions based on # of maxKeywords)
public class ExtractResponseItem {
    public List<Extraction> extractions;
}
