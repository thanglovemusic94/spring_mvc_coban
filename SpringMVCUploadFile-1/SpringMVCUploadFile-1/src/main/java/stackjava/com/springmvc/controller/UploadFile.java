package stackjava.com.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadFile {
	@GetMapping("/uploadFile/{image:.+}")
	public byte[] index(@PathVariable("image") String image) throws IOException {
		String path = "C:/files";
		System.out.println("image" +  image);
		Path url = Paths.get(path +File.separator+ image);
		
		System.out.println("url:" + url);
		String array[] = url.toString().split("\\.");
		System.out.println(Arrays.toString(array));
		System.out.println(array[array.length-1].toString());
		
		return Files.readAllBytes(url);
	}
}
