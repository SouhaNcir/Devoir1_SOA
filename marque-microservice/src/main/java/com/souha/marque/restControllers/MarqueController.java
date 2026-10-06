package com.souha.marque.restControllers;

import com.souha.marque.dto.APIResponseDto;
import com.souha.marque.dto.MarqueDto;
import com.souha.marque.service.MarqueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
@RestController
@RequestMapping("/api/marques")
@AllArgsConstructor
public class MarqueController {
    private MarqueService marqueService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getMarqueById(@PathVariable("id")Long id)
    {
        return new ResponseEntity<APIResponseDto>(marqueService.getMarqueById(id), HttpStatus.OK);
    }
}
