package my.diary.dailydiary.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import my.diary.dailydiary.dto.CreateDiary;
import my.diary.dailydiary.dto.Diary;
import my.diary.dailydiary.utils.response.DiaryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;

@Controller
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class DiaryController {

    private Diary diary;

    @PostMapping
    public ResponseEntity<DiaryResponse> createDiary (CreateDiary diaryInput) {

//        TO DO: create diary
        return DiaryResponse.setResponse("Success", 0000);
    }
}
