package com.lauren.web.restclient.dto;

import java.util.List;

public class LogsDTO {
    private List<LogDTO> logs;

    public List<LogDTO> getLogs() {
        return logs;
    }

    public void setLogs(List<LogDTO> logs) {
        this.logs = logs;
    }
}
