package my.diary.dailydiary.dto;

import lombok.*;

import java.sql.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateDiary {

    private String title;

    private Date date;

    private String contents;
}
