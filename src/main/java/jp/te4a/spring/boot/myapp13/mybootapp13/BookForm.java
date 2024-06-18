package jp.te4a.spring.boot.myapp13.mybootapp13;

import jakarta.annotation.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jp.te4a.spring.boot.myapp13.mybootapp13.TestValid.Valid;
import jp.te4a.spring.boot.myapp13.mybootapp13.TestValid2.Writter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class BookForm {
private Integer id ;
 @NotNull
 @Size(min = 3)
 @Valid(param="abc")
 private String title;
 @Size(min = 3, max = 20)
 @Writter(ok = "東北タロウ")
 private String writter;
 private String publisher;
 @Min(0)
 private Integer price;
}

