package id.co.travel.travelnotif.model;

import lombok.Data;

@Data
public class Notif {
    private String title;
    private String description;
    private String body;
    private String email;
}
