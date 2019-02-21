import enums.OptionType;

import java.util.ArrayList;

public class Options {
    private ArrayList<SingleOption> options;

    public Options() {
        options = new ArrayList<>();
    }

    public void add(SingleOption option) {
        options.add(option);
    }

    public ArrayList<SingleOption> getOptions() {
        return this.options;
    }


}
