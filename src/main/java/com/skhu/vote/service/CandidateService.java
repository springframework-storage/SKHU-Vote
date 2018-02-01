package com.skhu.vote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skhu.vote.domain.CANDIDATE;
import com.skhu.vote.model.CandidateModel;
import com.skhu.vote.repository.CandidateRepository;
import com.skhu.vote.repository.VoteInfoRepository;

@Service
public class CandidateService {

	@Autowired
	CandidateRepository candidateRepo;
	@Autowired
	VoteInfoRepository voteInfoRepo;

	public List<CANDIDATE> findAll() {
		return candidateRepo.findAll();
	}

	public CANDIDATE insertCandidate(CandidateModel c) {
		CANDIDATE candidate = new CANDIDATE();
		candidate.setCampName(c.getCampName());
		candidate.setLeaderName(c.getLeaderName());
		candidate.setLeaderDeptName(c.getLeaderDepName());
		candidate.setSubLeaderName(c.getSubLeaderName());
		candidate.setSubLeaderDeptName(c.getSubLeaderDepName());
		candidate.setPhoto(c.getPhoto());
		candidate.setVoteInfo(voteInfoRepo.findAll());
	}

}