package id.co.travel.travelnotif.kafka.consumer;

import id.co.travel.travelnotif.service.INotifService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotifConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotifConsumer.class);

    @Autowired
    private INotifService iNotifService;

    @KafkaListener(
            topics = "notif",
            groupId = "travel.notif.general",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void sendNotif(String input) {
        LOGGER.info("Record Received Send Notif : " + input);
        try {
            iNotifService.sendNotif(input);
        } catch (Exception e) {
            LOGGER.error("Exception Send Notif : ", e);
        }
    }
}
