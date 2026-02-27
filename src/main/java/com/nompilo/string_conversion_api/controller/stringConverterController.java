package com.nompilo.string_conversion_api.controller;

import com.nompilo.string_conversion_api.dto.StringRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/string")
public class stringConverterController {

    @PostMapping("/to-characters")
    public Map<String, List<String>> toSortedCharacters(@RequestBody StringRequest request){
        char[] toCharacters = request.getData().toCharArray();
        Arrays.sort(toCharacters);

        List<String> charList = new ArrayList<>();
        for(char c: toCharacters){
            charList.add(String.valueOf(c));
        }

        Map<String,List<String>> response = new HashMap<>();
        response.put("word",charList);

        return response;
    }


}
