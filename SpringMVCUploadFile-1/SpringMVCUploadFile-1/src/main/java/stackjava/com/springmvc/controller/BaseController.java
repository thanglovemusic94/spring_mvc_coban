package stackjava.com.springmvc.controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import stackjava.com.springmvc.model.MyFile;

@Controller
public class BaseController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("myFile", new MyFile());
		return "index";
	}

	@PostMapping("/uploadFile")
	public String uploadFile(MyFile myFile, Model model) {
		model.addAttribute("message", "upload success");
		model.addAttribute("description", myFile.getDescription());
		try {
			
			MultipartFile multipartFile = myFile.getMultipartFile();
			String fileName = multipartFile.getOriginalFilename();
			
			System.out.println("fileName" + fileName);
			
			String path = "C:/files";
			FileUtils.forceMkdir(new File(path));
			
			File file = new File(path,fileName);
			multipartFile.transferTo(file);
			model.addAttribute("fileName", fileName);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", "upload failed");
		}
		return "result";
	}
	
	

}
