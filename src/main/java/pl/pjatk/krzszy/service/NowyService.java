package pl.pjatk.krzszy.service;

import org.springframework.stereotype.Service;
import pl.pjatk.krzszy.domain.Homework;

@Service
public class NowyService {
    public String getHomeworkForVariable(int id) {
        return "Homework number: " + id;
    }
    public String getHomeworkForParam(int id) {
        return "Homework number: " + id;
    }
    public String makeHomework(Homework homework){
        return homework.toString() + "\ncreated";
    }
    public String changeHomework(int id, Homework homework) {
        return homework.toString() + "\nupdated";
    }
}
