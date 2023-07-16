package my.diary.dailydiary.db;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Entity
@Table(name="diary")
public class DiaryEntity {

    @Id
    private Long diaryId;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;


    @Column(name = "contents")
    private String contents;

}
