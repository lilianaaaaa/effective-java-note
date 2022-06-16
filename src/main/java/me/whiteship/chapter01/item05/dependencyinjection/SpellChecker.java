package me.whiteship.chapter01.item05.dependencyinjection;

import me.whiteship.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;//Dictionary가 interface라면 아래의 모든 코드 재사용 가능

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    //Factory로 가져온다 매개변수 없이 return만 하기때문에 Supplier로 쓸수 있음
    public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }

    public boolean isValid(String word) {
        // TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // TODO 여기 SpellChecker 코드
        return dictionary.closeWordsTo(typo);
    }
}
