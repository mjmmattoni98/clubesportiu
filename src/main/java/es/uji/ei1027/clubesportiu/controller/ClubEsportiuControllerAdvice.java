package es.uji.ei1027.clubesportiu.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ClubEsportiuControllerAdvice {

    @ExceptionHandler(value = ClubEsportiuException.class)
    public ModelAndView handleClubException(ClubEsportiuException ex){

        ModelAndView mav = new ModelAndView("error/exceptionError");
        mav.addObject("message", ex.getMessage());
        mav.addObject("errorName", ex.getErrorName());
        return mav;
    }

}
