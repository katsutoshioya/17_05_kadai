public class Word {
    public String word;
    public String meaning;

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }
    public String getWord() {
        return word;
    }
    public void setWords(String word){
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
