package id.co.travel.travelnotif.service;

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

    @Override
    public String sendNotif() {
        LOGGER.info("Send Notif");
        sendNotifEmail();
        NotifHistory notifHistory = new NotifHistory();
        notifHistory.setTitle("Title");
        notifHistory.setDescription("Description");
        notifHistory.setBody("Body");
        notifHistory.setEmail("Email");
        notifHistoryRepository.save(notifHistory);
        return "Success";
    }

    private void sendNotifEmail(){
        //Dummy send notif via email
        //success
    }
}
