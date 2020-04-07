package edu.pitt.api.Mongo.controllers;

import edu.pitt.api.Mongo.models.Accidents;
import edu.pitt.api.Mongo.repository.AccidentsRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/accidents")
    public class AccidentsController
    {
     @Autowired
     private AccidentsRepository accidentsRepository;
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public List<Accidents> getAllAccidents() {
            return accidentsRepository.findAll();
        }

        @RequestMapping(value = "/{id}",method = RequestMethod.GET)
        public Accidents getAccidentsById(@PathVariable("id") String id)
        {
            return accidentsRepository.findBy_id(id);
        }

    }
