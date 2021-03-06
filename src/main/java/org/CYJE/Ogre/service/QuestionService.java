package org.CYJE.Ogre.service;

import java.util.List;

import org.CYJE.Ogre.entity.Question;

public interface QuestionService {

	public List<Question> getQuestion();
	public Question getReponse(int id);
	public void saveReponse(Question reponses);
	public void deleteReponse(int id);

    Question getReponse(String email);
}
