package study.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import study.demo.service.S3Service;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/s3")
@RequiredArgsConstructor
public class S3Controller {
//    private final S3Service s3Service;
//
//    @PostMapping(path = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public ResponseEntity<List<String>> uploadFiles(
//            @RequestParam("files") List<MultipartFile> files,
//            @RequestParam("yyyyMm") String yyyyMm
//    ) {
//        try {
//            List<String> fileUrls = s3Service.uploadFiles(files, yyyyMm);
//            return new ResponseEntity<>(fileUrls, HttpStatus.OK);
//        } catch (IOException e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}

