package uk.gov.hmcts.ccd.domain.model.std;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public class CaseDataContent {
    private Event event;
    private Map<String, JsonNode> data;
    @JsonProperty("security_classification")
    private Map<String, JsonNode> securityClassification;
    @JsonProperty("event_token")
    private String token;
    @JsonProperty("ignore_warning")
    private Boolean ignoreWarning;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Map<String, JsonNode> getData() {
        return data;
    }

    public void setData(Map<String, JsonNode> data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getIgnoreWarning() {
        return ignoreWarning;
    }

    public CaseDataContent setIgnoreWarning(Boolean ignoreWarning) {
        this.ignoreWarning = ignoreWarning;
        return this;
    }
}
