package mkolodziejski.webapp.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handler {

    void handle(HttpServletRequest request, HttpServletResponse response);
}
