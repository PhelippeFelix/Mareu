package skiti.cfwz.mareu.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import skiti.cfwz.mareu.model.Meeting;

/**
 * Created by Skiti on 26/09/2019
 */

abstract class DummyMeetingGenerator {
    private static List<Meeting> DUMMY_MEETING = Arrays.asList(
            );
    static List<Meeting> generateMeetings() {
        return new ArrayList<Meeting>(DUMMY_MEETING);
    }
}
