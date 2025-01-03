package study.demo.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class S3ServiceImpl implements S3Service{
////    @Value("${cloud.aws.s3.bucket}")
////    private String bucket;
////
////    private final AmazonS3 amazonS3;
////    private final String DIR_NAME = "test/";
////
////
////
////
////
////
////    public List<String> uploadFiles(List<MultipartFile> files, String yyyyMm) throws IOException {
////        List<String> fileUrls = new ArrayList<>();
////
////
////
////        for (MultipartFile file : files) {
////            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
////            String yyyy =yyyyMm.substring(0,4);
////            String mm = yyyyMm.substring(4,6);
////            String filePath = DIR_NAME + yyyy + "/" + mm + "/" + fileName;
////
////            ObjectMetadata metadata = new ObjectMetadata();
////            metadata.setContentLength(file.getSize());
////            metadata.setContentType(file.getContentType());
////            amazonS3.putObject(new PutObjectRequest(bucket, filePath, file.getInputStream(), metadata));
////
////            fileUrls.add(amazonS3.getUrl(bucket, filePath).toString());
////        }
////        return fileUrls;
//    }
}
