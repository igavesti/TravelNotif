package id.co.travel.travelnotif.repository.dao;

import id.co.travel.travelnotif.repository.model.NotifHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifHistoryRepository extends JpaRepository<NotifHistory, Integer> {
}
