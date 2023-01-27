package com.example.library.Service;
import com.example.library.Enums.CardStatus;
import com.example.library.Models.Card;
import com.example.library.Models.Student;
import com.example.library.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;
    public Card createCard(Student student){
        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student);
        return newCard;
    }
    public Card findById(int cardId){
        return cardRepository.findById(cardId).get();
    }
}
