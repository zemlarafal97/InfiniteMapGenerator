import enums.OptionType;

public class SingleOption {
    private OptionType optionType;

    public OptionType getOptionType() {
        return optionType;
    }

    public void setOptionType(OptionType optionType) {
        this.optionType = optionType;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    private double probability;

    SingleOption(OptionType optionType, double probability) {
        this.optionType = optionType;
        this.probability = probability;
    }
}
