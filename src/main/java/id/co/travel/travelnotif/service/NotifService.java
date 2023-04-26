package id.co.travel.travelnotif.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.travel.travelnotif.model.Notif;
import id.co.travel.travelnotif.repository.dao.NotifHistoryRepository;
import id.co.travel.travelnotif.repository.model.NotifHistory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotifService implements INotifService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotifService.class);

    @Autowired
    private NotifHistoryRepository notifHistoryRepository;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public String sendNotif(String input) throws Exception {
        LOGGER.info("Send Notif");

        //**1. mapping input
        Notif notif = objectMapper.readValue(input, Notif.class);

        //**2. Send notif email
        sendNotifEmail(notif);

        //**3. Write Historical email
        NotifHistory notifHistory = new NotifHistory();
        notifHistory.setTitle(notif.getTitle());
        notifHistory.setDescription(notif.getDescription());
        notifHistory.setBody(notif.getBody());
        notifHistory.setEmail(notif.getEmail());
        notifHistoryRepository.save(notifHistory);
        LOGGER.info("Success");

        //**4. Return Output
        return "Success";
    }

    private void sendNotifEmail(Notif notif) {
        //Dummy send notif via email
        //success
    }
}
