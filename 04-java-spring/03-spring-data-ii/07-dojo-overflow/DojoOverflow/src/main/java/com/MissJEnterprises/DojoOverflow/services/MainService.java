package com.MissJEnterprises.DojoOverflow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.MissJEnterprises.DojoOverflow.models.Answer;
import com.MissJEnterprises.DojoOverflow.models.NewQuestion;
import com.MissJEnterprises.DojoOverflow.models.Question;
import com.MissJEnterprises.DojoOverflow.models.Tag;
import com.MissJEnterprises.DojoOverflow.repositories.AnswerRepository;
import com.MissJEnterprises.DojoOverflow.repositories.QuestionRepository;
import com.MissJEnterprises.DojoOverflow.repositories.TagRepository;

@Service
public class MainService {

	private QuestionRepository qRepo;
	private TagRepository tRepo;
	private AnswerRepository aRepo;
	public MainService(QuestionRepository qRepo, AnswerRepository aRepo, TagRepository tRepo) {
		this.qRepo = qRepo;
		this.tRepo = tRepo;
		this.aRepo = aRepo;
	}
	public List<Question> getQuestions() {
		return this.qRepo.findAll();
	}
	
	public Question getQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
		
	}
	

	public void createQuestion(NewQuestion question) {
		// TODO: make a real question here
		List<Tag> questionsTags = new ArrayList<Tag>();
		for(String subject: question.splitTags()) {
			Tag tag = this.tRepo.findBySubject(subject).orElse(null);
			if(tag == null) {
				tag = new Tag(subject);
				this.tRepo.save(tag);
			}
			// prevent dupe tags
			if(!questionsTags.contains(tag))
				questionsTags.add(tag);
		}
		Question newQuestion = new Question(question.getQuestion(), questionsTags);
		this.qRepo.save(newQuestion);
	}
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
}
