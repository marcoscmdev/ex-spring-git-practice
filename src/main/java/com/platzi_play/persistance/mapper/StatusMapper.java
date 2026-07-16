package com.platzi_play.persistance.mapper;

import org.mapstruct.Named;

public class StatusMapper {

    @Named("stringToBoolean")
    public static Boolean stringToBoolean(String estado) {
        if(estado == null)return false;
        if (estado.equalsIgnoreCase("D"))return true;
        return false;
    }
    @Named("booleanToString")
        public static String booleanToString(Boolean estado){
            if(estado == null)return null;
            if (estado) return "D";
            return "";
        }

}
