package Exercises.E5_D13.No_1;

import lombok.Data;

@Data
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta =ds.geteta();
    }
}
