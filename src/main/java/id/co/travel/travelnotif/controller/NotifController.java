package id.co.travel.travelnotif.controller;

import id.co.travel.travelnotif.service.INotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notif")
public class NotifController {
    @Autowired
    private INotifService iNotifService;

    @PostMapping()
    public ResponseEntity<Object> sendNotif() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(iNotifService.sendNotif());
    }
}
