package skiti.cfwz.mareu.service;

import org.joda.time.LocalTime;

import java.util.List;

import skiti.cfwz.mareu.model.Meeting;
import skiti.cfwz.mareu.model.Salle;

public interface MeetingApiService {

    List<Meeting> getMeetings();

    void deleteMeetings(Meeting meeting);

    void addMeeting(Meeting meeting);

    List<Salle> getSalles();

    void sortDateMeetings(LocalTime minDate, LocalTime maxDate);

    void sortSalleMeetings(String SalleName);

    void resetFilter();
}
