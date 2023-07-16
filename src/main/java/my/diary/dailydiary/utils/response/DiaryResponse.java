package my.diary.dailydiary.utils.response;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Builder
public class DiaryResponse {

    static public ResponseEntity setResponse(String errorMsg, int errorCode) {
        String result = errorCode + " : " + errorMsg;
        ResponseEntity response = new ResponseEntity<>(result, HttpStatus.OK);
        return response;
    }
}
