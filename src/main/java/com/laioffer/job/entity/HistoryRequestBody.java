package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

// POST request: favorite a job
public class HistoryRequestBody {
    @JsonProperty("user_id")
    public String userId;
    public Item favorite;
}
