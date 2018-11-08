package io.zipcoder.tc_spring_poll_application.io.zipcoder.tc_spring_poll_application.dto.error;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidationError {

    private String code;
    private String message;

    private Map<String, List<ValidationError>> errors = new HashMap<String, List<ValidationError>>();
}
