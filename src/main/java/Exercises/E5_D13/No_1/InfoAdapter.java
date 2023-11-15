package Exercises.E5_D13.No_1;

import lombok.Data;

@Data
public class InfoAdapter extends UserData {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return super.getNomeCompleto();
    }

    @Override
    public int getEta() {
        return super.getEta();
    }
}
