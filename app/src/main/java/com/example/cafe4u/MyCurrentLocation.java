package com.example.cafe4u;

public class MyCurrentLocation {
    private double latitute;
    private double longtitute;

    public double getLatitute() {
        return latitute;
    }
    public void setLatitute(double latitute) {
        this.latitute = latitute;
    }

    public double getLongtitute() {
        return longtitute;
    }

    public void setLongtitute(double longtitute) {
        this.longtitute = longtitute;
    }

    public MyCurrentLocation(double latitute, double longtitute) {
        this.latitute=latitute;
        this.longtitute=longtitute;
    }
}
